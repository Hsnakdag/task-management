package taskManagement.io.dataAccess.concretes;

import java.util.List;
import taskManagement.io.dataAccess.abstracts.UserDao;
import taskManagement.io.entity.concretes.UserModel;

public class UserDataAccess implements UserDao {


    @Override
    public List<UserModel> getAllUsers() {

        return null;
    }

    @Override
    public UserModel getUserInfoByID(final int id) {
        return null;
    }
    public void assignToUser(int userId,int taskId){

    }
}
