package Chapter7;

public class PixelQuantization {
    public static void main(String[] args) {
        int[] myArray = {10, 25, 45, 70, 95, 110, 125, 150, 180, 200};
        for (int i = 0; i < myArray.length; i++) {
            int value = myArray[i];

            if (value >= 0 && value <= 20) {
                myArray[i] = 10;
            } else if (value >= 21 && value <= 40) {
                myArray[i] = 30;
            } else if (value >= 41 && value <= 60) {
                myArray[i] = 50;
            } else if (value >= 61 && value <= 80) {
                myArray[i] = 70;
            } else if (value >= 81 && value <= 100) {
                myArray[i] = 90;
            } else if (value >= 101 && value <= 120) {
                myArray[i] = 110;
            } else if (value >= 121 && value <= 140) {
                myArray[i] = 130;
            } else if (value >= 141 && value <= 160) {
                myArray[i] = 150;
            } else if (value >= 161 && value <= 180) {
                myArray[i] = 170;
            } else {
                myArray[i] = 190;
            }
        }
             for (int i = 0; i <myArray.length ; i++) {
            int value = myArray[i];
                 System.out.println(value);
        }

        }

    }


