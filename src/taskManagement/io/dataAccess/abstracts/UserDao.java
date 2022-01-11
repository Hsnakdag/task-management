package taskManagement.io.dataAccess.abstracts;

import java.util.List;
import taskManagement.io.entity.concretes.User;

public interface UserDao {
    List<User> getAllUsers();
    User getUserByID(int id);

}
