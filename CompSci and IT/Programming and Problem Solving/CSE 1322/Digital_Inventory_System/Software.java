package Digital_Inventory_System;

//sublclass of Item

class Software extends Item{
    private String publisher; //NOTE: this variable must never be empty!

    //constructor
    public Software(String name, double price, String publisher){
        super(name, price);
        this.publisher = publisher;
    }

    //getter (publisher)
    public String getPublisher(){
        return publisher;
    }

    //setter (publisher)
    public String setPublisher(String pub){
        if (pub.equals("")){
            this.publisher = "Unknown";
        } else {
            this.publisher = pub;
        }

        return publisher;
    }

    @Override
    public String toString(){
        return "Item: " + getName() + " (#" + getId() + ")" + " | Price $" + df.format(getPrice()) + "\n   Publisher: " + publisher; //The "\n" allows the remaining content to be printed on a new line
    }
}
