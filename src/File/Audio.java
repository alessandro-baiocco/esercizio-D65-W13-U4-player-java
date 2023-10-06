package File;

import Player.LuminosityVolume;

public class Audio extends LuminosityVolume implements File{
    int duration;
    private final String type = "Audio";


    //costruttore
    public Audio(int duration ){
        this.duration = duration;
    }

    //getters
    public int getDuration() {
        return this.duration;
    }

    public String getType() {
        return this.type;
    }


    @Override
    public String toString() {
        return "Audio ";
    }
    public void play(){
        for (int i = 0 ; i < this.duration ; i++){
        System.out.print("Audio ");
            for (int j = 0 ; j < volume() ; j++){
                System.out.print("!");
            }
            System.out.println(" ");
        }

        }

    @Override
    public void show() {}
}


