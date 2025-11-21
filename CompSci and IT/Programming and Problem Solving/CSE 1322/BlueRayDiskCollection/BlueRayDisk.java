

class BlueRayDisk{
    private String title;
    private String director;
    private int yearOfRelease;
    private double cost;
    public BlueRayDisk next;  //is of type BlueRayDisk

    BlueRayDisk (String title, String director, int yearOfRealease, double cost){
        this.title = title;
        this.director = director;
        this.yearOfRelease = yearOfRealease;
        this.cost = cost;
        this.next = null;
    }

    @Override
    public String toString(){
        return title + " - " + director + "(" + yearOfRelease + "): $" + cost;
    }
}