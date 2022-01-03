package DatabaseConnection;

import java.sql.*;
import java.util.Scanner;

public class DatabaseConnection {

    public DatabaseConnection() {
    }

    public void connect(){
        Connection con    = null;
        String     conUrl = "jdbcsqlserver://localhost:50869;databaseName=AdventureWork2019; integratedSecurity=true;";

        try{

            con = DriverManager.getConnection(conUrl);
        }catch(Exception exception){
            System.out.println("Failed");
            exception.printStackTrace();
        }finally

        {
            if (con != null)
                try {
                    con.close();
                    System.out.println();
                    System.out.println("Disconnected");
                } catch (Exception exception1) {
                    System.out.println(exception1);
                }
        }
    }

}
