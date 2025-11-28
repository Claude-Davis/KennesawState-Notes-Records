import java.util.Scanner;

public class Driver {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        Inventory inventory = new Inventory();

        //objects of Item
            Item tShirt = new Item("T-shirt", 6.5);
            Item sweater = new Item("Sweater", 8.5);
            Item sweatpants = new Item("Sweatpants", 10.0);
            Item skirt = new Item("Skirt", 25.5);
            Item dress = new Item("Dress", 15.5);

        //title
        System.out.println("[Order Queue Simulator]");

        //Purchaser objects
            /* System.out.print("Purchase how many 't-shirt' at $6.50? ");
                int purchaserQuantity = scan.nextInt();
                    int itemsToProcess = purchaserQuantity;
                Purchaser p1 = new Purchaser(inventory, tShirt, purchaserQuantity);
            System.out.print("Purchase how many 'sweater' at $8.50? ");
                purchaserQuantity = scan.nextInt();
                    itemsToProcess += purchaserQuantity;
                Purchaser p2 = new Purchaser(inventory, sweater, purchaserQuantity);
            System.out.print("Purchase how many 'sweatpants' at $10.00? ");
                purchaserQuantity = scan.nextInt();
                    itemsToProcess += purchaserQuantity;
                Purchaser p3 = new Purchaser(inventory, sweatpants, purchaserQuantity);
            System.out.print("Purchase how many 'skirt' at $25.50? ");
                purchaserQuantity = scan.nextInt();
                    itemsToProcess += purchaserQuantity;
                Purchaser p4 = new Purchaser(inventory, skirt, purchaserQuantity);
            System.out.print("Purchase how many 'dress' at $15.50? ");
                purchaserQuantity = scan.nextInt();
                    itemsToProcess += purchaserQuantity;
                Purchaser p5 = new Purchaser(inventory, dress, purchaserQuantity);
                */
            Item[] items = {tShirt, sweater, sweatpants, skirt, dress};  //array of type Item created to store all created objects of Item
            Purchaser[] purchasers = new Purchaser[5];  //array of type Purchaser created to store all created objects of Purchaser

            for (int i=0; i<items.length; i++){
                System.out.print("Purchase how many '" + items[i].description + "' at $" + items[i].cost + "? ");
                int purchaserQuantity = scan.nextInt();
                purchasers[i] = new Purchaser(inventory, items[i], purchaserQuantity);  //Purchaser objects created
            }


            System.out.println("Purchasers created. Press 'enter' to start purchases ...");
            System.out.println(" ");

        scan.nextLine();
        String enter = scan.nextLine();

        //start threads of all purchaser objects
            System.out.println("Purchasers have started working...");
        for (Purchaser p : purchasers) {
            p.start();
        }

        //wait for Purchaser threads to stop
            int processedQuantity=0;
            try {
                for (Purchaser p : purchasers) {
                    p.join();
                }

                System.out.println("Purchasers are done working. A total of " + inventory.getQueueSize() + " items are awaiting processing.");
                processedQuantity = inventory.getQueueSize();
            } catch (InterruptedException e){
                System.out.println("Purchaser thread interrupted: " + e.getMessage());
            }

            
            System.out.println(" ");

        
        //Processors
        System.out.print("Create how many processors? ");
            int purchaserQuantityOfProcessors = scan.nextInt();

            //create Processor objects
                /* for (int p=0; p<purchaserQuantityOfProcessors; p++){
                    Processor newProcessor = new Processor(inventory);
                    allProcessors.add(newProcessor);
                } */
            Processor[] processors = new Processor[purchaserQuantityOfProcessors];
            for (int i = 0; i < purchaserQuantityOfProcessors; i++) {
                processors[i] = new Processor(inventory);
            }

            scan.nextLine();

            System.out.println("OrderProcessors created. Press 'enter' to start processing orders...");

            enter = scan.nextLine();

            System.out.println("Processors are now working...");

            //start Processor objects' threads
            for (Processor p : processors){
                p.start();
            }

            // Wait for Processor threads stop/finish
            for (Processor p : processors) {
                try {
                    p.join();
                } catch (InterruptedException e) {
                    System.out.println("Processor thread interrupted: " + e.getMessage());
                }
            }
        
            System.out.println("All OrderProcessors are done processing orders.");
            System.out.println(" ");

        
        //print inventory's balance and itemsProcessed
        System.out.println(processedQuantity + " items were processed for a total of $" + inventory.retrieveBalance() + ".");


        System.out.println("Simulation complete.");
    }

}
