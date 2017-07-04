package server;


import java.sql.*;


/**
 * Created by User on 30.06.17.
 */
public class sqlServer {
    public static final String URL = "jdbc:mysql://localhost:3306/mydbtest?autoReconnect=true&useSSL=false&useLegacyDatetimeCode=false&serverTimezone=UTC";
    public static final String USER = "root";
    public static final String PASSWORD = "root";

    public static void main(String[] args) {
        try {
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
        }catch (SQLException e){
            System.out.println("ошибка драйвера SQL");
            return;
        }

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement()){
            System.out.println(connection.isClosed());
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
