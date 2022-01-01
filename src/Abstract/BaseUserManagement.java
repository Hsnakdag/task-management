package Abstract;

import entity.User;

public abstract class BaseUserManagement implements UserService{
    public boolean register(User user){
        return true;
    }
    public boolean delete(User user){
        return true;
    }
    public boolean update(User user){
        return true;
    }
    @Override
    public boolean login(String username,String password){
        return true;
    }
}
