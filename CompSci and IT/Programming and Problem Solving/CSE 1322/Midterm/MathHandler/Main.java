import java.util.ArrayList;
import java.util.Scanner;


public class Question3B {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        int num = 0;
        String user = "";
        while (!user.equals("done")) {
            System.out.print("Enter a number or 'done': ");
            num = scan.nextInt();
            user = scan.nextLine();

            numbers.add(num);
        }

        AdditionHandler add = new AdditionHandler();
        ProductHandler multiply = new ProductHandler();

        System.out.println(" ");
        System.out.println("AdditionHandler: " + add.arraylistHandler(numbers));
        System.out.println("ProductHandler: " + multiply.arraylistHandler(numbers));
    }
}
