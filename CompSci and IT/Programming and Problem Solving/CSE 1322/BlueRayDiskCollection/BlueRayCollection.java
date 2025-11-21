

public class BlueRayCollection {
    private BlueRayDisk head;

    public BlueRayCollection(){
        this.head = null;
    }

    public void addDisk(String title, String director, int yearOfRealease, double cost){
        BlueRayDisk newDisk = new BlueRayDisk(title, director, yearOfRealease, cost);
        if (head==null){
            head = newDisk;
        } else {
            BlueRayDisk collection = head;
            while (collection.next != null){
                collection = collection.next;
            }
            collection.next = newDisk;
        }
    }

    public String showAll(){
        if (head==null){
            return " ";
        }

        StringBuilder fullCollection = new StringBuilder();
        BlueRayDisk collection = head;

        while (collection != null){
            fullCollection.append(collection.toString()).append("\n");
            collection = collection.next;
        }

        return fullCollection.toString();
    }
}
