package Multiplication;

import java.io.OptionalDataException;

public class Multiplication {


    public int multiply(int first, int second) {
        int total = 0;

        int number = first;
        for (int i = 0; i <= second; i++) {
           total = total + number;

        }
        System.out.println(total);
        return total;
        }



    public int square(int first, int second) {
     int number = first;
        for (int i = 1; i < second ; i++) {
           number = multiply(number,first);
        }
        System.out.println(number);
        return  number;
    }
//
//
//    public int reverse(int first, int second, int third, int fourth, int fifth) {
//    int reverse = 0;
//    for (int i = array.length -1; i >= 0 ; i--) {
//            System.out.print(reverse[i] + " ");
//        }
//    }
}



