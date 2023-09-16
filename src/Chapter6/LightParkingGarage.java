package Chapter6;

import java.util.Scanner;
public class LightParkingGarage {
    public double calculatingparkingCharge(int numberOfHours) {


        double minimumFee = 2.00;
        double extraCharge = 0.50 + minimumFee;
        double maximumCharge = 10.00;
        if (numberOfHours <= 3)return minimumFee;
        if (numberOfHours > 3 && numberOfHours < 24);
        if (numberOfHours == 24 )return maximumCharge;
        if (numberOfHours >= 24);
        int differenceOfHour = numberOfHours - 3;

       double total = extraCharge +  minimumFee *  differenceOfHour;

     return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LightParkingGarage lightParkingGarage = new LightParkingGarage();

        System.out.println("Enter number of hours packed");
        int hours = input.nextInt();


        System.out.println("The running total of yesterday receipt " + lightParkingGarage.calculatingparkingCharge(hours));

    }


}