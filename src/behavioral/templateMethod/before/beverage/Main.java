package behavioral.templateMethod.before.beverage;

public class Main {

    public static void main(String[] args) {
        BeverageMaker maker = new BeverageMaker();
        maker.prepare("TEA");
        maker.prepare("COFFEE");
    }
}

