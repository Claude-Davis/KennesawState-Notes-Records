package  IndependentProgram_MusicSystem;

import java.util.ArrayList;
import  java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Song> songs = new ArrayList<>();              //list to store all individually downloaded songs
        ArrayList<Playlist> allPlaylists = new ArrayList<>();       //list to store all playlists

        //title
        System.out.println("{Music System}");
        System.out.println(" ");

        //initialize "option"
        int option = 0;

        while (option != 9){
            //menu
            System.out.println("1. Download a song");
            System.out.println("2. Make a playlist");
            System.out.println("3. Add a song to a playlist");
            System.out.println("4. Display songs");
            System.out.println("5. Display playlists");
            System.out.println("6. Search songs");
            System.out.println("7. Delete a song");
            System.out.println("8. Delete a playlist");
            System.out.println("9. Exit program");
            System.out.println("Enter option: ");
            option = sc.nextInt();


            switch(option){
                default:
                    if (option != 9)  {System.out.println("Invalid Entry");}
                break;
                case 1:                                                                             // 1. download a song
                    //prompt for information
                        System.out.print("Enter the  Song's Title: ");
                            sc.nextLine();
                            String title = sc.nextLine();
                        System.out.print("Enter the Artist's Name: ");
                            String artist = sc.nextLine();
                        
                    //create object of class Song
                        Song newSong = new Song(title, artist);

                    //save song to "songs" list
                        songs.add(newSong);

                    //statement
                        System.out.println("New song downloaded!");

                break;
                case 2:                                                                             // 2. Make a playlist
                    //prompt for information
                        System.out.print("Name your playlist: ");
                            sc.nextLine();
                            String name = sc.nextLine();
                        System.out.println("Enter a description: ");
                            String description = sc.nextLine();
                        System.out.println("Enter 'yes' to add songs to your playlist, or enter 'done' to move on: ");
                        //initliaze "cont" and ArrayList "playlist"
                            String cont = sc.nextLine();
                            ArrayList<Song> playlist = new ArrayList<>();
                            while (!cont.equalsIgnoreCase("done")){              //NOTE: method .equalsIgnoreCase; a quicker way to compare strings and ignore differences in letter cases
                                if (cont.equalsIgnoreCase("yes")){
                                    //prompt for info
                                        System.out.print("Title: ");
                                            //sc.nextLine();
                                            String titleP = sc.nextLine();
                                        System.out.print("Artist Name: ");
                                            String artistP = sc.nextLine();
                                    //create object of song
                                            Song playlistSong = new Song(titleP, artistP);
                                        //add Song object to "playlist" list
                                            playlist.add(playlistSong);
                                }
                                System.out.print("Add another song? ");
                                cont = sc.nextLine();
                            }
                    
                    //create object of class Playlist
                        Playlist newPlaylist = new Playlist(name, description, playlist);
                        newPlaylist.setDescription();

                    //add Playlist object to "allPlaylists" ArrayList
                        allPlaylists.add(newPlaylist);

                    //statement
                        System.out.println("New playlist created!");

                break;
                case 3:                                                                         // 3. add songs to playlist
                    //decide which playlist to add to
                        System.out.println("What playlist do you want to add songs to?");
                            //list all playlists
                                for (int p=0; p<=allPlaylists.size(); p++){
                                    while(p<allPlaylists.size()){
                                        System.out.println(allPlaylists.get(p).toString());
                                        p++;
                                    }
                                }
                        System.out.println(" ");
                        System.out.print("Enter id # : ");
                        int playlistId = sc.nextInt();
                        for (int p=0; p<=allPlaylists.size(); p++) {
                            if (allPlaylists.get(p).getId() == playlistId) {
                                //prompt for info
                                    System.out.print("Enter song title: ");
                                        title = sc.nextLine();
                                        sc.nextLine();
                                    System.out.print("Enter artist name: ");
                                        artist = sc.nextLine();
                                //create Song object
                                    Song song = new Song(title, artist);

                                allPlaylists.get(p).addSong(song);
                            }
                        }

                    
                break;
                case 4:                                                                             // 4. list all songs
                    //list which songs?
                        //menu
                            System.out.println("1. List individually downloaded songs");
                            System.out.println("2. List songs from a playlist");
                            System.out.println("3. Return to main menu");
                            System.out.print("Choice #: ");
                            int option4 = sc.nextInt();
                        //switch statement
                            switch(option4){
                                default:
                                    System.out.println("Invalid Entry");
                                case 1:                                                                     //list all individual songs
                                    for (int s=0; s<=songs.size(); s++){
                                        while (s<songs.size()){
                                            System.out.println(songs.get(s).toString());
                                            s++;
                                        }
                                    }
                                break;
                                case 2:                                                                      //list songs in a playlist
                                    //list all playlists
                                        for (int p=0; p<=allPlaylists.size(); p++){
                                            while(p<allPlaylists.size()){
                                                System.out.println(allPlaylists.get(p).toString());
                                                p++;
                                            }
                                        }
                                    //choose a playlist
                                        /* System.out.print("Enter id #: ");
                                        int chosenPlaylist = sc.nextInt();
                                        for (int p=0; p<=allPlaylists.size(); p++){
                                            while(p<allPlaylists.size()){
                                                if (allPlaylists.get(p).getId() == chosenPlaylist){
                                                    System.out.println(allPlaylists.get(p).displaySongs());     //calls the listSongs method for that playlist
                                                }
                                                p++;
                                            }
                                        } */
                                break;
                                case 3:

                                break;
                            }

                break;
                case 5:                                                                             // 5. list all playlists
                    //loop to call/print toString() method for each Playlist object
                    for (int p=0; p<=allPlaylists.size(); p++){
                        while(p<allPlaylists.size()){
                            System.out.println(allPlaylists.get(p).toString());
                            p++;
                        }
                    }
                break;
                case 6:                                                                             // 6. search all songs
                    //menu 2
                        System.out.println("1. Search by title");
                        System.out.println("2. Search by artist");
                        System.out.println("3. Return to main menu");
                        System.out.print("Choice #");
                        int option6 = sc.nextInt();
            
                        switch(option6){
                            default:                                                         //default case
                                System.out.println("Invalid Entry");
                                break;
                            case 1:                                                                 //search by title
                                //prompt for song title
                                    System.out.println("Enter song title: ");
                                    sc.nextLine();
                                    String songTitle = sc.nextLine();

                                //search "songs" list for matching "title"
                                    for (int t=0; t<=songs.size(); t++){
                                        while (t<songs.size()){
                                            if ((songs.get(t).getTitle().toLowerCase()).contains(songTitle.toLowerCase())){
                                                System.out.println(songs.get(t).toString());
                                            } else if (false)  {System.out.println("There are no songs with this title.");}
                                            t++;
                                        }
                                    }

                            break;
                        case 2:                                                                //search by artist
                            //prompt for artist name to search for
                                System.out.println("Enter artist name: ");
                                sc.nextLine();
                                String artistName = sc.nextLine();

                            //search "songs" list for matching "artist"
                                for (int a=0; a<=songs.size(); a++){
                                    while (a<songs.size()){
                                        if ((songs.get(a).getArtist().toLowerCase()).contains(artistName.toLowerCase())){
                                            System.out.println(songs.get(a).toString());
                                        } else if (false)   {System.out.println("No songs match this artist.");}
                                        a++;
                                    }
                                }

                            break;
                        case 3:                                                             //return to main menu 

                            break;
                    }

                break;

                case 7:                                                              // 7. delete songs
                    // menu 3
                        System.out.println("1. Delete a downloaded song");
                        System.out.println("2. Delete from a playlist");
                        System.out.print("Choice #");
                        int option7 = sc.nextInt();

                        switch(option7){
                            default:                                                       // default case
                                System.out.println(" ");
                                System.out.println("Invalid Entry");
                                break;
                            case 1:                                                     // delete a song (id # req.)
                                //enter id # to delete the corresponding song
                                    System.out.print("Enter song id #: ");
                                    int deleteSong = sc.nextInt();

                                // delete song from "songs" list
                                    boolean found = false;
                                    for (int d=0; d<songs.size(); d++){
                                        while (d<songs.size()){
                                            if (songs.get(d).getId() == deleteSong){
                                                songs.remove(d);
                                                found = true;
                                            } else {
                                                found = false;
                                            }
                                            d++;
                                        }  
                                    }

                                //statement
                                    if (found)  {System.out.println("Song deleted.");}
                                    else if (!found)  {System.out.println("There is no song with this id #.");}
                                    

                                break;
                            case 2:                    
                                //

                            break;
                        }

                break;
                case 8:                                                                                    // 8. delete playlists
                    // enter id # to delete the corresponding playlist
                    System.out.print("Enter playlist id #: ");
                        int deletePlaylist = sc.nextInt();
                    
                    //search for matching id #
                    for (int d=0; d<= allPlaylists.size(); d++){
                        if (allPlaylists.get(d).getId() == deletePlaylist) {
                            allPlaylists.remove(d);
                        } else if (false) {System.out.println("There is no playlist with this id #.");}
                        d++;
                    }

                    //statement
                    System.out.println("Playlist deleted.");

                break;
            }
        }
        System.out.println(" ");
        System.out.println("Goodbye!");
    }
}