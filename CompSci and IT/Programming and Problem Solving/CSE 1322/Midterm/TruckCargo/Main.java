import java.util.ArrayList;
import java.util.Scanner;

public class Question2A {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Truck> trucks = new ArrayList<>();

        System.out.println("[Truck Yard]");

        int option = 0;

        while (option != 3) {
            System.out.println("1. Add truck");
            System.out.println("2. Remove truck");
            System.out.println("3. Quit");
            System.out.print("Enter option: ");
            option = scan.nextInt();

            switch (option){
                case 1:
                    System.out.println(" ");

                    System.out.print("Enter cargo description: ");
                    scan.nextLine();
                    String description = scan.nextLine();

                    Truck newTruck = new Truck(description);

                    trucks.add(newTruck);

                    System.out.println("Truck created.");

                    System.out.println(" ");

                    for (int t=0;t<=trucks.size();t++){
                        while (t<trucks.size()){
                            System.out.println(trucks.get(t).toString());
                            t++;
                        }
                    }

                    System.out.println(" ");

                    break;

                case 2:
                    System.out.println(" ");

                    System.out.print("Remove truck at which index: ");
                    int index = scan.nextInt();

                    if (index < 0 || index > trucks.size()) {
                        System.out.println("That is not a valid index.");
                        System.out.println(" ");
                        for (int t=0;t<=trucks.size();t++){
                            while (t<trucks.size()){
                                System.out.println(trucks.get(t).toString());
                                t++;
                            }
                        }
                    } else {
                        trucks.remove(index);
                        System.out.println(" ");
                        for (int t=0;t<=trucks.size();t++){
                            while (t<trucks.size()){
                                System.out.println(trucks.get(t).toString());
                                t++;
                            }
                        }
                    }

                    break;
            }
        }
        System.out.println("Shutting off...");
    }
}
