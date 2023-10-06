package File;
import Player.LuminosityVolume;

public class Video extends LuminosityVolume implements File {
    int duration;



    //costruttori

    public Video(int duration ){
        this.duration = duration;
    }


    //getters
    public int getDuration() {
        return this.duration;
    }



    @Override
    public String toString() {
        return "Video ";
    }
    public void play(){
        for (int i = 0 ; i < this.duration ; i++){
        System.out.print("video " );
        for (int j = 0 ; j < volume() ; j++){
        System.out.print("!");
        }
        System.out.print(" ");
        for (int n = 0 ; n < luminosita() ; n++){
            System.out.print("*");
        }
        System.out.println(" ");
    }
    }

}
