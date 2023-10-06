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
        String[] nomi = new String[5];

        //creazione file

        esternoPrimo:
        while(lunghezzaArray < 5){
            System.out.println("che tipo di file vuoi creare? img, audio o video (inserire :q per uscire) ");
            String tipoFile = input.next().toLowerCase();
            switch (tipoFile){
                case "img":{
                    System.out.println("nome ?");
                    String nomeFile = input.next();
                    nomi[lunghezzaArray] = nomeFile;
                    arrayDiFile[lunghezzaArray] = new Image(nomeFile);
                    lunghezzaArray++;
                    break;
                }
                case "audio":{
                    System.out.println("nome ?");
                    String nomeFile = input.next();
                    System.out.println("durata?(in s)");
                    if(input.hasNextByte()){
                    arrayDiFile[lunghezzaArray] = new Audio((byte) Math.abs(Byte.parseByte(input.next())), nomeFile);
                    nomi[lunghezzaArray] = nomeFile;
                    lunghezzaArray++;
                    } else {
                        System.out.println("non è un numero intero");
                    }
                    break;
                }
                case "video":{
                    System.out.println("nome ?");
                    String nomeFile = input.next();
                    System.out.println("durata?(in s)");
                    if(input.hasNextInt()){
                    arrayDiFile[lunghezzaArray] = new Video(Math.abs(Integer.parseInt(input.next())) , nomeFile);
                    nomi[lunghezzaArray] = nomeFile;
                    lunghezzaArray++;
                    }
                    else {
                        System.out.println("non è un numero intero");
                    }
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
            System.out.println(Arrays.toString(nomi));
            System.out.print("che file vuoi Riprodurre? da 1 a 5 ");
            System.out.print("(0 per uscire | 6 per regolare il volume attuale : (" + volume() + ") ");
            System.out.println(" | 7 per regolare luminosità attuale : (" + luminosita() + ") )");
            if(input.hasNextByte()){
            byte userInput = Byte.parseByte(input.next());
            if(userInput <= 5 && userInput  > 0 ){
                if(arrayDiFile[userInput - 1] == null){
                System.out.println("ops , non c'e niente li");
                } else if (!Objects.equals(arrayDiFile[userInput - 1].getType(), "Image")) {
                    arrayDiFile[userInput - 1].play();
                } else {
                arrayDiFile[userInput - 1].show();
                }
            } else if (userInput == 6) {
                //------------------------------------------------------------Volume------------------------------------
                System.out.println("vuoi aumentare o diminuire il volume (+ per aumentare , - per diminuire)");
                switch (input.next()){
                    case "+":{
                        System.out.println("di quanto? da 0 a 10");
                        if(input.hasNextByte()) {
                            aumentaVolume((Byte.parseByte(input.next())));
                        }else{
                            System.out.println("nope");
                        }
                        break;
                    }
                    case "-":{
                        System.out.println("di quanto? da 0 a 10");
                        if(input.hasNextByte()) {
                        diminuisciVolume(Byte.parseByte(input.next()));
                        }else {
                            System.out.println("nope");
                        }
                        break;
                    }
                    default:{
                        System.out.println("cosa ?");
                    }
                }

                //---------------------------------------------luminosità----------------------------------------------------
            } else if (userInput == 7) {
                System.out.println("vuoi aumentare o diminuire la luminosità (+ per aumentare , - per diminuire)");
                switch (input.next()){
                    case "+":{
                        System.out.println("di quanto? da 0 a 10");
                        if(input.hasNextByte()) {
                            aumentaLuminosita((Byte.parseByte(input.next())));
                        }else{
                            System.out.println("nope");
                        }
                        break;
                    }
                    case "-":{
                        System.out.println("di quanto? da 0 a 10");
                        if(input.hasNextByte()) {
                            diminuisciLuminosita(Byte.parseByte(input.next()));
                        }else {
                            System.out.println("nope");
                        }
                        break;
                    }
                    default:{
                        System.out.println("cosa ?");
                    }
                }
                //---------------------------------------uscire------------------------------------
            }else if(userInput == 0){
            System.out.println("finito");
            break;
            }
            else{
                System.out.println("non è un numero valido");
            }
    }else{
            System.err.println("non è valido");
            break;
        }}
        input.close();
    }

}