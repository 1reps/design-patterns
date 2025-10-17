package creational.abstractFactory.problem;

public class PostgreSQLResultSet {

    public void getResults() {
        System.out.println("Fetching results using PostgreSQL-specific result set handling");
        System.out.println("Results: [user1, user2, user3] (PostgreSQL format)");
    }
}