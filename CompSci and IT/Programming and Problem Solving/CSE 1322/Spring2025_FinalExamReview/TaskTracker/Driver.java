//package TaskTracker;

public class Driver {
    public static void main(String[] args) {
        //Task objects
        Task dishes = new Task ("wash the dishes");
        Task batheCat = new Task ("bathe the cat");
        Task grass = new Task ("cut the grass");

        //TaskList obj
        TaskList list = new TaskList();

        list.addTask(dishes);
        list.addTask(batheCat);
        list.addTask(grass);

    }
}
