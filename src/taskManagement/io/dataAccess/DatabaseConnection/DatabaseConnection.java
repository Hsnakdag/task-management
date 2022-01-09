package taskManagement.io.dataAccess.DatabaseConnection;

import java.sql.*;

public class DatabaseConnection {

    Connection con    = null;

    public DatabaseConnection() {
    }

    public void connect(){
       try{
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
       }catch (Exception e){
           e.printStackTrace();
           System.out.println("Error trace in :" + e.getMessage());
       }
        String conUrl = "jdbc:sqlserver://DESKTOP-D7HR9GB\\SQLEXPRESS;databaseName=TaskManagementSystem; integratedSecurity=true;";
        try{

            this.con = DriverManager.getConnection(conUrl);
            System.out.println("Connected");
//            String s = "insert into Users values(?,?,?,?,?,?,?,?,?,?) ";
//            PreparedStatement statement = con.prepareStatement(s);
//            statement.setInt(1,(int)Math.random());
//            statement.setString(2,"asdfad");

        }catch(Exception exception){
            System.out.println("Failed");
            exception.printStackTrace();
        }
    }
    public void disconnect(){


    }
}
