import File.Audio;
import File.File;
import File.Image;
import File.Video;
import Player.LuminosityVolume;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

import static Player.LuminosityVolume.*;

public class Main {
    public static void main(String[] args){

        //variabili
        int lunghezzaArray = 0;
        Scanner input = new Scanner(System.in);
        File[] arrayDiFile = new File[5];
        Image primo = new Image();
        //creazione file

        System.out.println("inserire :q per uscire");
        esternoPrimo:
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
                    System.out.println("durata?(in s)");
                    int durata = Integer.parseInt(input.next());
                    arrayDiFile[lunghezzaArray] = new Audio(durata);
                    lunghezzaArray++;
                    break;
                }
                case "Video":{
                    System.out.println("durata?(in s)");
                    int durata = Integer.parseInt(input.next());
                    arrayDiFile[lunghezzaArray] = new Video(durata);
                    lunghezzaArray++;
                    break;
                }
                case ":q":{
                    System.out.println("finito?");
                     break esternoPrimo;

                }
                default:{
                    System.out.println("eh ? cosa vorresti creare ?");
                }
            }
        }


        //riproduci


        esternoSecondo:
        while (true){
            //--------------------------------------------------------leggere files---------------------------------------------
            System.out.println(Arrays.toString(arrayDiFile));
            System.out.print("che file vuoi Riprodurre? da 1 a 5 ");
            System.out.println("(0 per uscire, 6 per regolare il volume ,7 per regolare luminosità");
            int userInput = Integer.parseInt(input.next());
            if(userInput <= 5 && userInput  > 0 ){
                if(!Objects.equals(arrayDiFile[userInput - 1].getType(), "Image")){
                arrayDiFile[userInput - 1].play();
                }else {
                arrayDiFile[userInput - 1].show();
                }
            } else if (userInput == 6) {
                //------------------------------------------------------------Volume------------------------------------
                System.out.println("vuoi aumentare o diminuire il volume (+ per aumentare , - per diminuire)");
                String plusOMinus = input.next();
                System.out.println("di quanto? da 0 a 10");
                if(Objects.equals(plusOMinus, "+")){
                    aumentaVolume( Integer.parseInt(input.next()));
                }else {
                    diminuisciVolume( Integer.parseInt(input.next()));
                }

                //---------------------------------------------luminosità----------------------------------------------------
            } else if (userInput == 7) {
                System.out.println("vuoi aumentare o diminuire la luminosità (+ per aumentare , - per diminuire)");
                String plusOMinus = input.next();
                System.out.println("di quanto? da 0 a 10");
                if(Objects.equals(plusOMinus, "+")){
                    aumentaLuminosita( Integer.parseInt(input.next()));
                }else {
                    diminuisciLuminosita( Integer.parseInt(input.next()));
                }
                //---------------------------------------uscire------------------------------------
            }else if(userInput == 0){
            System.out.println("finito");
            break;
            }
            else{
                System.out.println("non è un numero valido");
            }
    }
        input.close();
    }

}