package Abstract;

import entity.Task;

public interface TaskService {
    public boolean create(Task task);
    public boolean delete(Task task);
    public boolean update(Task task);
}
