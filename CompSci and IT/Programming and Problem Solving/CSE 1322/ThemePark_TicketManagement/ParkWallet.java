//prompt: https://www.kennesaw.edu/ccse/first-year-experience/cse1322l/labs/1322l-lab-4.pdf

class ParkWallet{
    //attributes
    private int tickets; //the absence of "static" allows each instance's value to be unique
    private static boolean holiday = false;  //having this as a static variable sets it the same for all instances of the class

    //constructor w/o parameter
    public ParkWallet(){
        this.tickets = 0;
    }

//

    //behavior
    public void addTickets(int additional){
        if (tickets >= 0){
            this.tickets += additional;
        }
        else if (tickets < 0 ){
            System.out.println("No negative values.");
        }
    }
    //behavior
    public void subtractTickets(int cost) {
        this.tickets -= cost;
    }

//

    //getter function (allow for the private attributes to be accessed/modified outside of the file)
    public int getTickets(){
        return tickets;
    }
    //setter function
    public int setTickets(int balance){
        this.tickets = balance;
        return tickets;
    }

//

    //getter function
    public boolean getHoliday() {
        return holiday;
    }
    //setter function
    public boolean setHoliday(){
        if (holiday) { // if holiday is true..
            this.holiday = false;
        }
        else if (!holiday){  // if holiday is false
            this.holiday = true;
        }
        return holiday;
    }
}
