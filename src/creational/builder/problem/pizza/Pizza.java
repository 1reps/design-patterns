package creational.builder.problem.pizza;

class Pizza {

    private String dough;
    private String sauce;
    private String topping;

    // 복잡한 생성자 - 매개변수 순서와 의미를 기억하기 어려움
    public Pizza(String dough, String sauce, String topping) {
        this.dough = dough;
        this.sauce = sauce;
        this.topping = topping;
    }

    // 부분적 생성을 위한 여러 생성자들 - 생성자 폭발 문제
    public Pizza(String dough) {
        this.dough = dough;
    }

    public Pizza(String dough, String sauce) {
        this.dough = dough;
        this.sauce = sauce;
    }

    // setter 메소드들 - 객체가 완전하지 않은 상태로 존재할 수 있음
    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "Pizza{" +
            "dough='" + dough + '\'' +
            ", sauce='" + sauce + '\'' +
            ", topping='" + topping + '\'' +
            '}';
    }
}