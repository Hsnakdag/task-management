package taskManagement.io.dataAccess.abstracts;

import java.util.List;
import taskManagement.io.entity.concretes.TaskModel;

public interface TaskDao {
    List<TaskModel> getAllTasks();
    TaskModel getTaskById(int id);
}
