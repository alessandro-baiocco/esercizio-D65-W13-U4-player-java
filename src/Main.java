import File.Audio;
import File.File;
import File.Image;
import File.Video;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int volume = 5;
        int luminosita = 5;
        int lunghezzaArray = 0;
        Scanner input = new Scanner(System.in);
        File[] arrayDiFile = new File[5];



        System.out.println("inserire :q per uscire");
        esterno:
        while(lunghezzaArray < 5){
            System.out.println("che tipo di file vuoi creare? Img,Audio o Video ");
            String tipoFile = input.next();
            switch (tipoFile){
                case "Img":{
                    arrayDiFile[lunghezzaArray] = new Image();
                    lunghezzaArray++;
                    break;
                }
                case "Audio":{
                    int durata = Integer.parseInt(input.next());
                    arrayDiFile[lunghezzaArray] = new Audio(durata);
                    lunghezzaArray++;
                    break;
                }
                case "Video":{
                    int durata = Integer.parseInt(input.next());
                    arrayDiFile[lunghezzaArray] = new Video(durata);
                    lunghezzaArray++;
                    break;
                }
                case ":q":{
                    System.out.println("finito?");
                     break esterno;

                }
                default:{
                    System.out.println("eh ? cosa vorresti creare ?");
                }
            }
        }
        System.out.println(Arrays.toString(arrayDiFile));

        input.close();
    }






//        Image primo = new Image();
//        Audio secondo = new Audio(5 , 4);
//        Video terzo = new Video(5 , 4 , 2);
//        terzo.aumentaLuminosita(4);
//
//        int volteDaRiprodurre = secondo.getDuration();
//        int volume = secondo.getVolumeLevel();
//        int luminosita = terzo.getLightLevel();
//        terzo.aumentaLuminosita(10);
//
//        for (int i = 0 ; i < volteDaRiprodurre; i++){
//            System.out.print(terzo);
//        for(int j = 0 ; j < volume; j++){
//            System.out.print("!");
//        }
//            System.out.print(" ");
//        for(int n = 0 ; n < luminosita; n++){
//            System.out.print("*");
//        }
//            System.out.println(" ");
//        }



    private static void whilePerArray(Scanner input){

    }
}