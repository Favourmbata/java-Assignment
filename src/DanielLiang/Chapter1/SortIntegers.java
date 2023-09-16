package DanielLiang.Chapter1;

import java.util.Arrays;
import java.util.Scanner;

public class SortIntegers {
    public void sortingIntegers(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first integer");
        int firstNumber = input.nextInt();

        System.out.println("Enter second integer");
        int secondNumber = input.nextInt();

        System.out.println("Enter third integer");
        int thirdNumber = input.nextInt();

      int [] number = {firstNumber,secondNumber,thirdNumber};
        Arrays.sort(number);

        System.out.println("The integer in non decreasing order are:" + number[0] + " "+ firstNumber + " " + secondNumber);
    }

    public static void main(String[] args) {
        SortIntegers sortIntegers = new SortIntegers();
        sortIntegers.sortingIntegers();
    }


}
