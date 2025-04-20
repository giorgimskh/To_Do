package todo.Manager;

import todo.model.Folder;
import todo.model.Task;

import java.util.ArrayList;
import java.util.List;

public class FolderManager {
    private List<Folder> Folders;

    public FolderManager(List<Folder> folders) {
        this.Folders = new ArrayList<>();
    }

    public void CreateFolder(String name){
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
        folder.getTasks().add(task); // or folder.addTask(task) if you implement that method
    }

    public void deleteFolder(Folder folder) {
        Folders.remove(folder);
    }

    public List<Folder> getAllFolders() {
        return Folders;
    }

    public void TaskList(Folder folder){
        System.out.println(folder.getTasks());
    }

    @Override
    public String toString() {
        return "FolderManager{" +
                "Folders=" + Folders +
                '}';
    }
}
