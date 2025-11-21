// package MilitaryTimeConverter;
        //NOTE error: implicitly declared class should not have package declaration

//this class is a subclass of the class "Exception"
public class InvalidTimeException extends Exception{
    InvalidTimeException (String message){
        super(message);
    }
}


//the purpose of this class is to allow the Driver class to throw an exception for errors that are not technically illegal, but that are not desired for the user to be able to do