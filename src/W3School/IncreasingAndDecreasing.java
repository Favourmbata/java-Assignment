package W3School;

import java.util.Scanner;

public class IncreasingAndDecreasing {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Enter first number");
        int number1 = console.nextInt();

        System.out.println("Enter second number");
        int number2 = console.nextInt();

        System.out.println("Enter third number");
        int number3 = console.nextInt();

        if (number1 < number2 && number1 < number3){
            System.out.println("Increasing order");
        } else if (number1 > number2 || number1 > number3 || number3 > number2){
            System.out.println("Decreasing order");
            }else {
            System.out.println("OtherWise");
        }
        }
    }

