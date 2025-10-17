package creational.abstractFactory.problem;

public class MySQLConnection {

    public void open() {
        System.out.println("Opening MySQL connection with specific MySQL parameters");
    }

    public void close() {
        System.out.println("Closing MySQL connection");
    }
}