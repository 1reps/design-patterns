package creational.abstractFactory.resolve;

public class Client {

    public static void main(String[] args) {
        DatabaseFactory mysqlFactory = new MySQLFactory();
        DatabaseClient mysqlClient = new DatabaseClient(mysqlFactory);
        mysqlClient.perform();

        PostgreSQLFactory postgreFactory = new PostgreSQLFactory();
        DatabaseClient postgreClient = new DatabaseClient(postgreFactory);
        postgreClient.perform();
    }
}
