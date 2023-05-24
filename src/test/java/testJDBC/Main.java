package testJDBC;

/**
 * @Description:
 * @Date:2023-05-05-9:34
 * @author:Esan
 */
import java.sql.*;
public class Main {
    public static final String username="root";
    public static final String password="root";
    public static final String url="jdbc:mysql://127.0.0.1/ssm?serverTimezone=GMT%2B8&characterEncoding=utf-8&useSSL=false";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from buscontent");
            while(resultSet.next()){
                System.out.println(resultSet.getString("bctype"));
                System.out.println(resultSet.getString("bcvalue"));

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
