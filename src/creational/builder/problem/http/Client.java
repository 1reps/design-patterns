package creational.builder.problem.http;

import java.util.HashMap;
import java.util.Map;

public class Client {

    public static void main(String[] args) {
        // 문제 1: 복잡한 생성자 - 매개변수가 많고 순서를 혼동하기 쉬움
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        headers.put("Authorization", "Bearer token123");

        Map<String, String> params = new HashMap<>();
        params.put("userId", "123");
        params.put("limit", "10");

        HttpRequest request1 = new HttpRequest("POST", "https://api.example.com/users", 
                                             headers, params, "{\"name\":\"John\"}");
        System.out.println(request1);

        // 문제 2: 실수로 매개변수 순서를 바꿀 수 있음
        // headers와 parameters 위치를 바꿔서 전달하는 실수
        HttpRequest wrongOrder = new HttpRequest("GET", "https://api.example.com/users", 
                                                params, headers, null); // 순서 바뀜
        System.out.println("Wrong order: " + wrongOrder);

        // 문제 3: 단계적으로 생성해야 하는 경우 setter 남용
        HttpRequest stepByStep = new HttpRequest("GET", "https://api.example.com/data");
        System.out.println("Initial: " + stepByStep);

        // 객체가 불완전한 상태로 존재
        stepByStep.addHeader("Accept", "application/json");
        stepByStep.addHeader("User-Agent", "MyApp/1.0");
        stepByStep.addParameter("page", "1");
        stepByStep.addParameter("size", "20");

        System.out.println("After setup: " + stepByStep);

        // 문제 4: null 체크와 초기화 로직이 복잡함
        HttpRequest request2 = new HttpRequest("PUT", "https://api.example.com/update");
        // headers가 null이면 addHeader에서 새로 생성해야 함
        request2.addHeader("Content-Type", "application/xml");
        request2.setBody("<data>content</data>");

        System.out.println("PUT request: " + request2);
    }
}