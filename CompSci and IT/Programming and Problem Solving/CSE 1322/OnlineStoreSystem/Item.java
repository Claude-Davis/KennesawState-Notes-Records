public class Item {
    public String description; 
    public double cost;

    public Item(String desc, double cost){
        this.description = desc;
        this.cost = cost;
    }

    public String getDescription(){
        return description;
    }

    public double getCost(){
        return cost;
    }

}
