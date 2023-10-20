public class Mp3Player{


   private  int song;
   private  int volume;
   private boolean powermode;
   private boolean playSong;


    public void turnOn() {
        powermode = true;

    }


   public  boolean checkPlaySong()
   {
       return playSong;}
    public boolean checkPowerMode(){
        return powermode;
    }


    public void turnOff() {
   powermode = false;

    }


    public void nextSong(){
        song = song +1;
    }


    public String checkCurrentSong() {
        return "i'm playing song -> "+song;
    }

    public void playPreviousSong() {
        song = song -1;
    }

    public void playSong(){
        playSong = true;
    }


     public void increseVolume() {
         this.volume = volume += 5;

     }
    public int checkVolume(){return volume;}


    public void decreaseVolume() {
        this.volume = volume -= 5;
    }

    public void pauseSong() {
        playSong = false;



        }



    }




