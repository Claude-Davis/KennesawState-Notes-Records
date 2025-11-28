//prompt 1: create a recursive method that prints a counter. it should take in 1 int value, which is the starting # for the counter. the counter should count down to 0.

//prompt 2: 

import java.util.Scanner;

public class M4_Counting{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numStart = 1;

        CountDown(numStart);
        }
    }

    static void CountDown(int numStart){
            Scanner scan = new Scanner(System.in);

            numStart = scan.nextInt();
            int numEnd += numStart;

            return numEnd;
    }
}

