package Chapter6;

import java.util.Scanner;

public class BikeTest {
    public static void main(String[] args) {
        Bike bike = new Bike();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of bike");
        String bikeName = scanner.nextLine();
        bike.setName("name");


        System.out.println("Is bike on");
        boolean on = scanner.hasNextBoolean();
        bike.setOn();



        System.out.println("The bike name is->"+bikeName);
        System.out.println("THe bike is on->"+on);
    }




}
