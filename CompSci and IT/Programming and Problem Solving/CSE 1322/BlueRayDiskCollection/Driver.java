import java.util.Scanner;
import java.util.InputMismatchException;

public class Driver {
    public static void main (String[] args) throws InputMismatchException{
        Scanner scan = new Scanner(System.in);
        BlueRayCollection collection = new BlueRayCollection();

        //title
        System.out.println("[BlueRay Disk Collection]");
        
        int option = 0;

        while (option!=3) {
            System.out.println(" ");
            
            //menu
            System.out.println("1. Add to collection");
            System.out.println("2. See Collection");
            System.out.println("3. Quit program");
            
            try{ 
                System.out.print("Enter option: ");
                option = scan.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Invalid entry");
                scan.nextLine();

                System.out.println(" ");

                //menu
                System.out.println("1. Add to collection");
                System.out.println("2. See Collection");
                System.out.println("3. Quit program");
            
                System.out.print("Enter option: ");
                option = scan.nextInt();
            }

            //System.out.println(" ");

            switch(option){
                case 1:
                    System.out.print("Enter disk title: ");
                            scan.nextLine();
                        String title = scan.nextLine();
                    System.out.print("Enter director name: ");
                        String director = scan.nextLine();

                    //validity check of yearOfRelease
                    int yearOfRelease = 0;
                    try {
                        System.out.print("Enter year of release: ");
                        yearOfRelease = scan.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Error: Year of release must be a whole number!");
                        scan.nextLine();
                        break;
                    }
    
                    System.out.print("Enter price: $");
                        double cost = scan.nextDouble();

                    collection.addDisk(title, director, yearOfRelease, cost);

                    System.out.print("BlueRay Disk added to collection.");

                    System.out.println(" ");

                    break; 

                case 2:
                    System.out.println("Here is your current collection:");

                    System.out.println(collection.showAll());

                    break;

                default:
                    if (option!=3) {System.out.print("Invalid entry"); }
                    System.out.println(" ");
                    break;
            }
        }
        System.out.println("Shutting off...");
    }
}
