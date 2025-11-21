import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private double balance=0;
    private int itemsProcessed=0;
    private final List<Item> processingQueue = Collections.synchronizedList(new LinkedList<>());
        /* Collections.synchronizedList() wraps the LinkedList so the operations are synchronized;
            allows multiple thread to interact wit hthe list while preventing race conditions
        */

    public synchronized void addItem(Item x){
        this.processingQueue.add(x);
    }

    public synchronized Item retrieveItem(){
        if (processingQueue.size()==0){
            return null;
        }
        itemsProcessed++;
        return processingQueue.remove(0);
    }

    public synchronized void incrementBalance(double x){
        balance += x;
    }

    public synchronized double retrieveBalance(){
        return balance;
    }

    public synchronized int getQueueSize(){
        return processingQueue.size();
    }

    public synchronized int getItemsProcessed(){
        return itemsProcessed;
    }
}
