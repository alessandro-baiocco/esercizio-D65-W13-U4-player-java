package Player;

public class Volume {
    protected int volumeLevel;


    public void aumentaLuminosita(int n){
        if(this.volumeLevel + n < 10){
            this.volumeLevel +=10;
        }
    }
    public void diminuisciLuminosita(int n){
        if(this.volumeLevel - n > 0){
            this.volumeLevel -= n;
        }
    }

    


}
