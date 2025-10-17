package creational.abstractFactory.problem;

// Problem: Client directly depends on concrete database classes
// Making it difficult to switch between different database vendors
public class DatabaseClient {
    
    private String databaseType;

    public DatabaseClient(String databaseType) {
        this.databaseType = databaseType;
    }

    public void performMySQLOperations() {
        // Hardcoded MySQL-specific implementations
        MySQLConnection mysqlConnection = new MySQLConnection();
        MySQLCommand mysqlCommand = new MySQLCommand();
        MySQLResultSet mysqlResultSet = new MySQLResultSet();
        
        mysqlConnection.open();
        mysqlCommand.execute("SELECT * FROM users");
        mysqlResultSet.getResults();
        mysqlConnection.close();
        
        System.out.println("MySQL operations completed");
    }

    public void performPostgreSQLOperations() {
        // Hardcoded PostgreSQL-specific implementations
        PostgreSQLConnection postgreConnection = new PostgreSQLConnection();
        PostgreSQLCommand postgreCommand = new PostgreSQLCommand();
        PostgreSQLResultSet postgreResultSet = new PostgreSQLResultSet();
        
        postgreConnection.open();
        postgreCommand.execute("SELECT * FROM users");
        postgreResultSet.getResults();
        postgreConnection.close();
        
        System.out.println("PostgreSQL operations completed");
    }

    // Problem: Client needs to know about all database types
    public void perform() {
        if ("mysql".equals(databaseType)) {
            performMySQLOperations();
        } else if ("postgresql".equals(databaseType)) {
            performPostgreSQLOperations();
        } else {
            throw new IllegalArgumentException("Unsupported database type: " + databaseType);
        }
    }
}