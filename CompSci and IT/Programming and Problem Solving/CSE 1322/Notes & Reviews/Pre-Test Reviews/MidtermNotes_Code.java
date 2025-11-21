import java.util.Scanner;

public class MidtermNotes_Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Converting
        System.out.println("CONVERSION");
            String s = "90";
            System.out.println("This is a String: " + s);
            //String to int
                int i = Integer.parseInt(s);
                System.out.println("This is now an int: " + i);
            //String to double
                double d = Double.parseDouble(s);
                System.out.println("This is now a double: " + d);
            //String to boolean
                boolean tf = Boolean.parseBoolean(s);
                System.out.println("This is now a boolean: " + tf); //defaults to "false" bcs it is not ssigned n Bs
            //String to char
                //
        //Converting: Tests
            System.out.println("  int: " + s + " + 5" + " = " + (i+5));     //as an integer, the variable is added to 5
            System.out.println("  String: " + s + " + 5" + " = " + (s+5));  //as a String, the variable is concatenated (or joined together) with 5
            System.out.println("  double: " + s + " + 5" + " = " + (d+5));  //as a double, the variable is added to 5


System.out.println(" --- --- ---");


        //Casting
        System.out.println("CASTING");
            double d2 = 4.28;
            System.out.println("Before casting, d2 = " + d2);
            d2 = (int) 4.28;
            System.out.println("After casting (int), d2 = " + d2);
            d2 = (byte) 4.28;
            System.out.println("After casting (byte), d2 = " + d2);

            /* byte b = 7;
            System.out.println("Before casting, b = " + b);
 //ERROR//  b = (double) 7;
            System.out.println("After casting (double), b = " + b); */


System.out.println(" --- --- ---");


        //Java vs. Python: MATH
    }
}