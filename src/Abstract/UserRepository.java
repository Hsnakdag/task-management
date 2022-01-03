package Abstract;

import entity.UserModel;

public interface UserRepository {
    public boolean register(UserModel userModel);
    public boolean delete(UserModel userModel);
    public boolean update(UserModel userModel);
}
