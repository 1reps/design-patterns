package behavioral.templateMethod.before.beverage;

public class BeverageMaker {

    public void prepare(String type) {
        boilWater();
        if ("TEA".equals(type)) {
            brewTea();
        } else if ("COFFEE".equals(type)) {
            brewCoffee();
        }
        pourInCup();
        if ("TEA".equals(type)) {
            addLemon();
        } else if ("COFFEE".equals(type)) {
            addSugarAndMilk();
        }
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    private void brewTea() {
        System.out.println("Steeping the tea");
    }

    private void brewCoffee() {
        System.out.println("Dripping coffee through filter");
    }

    private void addLemon() {
        System.out.println("Adding lemon");
    }

    private void addSugarAndMilk() {
        System.out.println("Adding sugar and milk");
    }
}

