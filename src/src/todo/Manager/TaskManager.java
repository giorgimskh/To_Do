package todo.Manager;

import todo.model.Task;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> Tasks;

    public TaskManager(List<Task> tasks) {
        this.Tasks = new ArrayList<>();
    }

    public void AddTask(String description, LocalDate DueTime){
        Task task  = new Task(description,false, DueTime);
        Tasks.add(task);
    }

    public void RemoveTask(Task task){
        Tasks.remove(task);
    }

    public void MarkCompleted(Task task){
        task.setCompleted(true);
    }

    public List<Task> getPendingTasks(){
         List<Task> PendingTasks=new ArrayList<>();

         for(Task task:Tasks){
             if(task.isCompleted()==false){
                 PendingTasks.add(task);
             }
         }

         return PendingTasks;
    }
    public List<Task> getTasks() {
        return Tasks;
    }


}
