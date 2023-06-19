package chapter3;

public class Clock {

    private int hour;
    private int minute;
    private  int second;


 public Clock(){}
    public Clock(int hour,int minute,int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void setHour(int hour){
        this.hour = hour;
    }
    public void setMinute(int minute){
        this.minute = minute;
    }
    public  void setSecond(int second){
        this.second = second;
    }

    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return  minute;
    }
    public int getSecond(){
        return  second;
    }

    public void setValue(int hour, int minute,int second){
      if(hour > 23){
        hour = 0;
      }
        if(minute > 59 ){
           minute = 0;
        }
        if(second > 59){
           second = 0;
        }
    }
    public String displayTime(){
        return String.format("%d : %d : %d ",hour,minute,second);
    }

}
