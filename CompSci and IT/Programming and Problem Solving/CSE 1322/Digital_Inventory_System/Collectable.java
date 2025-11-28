package Digital_Inventory_System;
//subclass of DigitalGood

class Collectable extends DigitalGood{
    private String type;

    public Collectable(String name, double price, String description, String type){
        super(name, price, description);
        this.type = type;
    }

    //getter (type)
    public String getType(){
        return type;
    }

    //setter (type)
    public String setType(String t){
        if (t.equals("emoticon"))  {this.type = t;}
        else if (t.equals("avatar"))  {this.type = t;}
        else if (t.equals("background"))  {this.type = t;}
        else {this.type = "nothing";}

        return type;
    }

    @Override
    public String toString(){
        //The "\n" allows the remaining content to be printed on a new line
        return "Item: " + getName() + " (#" + getId() + ") | Price: $" + df.format(getPrice()) + "\n    Description: " + getDescription() + "\n    Can be used as " + type + ".";
    }
}
