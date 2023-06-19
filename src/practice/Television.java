package practice;


public class Television {
  private int channel;
   private int volume;
    private boolean powerstatus;

    public boolean TelevisionIsOn() {
   return powerstatus;
    }


    public void TelevisionTurnsOn() {
        if(powerstatus == false){
            powerstatus = true;
        }
    }

    public void TelevisionTurnsOff() {
      if(powerstatus == true){
            powerstatus = false;
        }
    }




    public void TelevisionSetChannel(int channel) {
    this.channel = channel;
   if(channel >= 25){
       channel = 25;
   }
    if(channel < 2){
        channel = 2;
    }
    }
   public int checkChannel(){
        return channel;
   }

    public  int checkVolume(){
        return volume;
    }
    public void TelevisionSetVolume(int volume) {
    this.volume = volume;
    if(volume >= 30){
        volume = 30;
    }
   if(volume < 2 ){
       volume = 2;

        }
    }



    public void TelevisionCanChannelUp() {
        channel = channel+2;
        if (channel >= 25){
            channel = 25;
        }
        }


}
