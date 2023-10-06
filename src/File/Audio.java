package File;

import Player.Volume;

public class Audio extends Volume {
    int duration;
    int volumeLevel;

    //costruttore

    public Audio(int duration , int volumeLevel){
        this.duration = duration;
        this.volumeLevel = volumeLevel;

    }
    public Audio(int duration ){
        this.duration = duration;
        this.volumeLevel = 5;
    }

    //getters
    public int getDuration() {
        return this.duration;
    }
    public int getVolumeLevel() {
        return this.volumeLevel;
    }

    @Override
    public String toString() {
        return "Audio ";
    }
}
