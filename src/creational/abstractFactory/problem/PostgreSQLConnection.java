package creational.abstractFactory.problem;

public class PostgreSQLConnection {

    public void open() {
        System.out.println("Opening PostgreSQL connection with specific PostgreSQL parameters");
    }

    public void close() {
        System.out.println("Closing PostgreSQL connection");
    }
}