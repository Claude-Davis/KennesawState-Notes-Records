import java.util.Scanner;

class Airline{
    public static void main (String[] args){
        Scanner scan = null;

        try {
            String dataline = "";

            File myFile = new File("AirlineFile.txt");
            scan = new Scanner(myFile);

            while (scan.hasNextLine()){
                dataline = scan.nextLine();

                String[] tokens = dataline.split(",");

                for (String s : tokens){
                    System.out.print(s + "\t");
                }

                System.out.println();
            }
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (scan != null){ 
                scan.close();
            }
        }
    }
}