package todo.model;


import java.util.List;

public class Folder<T> {
    private List<Task> Tasks;
    private String Name;

    public Folder(List<Task> tasks, String name) {
        Tasks = tasks;
        Name = name;
    }

    public void setName(String name) {
        Name = name;
    }


    public List<Task> getTasks() {
        return Tasks;
    }

    public String getName() {
        return Name;
    }


}
