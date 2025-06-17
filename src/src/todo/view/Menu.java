package todo.view;

import todo.Manager.FolderManager;
import todo.model.Folder;

import java.util.List;
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

    private void folderMenu(){
        while(true){
            System.out.println("Folders List 📝:");
            List<Folder> folderList = folderManager.getAllFolders();

            for(int i=0;i<folderList.size();i++){
                System.out.print((i+1)+". " + folderList.get(i).getName());
            }

            System.out.println(folderList.size()+1 + ". Create new folder");
            System.out.println("0. ❌ exit");

            System.out.println("Enter your choice : ");
            String input = scanner.nextLine().trim();

            if (input.equals("0")) break;

            try {
                int choice = Integer.parseInt(input);

                if(choice==folderList.size()+1){
                    System.out.println("Enter folder name : ");
                    String name = scanner.nextLine().trim();
                    folderManager.CreateFolder(name);
                }
                else if(choice>0 && choice <=folderList.size()-1){
                    Folder select = folderList.get(choice-1);
                    taskMenu(select);
                }
                else{
                    System.out.println("Invalid option !");
                }
            }catch (NumberFormatException e){
                System.out.println("Please enter the number : ");
            }
        }
    }


}
