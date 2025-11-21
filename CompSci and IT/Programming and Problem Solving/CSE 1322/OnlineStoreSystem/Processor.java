public class Processor extends Thread{
    private static int nextId=1;
    private int id;
    private Inventory queue;
    private int numberOfOrders;
    private double revenue;

    public Processor(Inventory queue){
        this.numberOfOrders = 0;
        this.revenue = 0;
        this.id = nextId;
            nextId++;
        this.queue = queue;
    }

    @Override
    public void run(){
        System.out.println("OrderProcessor " + id + " starting order processing...");
        while (true) {
            // Retrieve item from queue
            Item i = queue.retrieveItem();
            
            // If queue is empty, terminate loop
            if (i==null) {
                break;
            }

            // Process item
            queue.incrementBalance(i.cost); 
            numberOfOrders++;   
            revenue += i.cost;   
        }

        System.out.println("OrderProcessor " + id + " processed a total of " + numberOfOrders + " orders for a total of $" + revenue + ".");
    }
}
