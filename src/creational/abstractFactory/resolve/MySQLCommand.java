package creational.abstractFactory.resolve;

public class MySQLCommand implements Command {

    @Override
    public void execute(String query) {
        System.out.println("Executing MySQL query: " + query);
    }
}
