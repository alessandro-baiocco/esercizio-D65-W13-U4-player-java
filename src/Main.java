import File.Audio;
import File.File;
import File.Image;
import File.Video;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        //variabili
        int volume = 5;
        int luminosita = 5;
        int lunghezzaArray = 0;
        Image immagine = new Image();
        Scanner input = new Scanner(System.in);
        File[] arrayDiFile = new File[5];
        //metodi
//        public void aumentaLuminosita(int n){
//            if(this.lightLevel + n <= 10){
//                this.lightLevel += n;
//            }else{
//                System.out.println("NO TROPPO LUMINOSO , SONO CIECO");
//            }
//        }




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
        System.out.println(Arrays.toString(arrayDiFile));

        //riproduci

        esternoSecondo:
        while (true){
            System.out.println("che file vuoi Riprodurre? da 1 a 5 , (0 per uscire, 6 per regolare il volume attuale: "+ volume + " ,7 per regolare luminosita attuale : " + luminosita);
            int userInput = Integer.parseInt(input.next());
            if(userInput <= 5 && userInput > 0 ){
                arrayDiFile[userInput + 1].play();
            }else if(userInput == 0){
            System.out.println("finito?");
            break;
            }
            else{
                System.out.println("non è un numero valido");
            }
    }
        input.close();
    }





//        Image primo = new Image();
//        Audio secondo = new Audio(5 );
//        Video terzo = new Video(5 , 4 , 2);
//
//
//        int volteDaRiprodurre = secondo.getDuration();
//        int volume = secondo.getVolumeLevel();
//        int luminosita = terzo.getLightLevel();
//
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