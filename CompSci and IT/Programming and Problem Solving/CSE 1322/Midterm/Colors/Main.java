import java.util.Scanner;
import java.util.ArrayList;

public class QuestionC {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        ArrayList<Color> colors = new ArrayList<>();

        System.out.println("[Color Keeper");

        String choice = "";
        int color = 0;
        int id = 0;
        while (colors.size() < 5) {
            System.out.print("Color " + id + ": RGB or CMYK? ");
                scan.nextLine();
                choice = scan.nextLine();

                id++;
            switch (choice) {
                case "RGB":
                    System.out.print("Enter RED: ");
                    int red = scan.nextInt();
                    System.out.print("Enter GREEN: ");
                    int green = scan.nextInt();
                    System.out.print("Enter BLUE: ");
                    int blue = scan.nextInt();

                    RGB rgb = new RGB(red, blue, green);

                    System.out.println("Color created.");
                case "CMYK":
                    System.out.print("Enter CYAN: ");
                    int cyan = scan.nextInt();
                    System.out.print("Enter MAGENTA: ");
                    int magenta = scan.nextInt();
                    System.out.print("Enter YELLOW: ");
                    int yellow = scan.nextInt();
                    System.out.print("");
                    System.out.print("Enter BLACK: ");
                    int black = scan.nextInt();

                    CMYK cmyk = new CMYK(black, cyan, magenta, yellow);
            }
        }
        System.out.println("Here are all your colors:");
        for (int c=0; c<= colors.size(); c++){
            while (c<colors.size()){
                
                c++;
            }
        }
    }
}
