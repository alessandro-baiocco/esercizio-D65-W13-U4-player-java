package File;

import Player.Luminosity;

public class Image implements Luminosity {
    private int lightLevel;
    private final int duration = 1;

    //costruttore

    public Image(int lightLevel){
        this.lightLevel = lightLevel;
    }

    public Image(){}


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


}
