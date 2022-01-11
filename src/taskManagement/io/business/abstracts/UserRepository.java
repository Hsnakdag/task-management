package taskManagement.io.business.abstracts;

import taskManagement.io.entity.concretes.User;

public interface UserRepository {
    public boolean registerUser(User user);

    public boolean deleteUser(User user);

    public boolean updateUser(User user);

    public void getUserById(int userId);

    public void getUsersTasks(int userId);

}
