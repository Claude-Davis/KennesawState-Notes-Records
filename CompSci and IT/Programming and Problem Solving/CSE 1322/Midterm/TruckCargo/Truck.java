public class Truck extends Cargo{
    //attribute
    private Cargo cargo;
    private int id;
    private int nextId = 0;

    public Truck(String description){
        this.id = nextId;
        this.nextId++;
    }

    public int getId(){
        return id;
    }

    public Cargo getCargo(){
        return cargo;
    }

    @Override
    public String toString(){
        if (description.isEmpty()) {
            return "Truck " + id + " is carrying nothing.";
        } else {
            return "Truck " + id + " is carrying " + description;
        }
    }

}
