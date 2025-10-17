package creational.abstractFactory.resolve;

public class PostgreSQLResultSet implements ResultSet {

    @Override
    public void getResults() {
        System.out.println("Getting results from PostgreSQL database");
    }
}
