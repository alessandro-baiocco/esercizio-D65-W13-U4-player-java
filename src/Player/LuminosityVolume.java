package Player;

public class LuminosityVolume {
    private static int lightLevel = 3;
    private static int volumeLevel = 3;

//setters
    public static void aumentaLuminosita(int n){
        if(lightLevel + n < 10){
            lightLevel +=10;
        }
    }
    public static void diminuisciLuminosita(int n){
        if(lightLevel - n > 0){
            lightLevel -= n;
        }
    }


    //setters
    public static void aumentaVolume(int n){
        if(volumeLevel + n <= 10){
            volumeLevel += n;
        }
    }
    public static void diminuisciVolume(int n){
        if(volumeLevel - n > 0){
            volumeLevel -= n;
        }
    }


    public static int volume(){
        return volumeLevel;
    }


    //getters
    public static int luminosita(){
        return lightLevel;
    }



}
