package IndependentProgram_MusicSystem;

abstract class Music{
    //attributes
    private int id;
    private static int nextId = 0;

    public Music(){
        this.id = nextId;
        this.nextId++;
    }


    //getter (id)
    public int getId()  {return id;}
}