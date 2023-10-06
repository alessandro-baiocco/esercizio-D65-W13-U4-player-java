package File;

import Player.Luminosity;
import Player.Volume;

public class Video implements File {
    int duration;
    int volumeLevel;
    int lightLevel;

    //costruttori
    public Video(int duration , int volumeLevel , int lightLevel){
        this.duration = duration;
        this.volumeLevel = volumeLevel;
        this.lightLevel = lightLevel;
    }
    public Video(int duration ){
        this.duration = duration;
        this.volumeLevel = 5;
        this.lightLevel = 5;
    }


    //getters
    public int getDuration() {
        return this.duration;
    }
    public int getLightLevel() {
        return this.lightLevel;
    }
    public int getVolumeLevel() {
        return this.volumeLevel;
    }


    @Override
    public String toString() {
        return "Video ";
    }
    public void play(){
        System.out.println("video ");
    }

}
