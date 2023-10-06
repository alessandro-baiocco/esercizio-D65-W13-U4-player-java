package File;

import Player.LuminosityVolume;

public class Image extends LuminosityVolume implements File{
    private final int duration = 1;

    //costruttore


    public Image(){}



    //getters
    public int getDuration() {
        return this.duration;
    }

    @Override
    public String toString() {
        return "Immagine " ;
    }

    public void play(){
        System.out.print("imagine ");
        for (int i = 0 ; i < luminosita() ; i++){
        System.out.print("*");
        }
        System.out.println(" ");

    }


}
