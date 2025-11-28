package IndependentProgram_MusicSystem;

import java.util.ArrayList;

class Playlist extends Music{
    // attributes
    private String name;
    private String description;
    private ArrayList<Song> playlist;  //not static bcs each playlist object will have its own list of songs
    private static int playlistsCounter = 1;

    public Playlist(String name, String description, ArrayList<Song> playlist){
        this.name = name;
        this.description = description;
        this.playlist = playlist;
        this.playlistsCounter++;
    }

    //method to add songs to "playlist"
    public ArrayList<Song> addSong(Song song) {
        //add Song object to playlist
        playlist.add(song);

        return playlist;
    }

    //method to print songs in a playlist
    /* public String displaySongs(){
        Song song = "";
        for (int s=0; s<=playlist.size(); s++){
            while (s<playlist.size()){
                song = playlist.get(s);
                s++;
            }
        }
        return "\n" + song;
    } */

    //method to reward user for certain actions
            //pending implementation....
    public void awards(int song){
        //reward for saving 10 songs
        if (playlist.size() == 10){
            System.out.println("- - Digital DJ - -");
            System.out.println("You've downloaded 10 songs!");
        }
        if (playlistsCounter == 10){
            System.out.println("- - Mixtape Maestro - - ");
            System.out.println("You've made 10 playlists!");
        }
    }

    //setter (description)
    public String setDescription(){
        if (description.equals("")){                    //if the user leaves the description empty..
            description = "None";                           //replace it with the value "None"
        }
        return description;
    }

    //getter (playlist)
    public ArrayList<Song> getPlaylist()  {return playlist;}

    //getter (name)
    public String getPlaylistName() {return name;}

    // toString() method
    public String toString()  {return "Playlist #" + getId() + ":  " + name + "\n   Description: " + description;}
}