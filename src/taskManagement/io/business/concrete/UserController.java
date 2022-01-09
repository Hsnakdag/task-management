package taskManagement.io.business.concrete;

import taskManagement.io.business.abstracts.UserRepository;
import taskManagement.io.entity.concretes.UserModel;

public class UserController implements UserRepository {

    @Override
    public boolean registerUser(final UserModel userModel) {
        return false;
    }

    @Override
    public boolean deleteUser(final UserModel userModel) {
        return false;
    }

    @Override
    public boolean updateUser(final UserModel userModel) {
        return false;
    }

    public boolean update(UserModel userModel){
        return true;
    }

}
