package jdbc;

import java.sql.*;
import javax.sql.*;
import javax.sql.rowset.*;

public class JDBCDemo {

    public static void main(String[] args) throws Exception {
        Driver driver;
        Class.forName("sun.jdbc.odbc.jdbcodbcDriver");
        Class.forName("mydql.jdbc.mysqldriver");
        Connection connection = DriverManager.getConnection("url", "username", "password");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from employees");
        while (resultSet.next()) {
            System.out.println(resultSet);
        }
        connection.close();
    }
}
