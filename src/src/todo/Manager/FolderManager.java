package todo.Manager;

import todo.Exceptions.UserFriendlyException;
import todo.model.Folder;
import todo.model.Task;

import java.util.ArrayList;
import java.util.List;

public class FolderManager {
    private List<Folder> Folders;

    public FolderManager() {
        this.Folders = new ArrayList<>();
    }

    public void CreateFolder(String name){
        try{
            if(getFolderByName(name)==null || name.trim().isEmpty()){
                throw new UserFriendlyException("This folder is empty");
            }
        } catch (UserFriendlyException e){
            System.out.println("⚠ " + e.getMessage()+" !");
        }


        Folders.add(new Folder((new ArrayList<>()),name));
    }

    public Folder getFolderByName(String name){
        for(Folder folder:Folders){
            if(folder.getName().equalsIgnoreCase(name)){
                return folder;
            }
        }
        return null;
    }

    public void addTaskToFolder(Folder folder, Task task) {
        folder.getTasks().add(task);
    }

    public void AddTaskToFolder(String name,Task task){
        getFolderByName(name).getTasks().add(task);
    }

    public void deleteFolder(Folder folder) {
        Folders.remove(folder);
    }

    public List<Folder> getAllFolders() {
        return Folders;
    }

    public void TaskList(Folder folder) {
        System.out.println("Folder Name: " + folder.getName());

        if (folder != null) {
            List<Task> tasks = folder.getTasks();

            for (int i=0;i<tasks.size();i++){
                System.out.println(i+1+")"+tasks.get(i).getDescription() + " | Due: " + tasks.get(i).getDueTime() + " | Completed: " + tasks.get(i).isCompleted());
            }
        }
    }

    @Override
    public String toString() {
        return "FolderManager{" +
                "Folders=" + Folders +
                '}';
    }
}
