package IndependentProgram_MusicSystem;

class Song extends Music{
    //attributes
    private String title;
    private String artist;

    public Song(String title, String artist){
        this.title = title;
        this.artist = artist;
    }

    //getter (title)
    public String getTitle()  {return title;}

    //getter (artist)
    public String getArtist()  {return artist;}

    // toString() method
    public String toString()  {return "Song #" + getId() + ": '" + title + "' by " + artist;}
}