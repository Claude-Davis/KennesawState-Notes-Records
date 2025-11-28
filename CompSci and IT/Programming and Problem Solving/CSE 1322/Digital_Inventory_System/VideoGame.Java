package Digital_Inventory_System;
//subclass of Software

class VideoGame extends Software{
    private boolean multiplayerSupport;

    //constructor
    public VideoGame(String name, double price, String publisher, boolean multiplayerSupport){
        super(name, price, publisher);
        this.multiplayerSupport = multiplayerSupport;
    }

    //getter (multiplayerSupport)
    public boolean getSupport(){
        return multiplayerSupport;
    }

    //setter (multiplayerSupport)
    public Boolean setSupport(String support) {
        if ((support.toLowerCase()).equals("yes") || (support.toLowerCase()).equals("true")){
            this.multiplayerSupport = true;
        } else if ((support.toLowerCase()).equals("no")) {
            this.multiplayerSupport = false;
        }

        return multiplayerSupport;
    }

    @Override
    public String toString(){
        //The "\n" allows the remaining content to be printed on a new line
        return "Item: " + getName() + " (#" + getId() + ")" + " | Price: $" + df.format(getPrice()) + "\n   Publisher: " + getPublisher() + "\n      Multiplayer Support: " + multiplayerSupport;
    }
}