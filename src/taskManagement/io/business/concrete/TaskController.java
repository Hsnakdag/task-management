package taskManagement.io.business.concrete;

import taskManagement.io.business.abstracts.TaskRepository;
import taskManagement.io.entity.concretes.TaskModel;

public class TaskController implements TaskRepository {
    @Override
    public boolean create(TaskModel taskModel,String token) {
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
    public boolean delete(TaskModel taskModel,String token) {
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
    public boolean update(TaskModel taskModel,String token) {
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
    public TaskModel getTaskWithId(final int id) {
        return null;
    }
}
