package taskManagement.io.business.abstracts;

public interface ManagerRepository {
    public void assignTaskToEmployee(int userId,int taskId);
    public void setBudget(int taskId);
    public void invitePerson();
}
