package practice;


public class Television {
   private int volume;
  private  int channel;
    private boolean powerBotton;

   public  int changeChannel(){return channel;}
    public boolean checkPowerBotton() {
        return powerBotton;
    }

    public int checkVolume(){return volume;}
    public void turnOn() {
  powerBotton = true;
    }


    public void turnOff() {
        powerBotton = false;
    }

    public void increseVolume() {
        volume = volume + 26;
    }

    public void decreaseVolume() {
        volume -=20;
    }

    public void channelUp() {
        channel = channel +70;
    }
}
