package structural.decorator.problem.coffee;

// 문제: 모든 조합을 클래스로 만들어야 하는 클래스 폭발 문제
public abstract class Coffee {
    
    public abstract String getDescription();
    public abstract double getCost();
}

// 기본 커피
class SimpleCoffee extends Coffee {
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }
    
    @Override
    public double getCost() {
        return 5.0;
    }
}

// 우유 추가 커피
class CoffeeWithMilk extends Coffee {
    @Override
    public String getDescription() {
        return "Coffee with Milk";
    }
    
    @Override
    public double getCost() {
        return 5.0 + 1.5;
    }
}

// 설탕 추가 커피
class CoffeeWithSugar extends Coffee {
    @Override
    public String getDescription() {
        return "Coffee with Sugar";
    }
    
    @Override
    public double getCost() {
        return 5.0 + 0.5;
    }
}

// 우유와 설탕 추가 커피 - 조합이 증가할 때마다 새 클래스 필요
class CoffeeWithMilkAndSugar extends Coffee {
    @Override
    public String getDescription() {
        return "Coffee with Milk and Sugar";
    }
    
    @Override
    public double getCost() {
        return 5.0 + 1.5 + 0.5;
    }
}

// 더 많은 옵션이 추가될 때마다 클래스 수가 기하급수적으로 증가
// 예: 휘핑크림, 바닐라 시럽, 캐러멜 등이 추가되면...
// CoffeeWithWhippedCream, CoffeeWithVanilla, CoffeeWithCaramel,
// CoffeeWithMilkAndWhippedCream, CoffeeWithSugarAndVanilla, ...
// 2^n 개의 클래스가 필요함!