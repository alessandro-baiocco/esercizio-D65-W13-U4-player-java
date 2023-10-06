package File;

import Player.Volume;

public class Audio extends Volume {
    int duration;

    //costruttore
    public Audio(int duration , int volumeLevel){
        this.duration = duration;
        this.volumeLevel = volumeLevel;

    }
    public Audio(int duration ){
        this.duration = duration;
        this.volumeLevel = 5;
    }

}
