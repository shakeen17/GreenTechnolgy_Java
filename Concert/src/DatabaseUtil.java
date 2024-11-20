import java.sql.*;
public class DatabaseUtil {
	private static final String URL = "jdbc:mysql://localhost:3306/concert";
    private static final String USER = "root";
    private static final String PASSWORD = "Shakeen@20"; 

    public static Connection getConnection() {
    	try {
    		Connection con = DriverManager.getConnection(URL,USER,PASSWORD);
    		System.out.println("Connection to the database was successfull!...");
    		return con;
    	}
    	catch(SQLException e) {
    		System.out.println("Failed to connect to the database...Error:" + e.getMessage());
    		return null;
    	}
    }
}
