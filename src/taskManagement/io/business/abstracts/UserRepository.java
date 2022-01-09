package taskManagement.io.business.abstracts;

import taskManagement.io.entity.concretes.UserModel;

public interface UserRepository {
    public boolean registerUser(UserModel userModel);
    public boolean deleteUser(UserModel userModel);
    public boolean updateUser(UserModel userModel);
}
