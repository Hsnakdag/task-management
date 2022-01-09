package UI.login;

import UI.abstracts.UI;
import java.util.Scanner;
import taskManagement.io.entity.concretes.dto.LoginFormInfo;

public class LoginView implements UI {


    public LoginFormInfo login(){
        LoginFormInfo info = new LoginFormInfo();
        System.out.println("Login to system");
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter username :");
        info.setUsername(scan.next());
        System.out.println("\nEnter password :");
        info.setPassword(scan.next());

        return info;

    }
}
