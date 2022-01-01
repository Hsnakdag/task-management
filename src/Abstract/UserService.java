package Abstract;

import entity.User;

public interface UserService {
    public boolean register(User user);
    public boolean delete(User user);
    public boolean update(User user);
    public boolean login(String username,String password);
}
