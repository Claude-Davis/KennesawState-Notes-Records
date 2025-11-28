package FYEMUS_Music_Player;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main (String[] args) throws FileNotFoundException, FYEMusicPlayerException {
        Scanner scan = new Scanner(System.in);

        System.out.println("[FYE Music Player]");
        int option = 0;

        while (option!=3){
            //menu
            System.out.println("1. Load music");
            System.out.println("2. Play music");
            System.out.println("3. Quit");
            
            System.out.print("Enter option: ");
            option = scan.nextInt();

            switch(option){
                default:
                    if (option!=3){
                        System.out.println("Invalid entry.");
                    }
                    break;
                case 1:                                     // load music
                    //prompt for info
                    System.out.print("Enter music file name: ");
                    String file1N = scan.nextLine();

                    //create a FileInputStream object
                    FileInputStream fileName = new FileInputStream(file1N);

                    //fileName passed to loadMusic()
                    loadMusic(fileName);

                    break;
                case 2:                                       // play music
                    FYEMusicPlayer.play();
                    System.out.println("Playing music...");
                    System.out.println("Done playing music.");
                    break;
            }
        }
        FYEMusicPlayer.close();
        System.out.println("Shutting off...");
    }

    public static ArrayList<FYENote> loadMusic(FileInputStream fis){
        ArrayList<FYENote> notes = new ArrayList<>();  //creates an ArrayList object of FYENote

        try {
            //BufferedReader object created to read the file
            BufferedReader reader = new BufferedReader(new InputStreamReader(fis)); //InputStreamReader reads the file (fis) and converts it from byte data to characters
            String lineTracker;

            //read each line and *parse* it into FYENote object
            while ((lineTracker=reader.readLine())!=null){
                String[] parts = lineTracker.split(" "); //the content of the current line is separated at each space and saved to "parts"
                if (parts.length()==2){
                    String noteTitle = parts[0];
                    int duration = Integer.parseInt(parts[1]); //index 1 of parts is converted to an int and saved to "duration"

                    //create FYENote object and add to "notes" list
                    FYENote n = new FYENote(noteTitle, duration);
                    notes.add(n);
                } else {
                    System.out.println("Invalid line format: "  + lineTracker);
                }
            }

            reader.close(); //closes the file
            System.out.println("Music loaded.");
        } catch (FYEMusicReaderException e){
            System.out.println("Unable to load file: " + e.getMessage() + ".");
        } catch (NumberFormatException e1){
            System.out.println("Conversion error: " + e1.getMessage() + ".");
        }

        return notes;
    }
}
