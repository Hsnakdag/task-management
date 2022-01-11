package taskManagement.io.business.abstracts;

public interface ManagerRepository {
    public void assignTaskToUser(int userId,int taskId);
    public void undoAssignedTaskFromUser(int userId,int taskId);
    public void getReportByUserId(int id);
}
