package taskManagement.io.dataAccess.abstracts;

import java.util.List;
import taskManagement.io.entity.concretes.UserModel;

public interface UserDao {
    List<UserModel> getAllUsers();
    UserModel getUserInfoByID(int id);
}
