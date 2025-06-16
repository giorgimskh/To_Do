package todo.view;

import todo.Manager.FolderManager;
import todo.model.Folder;

import java.util.Scanner;

public class Menu {
    private FolderManager folderManager;
    private Scanner scanner;

    public Menu() {
        this.folderManager = new FolderManager();
        this.scanner = new Scanner(System.in);
    }

    public void start(){
        printIntro();
        folderMenu();
    }

    private void printIntro(){
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("║          📝 TO-DO LIST APP           ║");
        System.out.println("║   Manage your tasks by folders! 📂   ║");
        System.out.println("╚══════════════════════════════════════╝");
    }

}
