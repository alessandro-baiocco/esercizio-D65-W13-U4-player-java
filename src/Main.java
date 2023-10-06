import File.Audio;
import File.Image;

public class Main {
    public static void main(String[] args) {

        Image primo = new Image();
        Audio secondo = new Audio(5 , 4);

        int volteDaRiprodurre = secondo.getDuration();
        int volume = secondo.getVolumeLevel();

        for (int i = 0 ; i < volteDaRiprodurre; i++){
            System.out.print(secondo);
        for(int j = 0 ; j < volume; j++){
            System.out.print("!");
        }
            System.out.println(" ");
        }





    }
}