package Chapter4;

import java.util.Scanner;

public class SumEvenAndOddInteger {
     Scanner input = new Scanner(System.in);

    public static void sumEvenAndOddInteger() {
        int counter = 0;
        int sumEven = 0;
        int sumOdd = 0;
        System.out.println("Enter an integer");
        if (counter % 2 == 0 && 2 != 0) {
            System.out.println("sumEven" + sumEven);
        } else {
            System.out.println("sumOdd" + sumOdd);
        }
    }



    public static void main(String[] args) {
sumEvenAndOddInteger();
    }
}

