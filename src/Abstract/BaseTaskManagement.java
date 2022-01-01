package Abstract;

import entity.Task;

public abstract class BaseTaskManagement implements TaskService{

    public boolean create(Task task) {
        return true;
    }

    public boolean delete(Task task) {
        return true;
    }

    public boolean update(Task task) {
        return true;
    }
}
