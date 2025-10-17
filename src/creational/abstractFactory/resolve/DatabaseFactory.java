package creational.abstractFactory.resolve;

interface DatabaseFactory {

    Connection createConnection();

    Command createCommand();

    ResultSet createResultSet();

}
