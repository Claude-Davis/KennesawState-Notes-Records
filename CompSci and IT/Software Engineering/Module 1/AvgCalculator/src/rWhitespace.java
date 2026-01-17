package src;
import java.util.ArrayList;


public class rWhitespace {
    private ArrayList<String> user_nums_list;

    public rWhitespace(ArrayList<String> user_nums_list) {
        this.user_nums_list = user_nums_list;
    }

    //getter funtcion
    public ArrayList<String> getArrayList() {
        return user_nums_list;
    }

    //function to remove whitespaces and save input into arraylist
    public static ArrayList<String> removeWhitespace(String user_input) {
        String programCounter = ""; 
        
        for (int x=0; x<user_input.length(); x++) {  //cycles through the entire string arg
            //function uses predetermined method 'Character.isWhitespace' to detect whitespace at specfic index
            if (!Character.isWhitespace(user_input.charAt(x))) {
                programCounter += user_input.charAt(x);
            } else {
                if (Character.isWhitespace(user_input.charAt(x))) {
                    this.user_nums_list.add(programCounter);
                    programCounter = "";
                }
            }

            
        }

        //ensures the final values in programCounter are saved to arraylist
        if (!programCounter.equals("")) {
            this.user_nums_list.add(programCounter);
        }

        return user_nums_list;
    }
}


//description of function:

    /* loop through String type arg and savecurrent index num to var x 

        if the current index is not a whitespace, the value is saved to String var 'programCounter'
            if the next value is also not a whitespace, the value is concacted to the the previous value and saved to 'programCounter'

        if the current or next value is a whitespace, the current value of 'programCounter' is stored into 'user_input_list' and the value of 'programCounter' is reset to null
    
    */