package taskManagement.io.business.abstracts;

import taskManagement.io.entity.concretes.TaskModel;

public interface TaskRepository {
    public boolean create(TaskModel taskModel,String token);
    public boolean delete(TaskModel taskModel,String token);
    public boolean update(TaskModel taskModel,String token);
    public TaskModel getTaskWithId(int id);
}