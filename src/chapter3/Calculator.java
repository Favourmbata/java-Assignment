package chapter3;

public class Calculator {
    private boolean powerMode;
    private int addition;

    public boolean checkPowerMode() {
        return powerMode;
    }

    public void powerOnOrOff() {
        if (this.powerMode == false)
            powerMode = true;
    }

    public int addNumbers(int num1, int num2) {
        return num1 + num2;
    }



}





