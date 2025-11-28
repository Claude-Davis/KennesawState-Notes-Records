
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> sounds = new ArrayList<>();

        boolean end = false;
        int x = 0;

        while (end!=true){
            System.out.println("(type 'STOP' to end program)");
            System.out.print("Enter an animal species: ");
            String animal = scan.nextLine();

            if (animal.equals("STOP")){
                end = true;
            } else {

                sounds.add(animal);

                x++;
                System.out.println("Total : " + x);
                System.out.println(" ");

            }
        } 
        for (int a=0; a<sounds.size(); a++){
            animalSounds newAnimal = new animalSounds(sounds.get(a));
            newAnimal.start();
        }
    }
    
}
