package todo.model;

import java.time.LocalDate;

public class Task {
    private String description;
    private boolean completed;
    private LocalDate DueTime;

    public Task(String description, boolean completed, LocalDate dueTime) {
        this.description = description;
        this.completed = completed;
        DueTime = dueTime;
    }

    public Task(String description, boolean completed) {
        this.description = description;
        this.completed = completed;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public LocalDate getDueTime() {
        return DueTime;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
