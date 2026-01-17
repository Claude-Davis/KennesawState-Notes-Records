package src;
@Test

import java.util.ArrayList;

public ArrayList<String> removeWhitespace(String user_input) {
    String programCounter = "";
    ArrayList<String> user_input_list = new ArrayList<>();
    
    for (int x=0; x<user_input.length(); x++) {  //cycles through the entire string arg
        //function uses predetermined method 'Character.isWhitespace' to detect whitespace at specfic index
        if (!Character.isWhitespace(user_input.charAt(x))) {
            programCounter += x;
        }

        if (Character.isWhitespace(user_input.charAt(x))) {
            user_input_list.add(programCounter);
            programCounter = "";
        }
    }

    return user_input_list;
}


//description of function:

    /* loop through String type arg and savecurrent index num to var x 

        if the current index is not a whitespace, the value is saved to String var 'programCounter'
            if the next value is also not a whitespace, the value is concacted to the the previous value and saved to 'programCounter'

        if the current or next value is a whitespace, the current value of 'programCounter' is stored into 'user_input_list' and the value of 'programCounter' is reset to null
    
    */