package UI.register;

import UI.abstracts.UI;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import taskManagement.io.entity.concretes.dto.RegisterFormInfo;

public class RegisterView implements UI {

    public RegisterFormInfo register() throws  ParseException {
        String username;
        String name;
        String lastName;
        String password;
        String email;
        String nationalID;
        Boolean     isManager;
        Date        birthdate;

        Scanner scan = new Scanner(System.in);
        System.out.println("Register to system\n");

        System.out.println("Enter your name :");
        name=scan.next();

        System.out.println("\nEnter your lastname");
        lastName = scan.next();

        System.out.println("\nEnter your username");
        username = scan.next();

        System.out.println("\nEnter your password");
        password = scan.next();

        System.out.println("\nEnter your email");
        email = scan.next();

        System.out.println("\nEnter your national id");
        nationalID = scan.next();

        System.out.println("\n Enter your birthdate");
        birthdate = new SimpleDateFormat("dd.MM.yyyy").parse(scan.next());

        System.out.println("\n Are you the manager for the project (y/n)");
        // tam değil
        if(scan.next() == "y"){

            isManager = true;
        }else {
            isManager = false;
        }

        return new RegisterFormInfo(username,name,lastName,password,email,nationalID,isManager,birthdate);
    }
}
