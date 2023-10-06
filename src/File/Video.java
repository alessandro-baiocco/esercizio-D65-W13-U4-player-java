package File;

import Player.Luminosity;
import Player.Volume;

public class Video extends Volume implements Luminosity {
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

    public void aumentaLuminosita(int n){
        if(this.lightLevel + n < 10){
            this.lightLevel += n;
        }
    }
    public void diminuisciLuminosita(int n){
        if(this.lightLevel - n > 0){
            this.lightLevel -= n;
        }
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
}
