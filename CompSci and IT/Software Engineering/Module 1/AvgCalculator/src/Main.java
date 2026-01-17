package src;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        //obj of Scanner class to take input
        Scanner sc = new Scanner (System.in);

        //obj of ArrayList class to save user input
        ArrayList user_nums = new ArrayList<Double>();

        //request user input until they hit enter
        String request_to_user = "Input a series of numbers separated by a space.";
        Double user_input = Double.parseDouble(sc.nextLine()); //take in user input as string type, but convert it to type double

        //separate user input and save to arraylist
        user_nums.add(user_input);
    }
}