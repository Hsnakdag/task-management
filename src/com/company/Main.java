package com.company;

import DatabaseConnection.DatabaseConnection;
import concrete.UserController;
import concrete.UserView;
import entity.UserModel;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        DatabaseConnection databaseConnection = new DatabaseConnection();
        databaseConnection.connect();
//        Scanner scan = new Scanner(System.in);
//        int choose;
//        UserView userView = new UserView();
//        System.out.println("1-)Register\n");
//        System.out.println("2-)Login\n");
//        System.out.println("Signin or signup");
//
//        choose = scan.nextInt();
//
//        if(choose == 1){
//            UserController userController = new UserController();
//            final UserModel user          = new UserModel();
//            Scanner scan_info             = new Scanner(System.in);
//            System.out.println("\nName");
//            user.setName(scan_info.next());
//            System.out.println("\nlastname");
//            user.setLastName(scan_info.next());
//            System.out.println("\nUsername:");
//            user.setUsername(scan_info.next());
//            user.setId(1);
//            userController.register(user);
//            userView.viewUser(user);
//        }
    }
}
