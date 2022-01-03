package concrete;

import Abstract.UserRepository;
import entity.UserModel;

public class UserController implements UserRepository {
    public boolean register(UserModel userModel){
       return true;
    }
    public boolean delete(UserModel userModel){
        return true;
    }
    public boolean update(UserModel userModel){
        return true;
    }

}
