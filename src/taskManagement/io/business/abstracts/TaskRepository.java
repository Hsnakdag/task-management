package taskManagement.io.business.abstracts;

import taskManagement.io.entity.concretes.Task;

public interface TaskRepository {
    public boolean create(Task task, String token);
    public boolean delete(Task task, String token);
    public boolean update(Task task, String token);
    public Task getTaskWithId(int id);
}
