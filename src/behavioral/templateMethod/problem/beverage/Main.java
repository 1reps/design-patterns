package behavioral.templateMethod.problem.beverage;

public class Main {

    public static void main(String[] args) {
        BeverageMaker maker = new BeverageMaker();
        maker.prepare("TEA");
        maker.prepare("COFFEE");
    }
}
