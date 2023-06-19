package chapter3;

public class ClockTest {
    public static void main(String[] args) {

     Clock clock =  new Clock();
     clock.setValue(03,45,20);
    System.out.println(clock.getHour()+":"+ clock.getMinute()+":"+clock.getSecond());


    }





}
