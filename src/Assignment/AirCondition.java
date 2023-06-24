package Assignment;

public class AirCondition {

    private  boolean power;
    private  int temperature;


    public int checkTemperature(){
        return temperature;
    }

    public boolean checkPowerStatus() {return power;}


    public void turnOn() {
        power = true;
    }

    public void turnOff() {
        power = false;
    }


    public void increaseTemperature() {
        temperature = temperature + 30;
    }

    public void decreaseTemperature() {
        temperature = temperature - 14;
    }
}