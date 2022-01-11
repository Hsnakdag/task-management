package taskManagement.io.business.concrete;

import taskManagement.io.business.abstracts.TaskRepository;
import taskManagement.io.entity.concretes.Task;

public class TaskController implements TaskRepository {
    @Override
    public boolean create(Task task, String token) {
        if(token != null){
            System.out.println("Authorized user");
            return true;
        }
        else{
            System.out.println("Unauthorized user");
            return false;
        }
    }

    @Override
    public boolean delete(Task task, String token) {
        if(token != null){
            System.out.println("Authorized user");
            return true;
        }
        else{
            System.out.println("Unauthorized user");
            return false;
        }
    }

    @Override
    public boolean update(Task task, String token) {
        if(token != null){
            System.out.println("Authorized user");
            return true;
        }
        else{
            System.out.println("Unauthorized user");
            return false;
        }
    }

    @Override
    public Task getTaskWithId(final int id) {
        return null;
    }
}
