package structural.flyweight.resolve;

public class Client {

    public static void main(String[] args) {
        Book effectiveJava1 = Bookshelf.getBook("Effective Java");
        effectiveJava1.read();

        Book effectiveJava2 = Bookshelf.getBook("Effective Java");
        effectiveJava2.read();

        Book cleanCode = Bookshelf.getBook("Clean Code");
        cleanCode.read();

        System.out.println(
            effectiveJava1 == effectiveJava2 ? "Same book for 'Effective Java'." : "Different books for 'Effective "
                + "Java'"
        );
    }
}
