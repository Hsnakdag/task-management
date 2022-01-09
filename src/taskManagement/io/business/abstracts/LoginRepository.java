package taskManagement.io.business.abstracts;

public interface LoginRepository {
    String authenticateLogin(String username,String password);
    void forgotPassword(String username,String email);
}
