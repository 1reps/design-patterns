package creational.abstractFactory.problem;

public class Client {

    public static void main(String[] args) {
        // Problem: Client code is tightly coupled to specific database implementations
        
        System.out.println("=== Using MySQL ===");
        DatabaseClient mysqlClient = new DatabaseClient("mysql");
        mysqlClient.perform();
        
        System.out.println("\n=== Using PostgreSQL ===");
        DatabaseClient postgresqlClient = new DatabaseClient("postgresql");
        postgresqlClient.perform();
        
        // Problem: Adding a new database type requires modifying DatabaseClient
        // Problem: Client needs to know about all concrete implementations
        // Problem: Difficult to ensure consistency across related objects
    }
}