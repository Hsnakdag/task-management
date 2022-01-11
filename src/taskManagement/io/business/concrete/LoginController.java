package taskManagement.io.business.concrete;

import java.util.Scanner;
import taskManagement.io.dataAccess.concretes.UserModel;

public class LoginController {
    private UserModel userModel;

    public LoginController(final UserModel userModel) {
        this.userModel = userModel;
    }

    public boolean login(String username,String password){

        return userModel.checkUser(username,password);
    }
    public boolean logout(){
        return true;
    }
}
