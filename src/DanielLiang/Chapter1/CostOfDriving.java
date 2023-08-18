package DanielLiang.Chapter1;

import java.util.Scanner;

public class CostOfDriving {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the driving distance-> ");
        double drivingDistance = scanner.nextDouble();

        System.out.println("enter miles per gallon");
        double milesPerGallon = scanner.nextDouble();

        System.out.println("enter price per gallon");
        double pricePerGallon = scanner.nextDouble();

        System.out.println("This is the distance driving ->"+ drivingDistance);
        System.out.println("This is miles per gallon-> " + milesPerGallon);
        System.out.println("This is for price per gallon ->" + pricePerGallon);

        double costOfDriving = drivingDistance / milesPerGallon * pricePerGallon;
        System.out.println("This the total cost driven $ -> " + costOfDriving);
    }

}