package creational.abstractFactory.problem;

public class PostgreSQLCommand {

    public void execute(String sql) {
        System.out.println("Executing PostgreSQL-specific command: " + sql);
        System.out.println("Using PostgreSQL syntax and optimizations");
    }
}