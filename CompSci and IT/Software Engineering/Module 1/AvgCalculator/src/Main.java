package src;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        //obj of Scanner class to take input
        Scanner sc = new Scanner (System.in);

        //obj of ArrayList class to save user input
        ArrayList<rWhitespace> user_nums = new ArrayList<>();

        //request user input until they hit enter
        String request_to_user = "Input a series of numbers separated by a space: ";
        String user_input = sc.nextLine();
                                /*Double user_input = Double.parseDouble(sc.nextLine());*/ //take in user input as string type, but convert it to type double
        
        //transfer each number into 'user_nums'
        user_nums = rWhitespace.removeWhitespace(user_input);

        //convert each value from string to double

        //separate user input and save to arraylist
        user_nums.add(user_input);
    }
}