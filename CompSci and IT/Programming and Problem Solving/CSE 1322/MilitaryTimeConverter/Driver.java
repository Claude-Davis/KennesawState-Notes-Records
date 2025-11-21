//package MilitaryTimeConverter;
        //NOTE error: implicitly declared class should not have package declaration

import java.util.Scanner;

class Driver{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("[Time Calculator]");
        int option = 0;

        while (option != 2){
            //menu
            System.out.println("1. Calculate diference in seconds");
            System.out.println("2. Exit");
            System.out.print("Enter your option: ");
            option = scan.nextInt();

            switch (option){
                default:
                    if ((option != 1) || (option != 2)) {
                        System.out.println("Invalid entry");
                        System.out.println(" ");
                        break;
                    }
                case 1:
                    System.out.print("Enter your start timestamp: ");
                    scan.nextLine();
                    String start = scan.nextLine();

                    System.out.print("Enter your end timestamp: ");
                    String end = scan.nextLine();

                    try {
                        int difference = differenceInSeconds(start, end);
                        System.out.println("The difference between " + start + " and " + end + " is " + difference + " seconds.");
                    } catch (InvalidTimeException e) {
                        System.out.println(e.getMessage());
                    } catch (NumberFormatException e) {
                        System.out.println("You must enter integers for the hours, minutes, and seconds.");
                    }

                    System.out.println(" ");
                    break;
            }
        }
        System.out.println("Shutting off...");
    }

    //method
    static int differenceInSeconds(String start, String end) throws InvalidTimeException, NumberFormatException{
            //validity check : format
            if ((start.length() != 8) || (end.length() != 8))  { System.out.println("Timestamp must be in format HH:MM:SS"); }

            //string to int conversion: start
                    String h = start.substring(0,2); //creates a substring from start of only the numbers in the hour section
                    int hours = Integer.parseInt(h);  //converts substring h to integer value

                    String m = start.substring(3,5); //creates a substring from start of only the numbers in the minutes section
                    int minutes = Integer.parseInt(m);  //converts substring h to integer value

                    String s = start.substring(6);  //creates a substring from start of only the numbers in the seconds section
                    int seconds = Integer.parseInt(s);  //converts substring h to integer value

            //string to int conversion: end
                    String h2 = end.substring(0,2); //creates a substring from start of only the numbers in the hour section
                    int hours2 = Integer.parseInt(h2);  //converts substring h to integer value

                    String m2 = end.substring(3,5); //creates a substring from start of only the numbers in the minutes section
                    int minutes2 = Integer.parseInt(m2);  //converts substring h to integer value

                    String s2 = end.substring(6);  //creates a substring from start of only the numbers in the seconds section
                    int seconds2 = Integer.parseInt(s2);  //converts substring h to integer value

                //validity check : number ranges
                    if ((0 > hours) || (0 > hours2)) throw new InvalidTimeException("Hours must be greater than or equal to 0.");
                    if ((hours > 23) || (hours2 > 23)) throw new InvalidTimeException("Hours must be less than 24.");

                    if ((0 > minutes) || (0 > minutes2)) throw new InvalidTimeException("Minutes must be greater than or equal to 0.");
                    if ((minutes > 60) || (minutes2 > 60)) throw new InvalidTimeException("Minutes must be less than 60.");

                    if ((0 > seconds) || (0 > seconds2)) throw new InvalidTimeException("Seconds must be greater than or equal to 0.");
                    if ((seconds > 60) || (seconds2 > 60)) throw new InvalidTimeException("Seconds must be less than 60.");


            //hours to minutes
                    //start
                        minutes += hours * 60;
                    //end
                        minutes2 += hours2 * 60;

            //minutes to seconds
                    //start
                        seconds += minutes * 60;
                    //end
                        seconds2 += minutes2 * 60;

            //seconds total
                    int startSecondsTotal = seconds;
                    int endSecondsTotal = seconds2;

            //difference in seconds / return value
                    return endSecondsTotal - startSecondsTotal;

    }
}