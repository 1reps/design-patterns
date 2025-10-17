package creational.abstractFactory.problem;

public class MySQLCommand {

    public void execute(String sql) {
        System.out.println("Executing MySQL-specific command: " + sql);
        System.out.println("Using MySQL syntax and optimizations");
    }
}