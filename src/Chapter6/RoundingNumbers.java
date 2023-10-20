package Chapter6;

import java.util.Scanner;

public class RoundingNumbers {


    public static void main(String[] args) {
        Scanner convert = new Scanner(System.in);
            System.out.print("Please enter value to round , or enter negative number to quit -> ");
            double x = convert.nextDouble();
            double y = Math.floor(x + 0.5);

                boolean is_valid_value = false;
                is_valid_value = x >= 0 ?  true : false;
                if(is_valid_value){
                    System.out.println("The original number was " + x);
                    System.out.println("The rounded number is " + y);
                }
                else {
                    System.out.println("You must be a QA");
                }

//        double x = 0;
//        double y = 0;
//
//        while (x >= 0) {
//            System.out.println("Enter value for to round up,or enter negative to quit:");
//            x = convert.nextDouble();
//            if (x >= 0) {
//                y = Math.floor(x + 0.5);
//
//                System.out.println("The original value was " + x);
//                System.out.println("The rounded value is  " + y);
//
//            }else {
//                System.out.println("You must be high");
//            }
//
//        }
    }
}