
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Driver {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        //title
        System.out.println("[Diff Detector]");

        //prompt user for file names
        System.out.print("Enter the name of file 1: ");
        String file1N = scan.nextLine();
        System.out.print("Enter the name of file 2: ");
        String file2N = scan.nextLine();

        //create File objects of the given names
        File file1 = new File(file1N);
        File file2 = new File(file2N);

        System.out.println("\n" + diff(file1, file2));

        //end of program message
        System.out.println("\nProgram Complete");
    }

    static String diff(File file1, File file2){
        //create Scanner objects to be used to read the files
        Scanner read1 = null;
        Scanner read2 = null;

        //will be used to create String output messages of the results
        StringBuilder lineDiff = new StringBuilder();
        StringBuilder lineNumDiff = new StringBuilder();

        try {
            read1 = new Scanner(file1); //creates a Scanner object of file1 and assigns it to read1; read1 will read file1
            read2 = new Scanner(file2); //creates a Scanner object of file2 and assigns it to read2; read1 will read file2

            int lineTracker = 1; //initiates the tracker to monitor the line number of the files

            while (read1.hasNextLine() || read2.hasNextLine()){
                                                  //" ? : " is a ternary operator; it is a shorthand ig-else
                String line1 = read1.hasNextLine() ? read1.nextLine() : "";  //if read1 has another line, returns "true"; otherwise, read1 is given an empty String
                String line2 = read2.hasNextLine() ? read2.nextLine() : "";  //if read2 has another line, returns "true"; otherwise, read2 is given an empty String

                // IF differing lines
                if (!line1.equals(line2)){ 
                    lineDiff.append("Line " + lineTracker + "\n");
                    lineDiff.append("< " + line1 + "\n");
                    lineDiff.append("> " + line2 + "\n");
                }

                // IF differing number of lines
                if ((read1.hasNextLine() && !read2.hasNextLine()) || (read2.hasNextLine() && !read1.hasNextLine())){
                    lineDiff.append("Files have different number of lines.");
                    lineNumDiff.append("\nFiles have different number of lines.");
                    return lineNumDiff.toString();
                }

                lineTracker++;
            }

            if (lineDiff.length()==0) {
                return "Files are identical.";
            }

        } catch (FileNotFoundException e){      // error
            return e.getMessage();

        } finally {   
            // .close() closes the file
            
            if (read1 != null) {
                read1.close();  
            }
            if (read2 != null) {
                read2.close();
            }
        }

        return lineDiff.toString();
    }
}
