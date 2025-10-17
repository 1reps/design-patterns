package creational.abstractFactory.resolve;

public class DatabaseClient {

    private Connection connection;
    private Command command;
    private ResultSet resultSet;

    public DatabaseClient(DatabaseFactory factory) {
        this.connection = factory.createConnection();
        this.command = factory.createCommand();
        this.resultSet = factory.createResultSet();
    }

    public void perform() {
        connection.open();
        command.execute("SELECT * FROM users");
        resultSet.getResults();
        connection.close();
    }
}
