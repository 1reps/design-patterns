package creational.builder.problem.http;

import java.util.HashMap;
import java.util.Map;

public class HttpRequest {

    private String method;
    private String url;
    private Map<String, String> headers;
    private Map<String, String> parameters;
    private String body;

    // 복잡한 생성자 - 매개변수가 많고 순서를 기억하기 어려움
    public HttpRequest(String method, String url, Map<String, String> headers, 
                      Map<String, String> parameters, String body) {
        this.method = method;
        this.url = url;
        this.headers = headers != null ? headers : new HashMap<>();
        this.parameters = parameters != null ? parameters : new HashMap<>();
        this.body = body;
    }

    // 부분적 생성을 위한 여러 생성자들
    public HttpRequest(String method, String url) {
        this(method, url, null, null, null);
    }

    public HttpRequest(String method, String url, Map<String, String> headers) {
        this(method, url, headers, null, null);
    }

    // setter 메소드들 - 객체가 불완전한 상태로 존재할 수 있음
    public void setMethod(String method) {
        this.method = method;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public void addHeader(String key, String value) {
        if (this.headers == null) {
            this.headers = new HashMap<>();
        }
        this.headers.put(key, value);
    }

    public void setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
    }

    public void addParameter(String key, String value) {
        if (this.parameters == null) {
            this.parameters = new HashMap<>();
        }
        this.parameters.put(key, value);
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "HttpRequest{" +
            "method='" + method + '\'' +
            ", url='" + url + '\'' +
            ", headers=" + headers +
            ", parameters=" + parameters +
            ", body='" + body + '\'' +
            '}';
    }
}