package jdbc;

import javax.sql.RowSet;
import java.lang.annotation.RetentionPolicy;
import java.sql.*;

/**
 * @author rokib.ahmed
 * @since 10/25/23
 */
public class AllJDBCInterfaceAndClass {

    public static void main(String[] args) {

        /**
         * jdbc api interfaces
         * */
        Driver driver;

        Connection connection;

        Statement statement;

        PreparedStatement preparedStatement;

        CallableStatement callableStatement;

        ResultSet resultSet;

        ResultSetMetaData resultSetMetaData;

        DatabaseMetaData databaseMetaData;

        RowSet rowSet;

        Blob blob;

        Clob clob;



        /**
         * jdbc api classes
         * */
        DriverManager manager;

        Types types;



    }

}
