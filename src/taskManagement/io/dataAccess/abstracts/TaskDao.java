package taskManagement.io.dataAccess.abstracts;

import java.util.List;
import taskManagement.io.entity.concretes.Task;

public interface TaskDao {
    List<Task> getAllTasks();
    Task getTaskById(int id);
}
