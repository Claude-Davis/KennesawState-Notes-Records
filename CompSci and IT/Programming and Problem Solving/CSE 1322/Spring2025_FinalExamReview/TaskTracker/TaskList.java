//package TaskTracker;

public class TaskList {
    private Node head;
    private int size;

    private class Node {
        Task data; 
        Node next;

        Node (Task data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addTask(Task task) {
        Node newTask = new Node(task);
        if (head==null) {
            head = newTask;
        } else {
            Node current = head;
            while (current.next!=null){
                current = current.next;
            }
        }
    }

    public Task removeTask() {
        Task removedTask = head.data;
        head = head.next;
        return removedTask;
    }

    public void printTask() {
        Node current = head;
        while (current!=null) {
            System.out.println(current.toString());
            current = current.next;
        }
    }

    public boolean isEmpty() {
        /*
        if (head==null) {
            return true;
        } else if (head!=null) {
            return false;
        }
        return empty;
        */
        return head == null;
    }
}
