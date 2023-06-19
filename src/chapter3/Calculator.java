package chapter3;

public class Calculator {

  private boolean powerStatus;
    public void powerOn() {
   powerStatus = true;
    }

    public boolean isOn() {
    return powerStatus;
    }

    public void TurnOff(){
        powerStatus = false;
    }

}

