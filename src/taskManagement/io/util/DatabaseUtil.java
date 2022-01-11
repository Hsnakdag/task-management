package taskManagement.io.util;

import java.sql.*;

public class DatabaseUtil {
    private static Connection connection = null;
    public static  String     host;
    public static  String     databaseName;

    private DatabaseUtil() {

    }

    // database connection
    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            String conUrl =   "jdbc:sqlserver://" + host + ";"
                + "databaseName=" + databaseName + ";"
                + "integratedSecurity=true";

            connection = DriverManager.getConnection(conUrl);
            System.out.println("Connected to the database :" + databaseName);
        }

        return connection;
    }

    public static void disconnect() throws SQLException
    {
        if (connection != null)
        try {
            connection.close();
            System.out.println();
            System.out.println("Disconnected from " + databaseName);
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }
}
//            String s = "insert into Users values(?,?,?,?,?,?,?,?,?,?) ";
//            PreparedStatement statement = con.prepareStatement(s);
//            statement.setInt(1,(int)Math.random());
//            statement.setString(2,"asdfad");