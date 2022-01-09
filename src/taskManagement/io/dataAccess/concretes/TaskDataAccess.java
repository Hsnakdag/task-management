package taskManagement.io.dataAccess.concretes;

import java.util.List;
import taskManagement.io.dataAccess.abstracts.TaskDao;
import taskManagement.io.entity.concretes.TaskModel;

public class TaskDataAccess implements TaskDao {
    @Override
    public List<TaskModel> getAllTasks() {
        return null;
    }

    @Override
    public TaskModel getTaskById(final int id) {
        return null;
    }
}
