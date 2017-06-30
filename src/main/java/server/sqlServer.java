package server;


import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 * Created by User on 30.06.17.
 */
public class sqlServer {
    public static final String URL = "jdbc:mysql://localhost:3306/mydbtest?autoReconnect=true&useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC";
    public static final String USER = "root";
    public static final String PASSWORD = "root";


    public static void main(String[] args) {

        Connection connection;
        Driver driver;

        try {

            driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);

            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            if (!connection.isClosed()) {
                System.out.println("V base");
            }
            connection.close();
            if (connection.isClosed()) {
                System.out.println("Vishel is base");
            }
        }catch (SQLException e){
            System.out.println("ошибка драйвера SQL");
            return;
        }

    }
}
