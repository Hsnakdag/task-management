package taskManagement.io.entity.concretes;

public class EmployeeModel {
    int    userId;
    int    taskId;
    String name;
    String lastname;

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(final int userId) {
        this.userId = userId;
    }

    public int getTaskId() {
        return this.taskId;
    }

    public void setTaskId(final int taskId) {
        this.taskId = taskId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(final String lastname) {
        this.lastname = lastname;
    }

    public EmployeeModel(){

    }
}
