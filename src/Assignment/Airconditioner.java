package Assignment;

public class Airconditioner {

    private int temperature;
    private boolean powerStatus;

    public boolean isOn() {
        return powerStatus;

    }

    public void turnOnAircondition() {
        if (powerStatus == false) {
            powerStatus = true;
        }


    }

    public void turnOffAircondition() {
        if (powerStatus == true) {
            powerStatus = false;
        }
    }

    public void increaseTemperature() {
        temperature = temperature + 4;
        if (temperature >= 30) {
            temperature = 30;
        }
    }

    public int valueOfTemperature() {
        return temperature;
    }


    public void decreaseTemperature() {
        temperature = temperature - 4;
        if (temperature <= 16) {
            temperature = 16;
        }
    }
}