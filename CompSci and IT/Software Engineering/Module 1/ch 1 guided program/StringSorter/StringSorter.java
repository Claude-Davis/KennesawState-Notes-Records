
import java.io.*;
import java.util.*;

public class StringSorter {
    ArrayList<String> lines;
    

    public void readFromStream(Reader r) throws IOException {
        BufferedReader br = new BufferedReader (r);  //creates an instance of class BufferedReader to read from a character-input stream
                //this class (BufferedReader) allows reading of characters, arrays, and lines
        lines = new ArrayList<String> ();  //creates an arraylist called 'lines' to store the input from the file/stream


        // if the current line is empty, the loop discontinues, othrewise the line is saved to the arraylist "lines"
        while (true) { 
            String input = br.readLine();
            if (input == null) {
                break;
            } else {
                lines.add(input);
            }
            
        }
    }
}