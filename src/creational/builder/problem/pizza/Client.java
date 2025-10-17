package creational.builder.problem.pizza;

public class Client {

    public static void main(String[] args) {
        // 문제 1: 매개변수 순서를 기억하기 어려움
        // dough, sauce, topping 순서를 혼동하기 쉬움
        Pizza pizza1 = new Pizza("Thin Crust", "Tomato", "Cheese");
        System.out.println(pizza1);

        // 문제 2: 실수로 매개변수 순서를 바꿔서 전달할 수 있음
        Pizza wrongOrder = new Pizza("Tomato", "Thin Crust", "Cheese"); // sauce와 dough 순서 바뀜
        System.out.println("Wrong order: " + wrongOrder);

        // 문제 3: 부분적으로 생성하려면 setter를 사용해야 함
        // 객체가 완전하지 않은 상태로 존재
        Pizza incompletePizza = new Pizza("Regular");
        System.out.println("Incomplete: " + incompletePizza); // sauce와 topping이 null

        // 나중에 setter로 설정
        incompletePizza.setSauce("Pesto");
        incompletePizza.setTopping("Vegetables");
        System.out.println("Completed later: " + incompletePizza);

        // 문제 4: 조건부 생성이 복잡함
        String orderType = "Veggie";
        Pizza customPizza = new Pizza("Regular");
        customPizza.setSauce("Pesto");
        
        if ("Veggie".equals(orderType)) {
            customPizza.setTopping("Vegetables");
        } else {
            customPizza.setTopping("Pepperoni");
        }
        
        System.out.println("Custom: " + customPizza);
    }
}