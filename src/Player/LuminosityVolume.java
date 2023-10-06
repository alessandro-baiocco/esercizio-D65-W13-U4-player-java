package Player;

public abstract class LuminosityVolume {
    private int lightLevel = 3;
    private int volumeLevel = 3;

//setters
    public void aumentaLuminosita(int n){
        if(this.lightLevel + n < 10){
            this.lightLevel +=10;
        }
    }
    public void diminuisciLuminosita(int n){
        if(this.lightLevel - n > 0){
            this.lightLevel -= n;
        }
    }


    //setters
    public void aumentaVolume(int n){
        if(this.volumeLevel + n < 10){
            this.volumeLevel +=10;
        }
    }
    public void diminuisciVolume(int n){
        if(this.volumeLevel - n > 0){
            this.volumeLevel -= n;
        }
    }


    public int volume(){
        return this.volumeLevel;
    }


    //getters
    public int luminosita(){
        return this.lightLevel;
    }



}
