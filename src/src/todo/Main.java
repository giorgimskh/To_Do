package todo;

import todo.Manager.FolderManager;
import todo.model.Folder;
import todo.model.Task;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lets start");

        FolderManager manager =new FolderManager();
        manager.CreateFolder("Personal");
        Folder personal = manager.getFolderByName("Personal");

        manager.addTaskToFolder(personal, new Task("Eat",false, LocalDate.now()));
        manager.addTaskToFolder(personal,new Task("Jogging",false,LocalDate.now()));
        manager.TaskList(personal);

        manager.CreateFolder("Personal");
        }
    }
