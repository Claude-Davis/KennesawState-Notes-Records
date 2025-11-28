//package TaskTracker;

public class Task {
    private String description;
    private int taskId;
    private static int nextId=0001;

    public Task(String desc) {
        this.description = desc;
        this.taskId = nextId;
        nextId++;
    }

    @Override
    public String toString() {
        return "Task #" + taskId;
    }
}
