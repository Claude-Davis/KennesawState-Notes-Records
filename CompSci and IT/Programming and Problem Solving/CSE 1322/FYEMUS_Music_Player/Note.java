package FYEMUS_Music_Player;

import java.util.ArrayList;
import javax.sound.midi.*;

public class Note implements FYENote{
    private byte notePlaying;
    private int time;

    public Note(byte notePlaying, int time){
        this.notePlaying = notePlaying;
        this.time = time;
    }

    @Override
    public String getNote(){
        return "Note " + notePlaying;
    }

    @Override
    public String getTime(){
        return "Timing " + time;
    }
}
