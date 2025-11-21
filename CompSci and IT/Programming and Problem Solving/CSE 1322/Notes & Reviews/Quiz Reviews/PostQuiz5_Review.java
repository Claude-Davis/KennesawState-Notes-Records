
import java.util.Scanner;

public class PostQuiz5_Review{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        
        //what will the output be? explain why.
        System.out.println(q1(6));

        //what will cause an infinite recursion from the following options?: 10, 11, 0, -2
        System.out.print("Enter value for x: ");
        int x = scan.nextInt();
        System.out.println(q2(x));

        //What is the output? why?
        String y = q3("ABCDE");
        System.out.println(y);

    }

    public static int q1(int x) {
        if(x==0) {
            return 2;
        }
        else {
            return 2 + q1(x-2);
        }
    }

//

    public static int q2(int m) {
        if(m==0) {
            return 1;
        }
        else {
            return m*q2(m-2);
        }
    }

//

    public static String q3(String x) {
        if(x.length()==0) {
        return x;
        }
        else {
        return "X"+q3(x.substring(0,x.length()-1));
        }
    }
}