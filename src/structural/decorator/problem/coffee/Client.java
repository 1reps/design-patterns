package structural.decorator.problem.coffee;

public class Client {

    public static void main(String[] args) {
        // 문제 1: 각 조합마다 별도의 클래스가 필요
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println(simpleCoffee.getDescription() + " = $" + simpleCoffee.getCost());

        Coffee coffeeWithMilk = new CoffeeWithMilk();
        System.out.println(coffeeWithMilk.getDescription() + " = $" + coffeeWithMilk.getCost());

        Coffee coffeeWithSugar = new CoffeeWithSugar();
        System.out.println(coffeeWithSugar.getDescription() + " = $" + coffeeWithSugar.getCost());

        Coffee coffeeWithMilkAndSugar = new CoffeeWithMilkAndSugar();
        System.out.println(coffeeWithMilkAndSugar.getDescription() + " = $" + coffeeWithMilkAndSugar.getCost());

        // 문제 2: 새로운 옵션(휘핑크림, 바닐라 등) 추가 시 클래스 폭발
        // CoffeeWithWhippedCream, CoffeeWithMilkAndWhippedCream, 
        // CoffeeWithSugarAndWhippedCream, CoffeeWithMilkAndSugarAndWhippedCream 등
        // 모든 조합에 대한 클래스를 만들어야 함

        // 문제 3: 코드 중복
        // 각 클래스에서 기본 가격(5.0)과 추가 비용 계산 로직이 중복됨
        
        // 문제 4: 동적 기능 추가 불가
        // 런타임에 옵션을 추가/제거할 수 없음
        // 컴파일 타임에 모든 조합이 결정되어야 함
        
        System.out.println("\n=== 문제점 요약 ===");
        System.out.println("1. 클래스 폭발: n개 옵션 시 2^n개 클래스 필요");
        System.out.println("2. 코드 중복: 기본 로직이 각 클래스에서 반복됨");
        System.out.println("3. 유연성 부족: 런타임에 기능 추가/제거 불가");
        System.out.println("4. 유지보수 어려움: 새 옵션 추가 시 모든 조합 클래스 생성 필요");
    }
}