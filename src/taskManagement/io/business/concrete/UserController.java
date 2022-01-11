package taskManagement.io.business.concrete;

import java.sql.SQLException;
import taskManagement.io.dataAccess.concretes.UserModel;
import taskManagement.io.entity.concretes.Task;
import taskManagement.io.entity.concretes.User;
import taskManagement.io.entity.concretes.dto.RegisterFormInfo;

public class UserController{

    private UserModel userModel;

    public UserController(final UserModel userModel) {
        this.userModel = userModel;
    }

    public boolean registerUser(final RegisterFormInfo info) throws SQLException {
        String fieldNames = "NAME,LASTNAME,USERNAME,Birthdate,HireDate,Salary,NationalID,WorkHour,Password";
        userModel.insertUser(info,fieldNames);
        return false;
    }


    public boolean deleteUser(final int userID) {
        userModel.deleteUser(userID);
        return false;
    }


    public boolean updateUser(final User user) {
        userModel.updateUser(user);
        return false;
    }


    public User getUserById(final int userId) {
        userModel.getUser(userId);
        return null;
    }


    public Task getUsersTasks(final int userId) {
        userModel.getUsersTasks(userId);

        return null;
    }

}
