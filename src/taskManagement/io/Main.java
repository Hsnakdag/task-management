package taskManagement.io;

import UI.login.LoginView;
import UI.register.RegisterView;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import javax.xml.crypto.Data;
import taskManagement.io.business.concrete.UserController;
import taskManagement.io.dataAccess.concretes.UserModel;
import taskManagement.io.entity.concretes.dto.RegisterFormInfo;
import taskManagement.io.util.DatabaseUtil;
import taskManagement.io.core.Services.*;

public class Main {

    public static void main(String[] args) throws ParseException, SQLException {

        //Database connection
        connect();

        Scanner          scan           = new Scanner(System.in);
        UserController   userController = new UserController(new UserModel());
        RegisterFormInfo form           = new RegisterFormInfo();

        System.out.println("\nEnter your name");
        form.setName(scan.next());
        System.out.println("\nEnter your lastname");
        form.setLastName(scan.next());
        System.out.println("\nEnter your username");
        form.setUsername(scan.next());
        System.out.println("\nEnter your email");
        form.setEmail(scan.next());
        System.out.println("\nEnter your birthdate");
        form.setBirthdate(new SimpleDateFormat("dd.MM.yyyy").parse(scan.next()));
        System.out.println("\nEnter your national id");
        form.setNationalID(scan.next());
        System.out.println("\nAre you manager ? (y/n)");
        String ch = scan.next();
        if(ch == "y"){
            form.setManager(true);
        }else{
            form.setManager(false);
        }
        System.out.println("Enter your password");
        form.setPassword(scan.next());

        System.out.println(userController.registerUser(form));


    }

    public static void connect() throws SQLException {
        DatabaseUtil.host = "localhost:50869";
        DatabaseUtil.databaseName = "TaskManagementSystem";
        DatabaseUtil.getConnection();
    }
}
