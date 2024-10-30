import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseUtil {
    private static final String URL = "jdbc:mysql://localhost:3306/hospital_management";
    private static final String USER = "your_username"; //replace with MySQL username
    private static final String PASSWORD = "your_password"; //replace with MySQL password


    public static Connection getConnection() {

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        }
        catch (SQLException e) {
            e.printStackTrace();
        
        }
        return connection;
    }
}