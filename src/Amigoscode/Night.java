package Amigoscode;
import java.util.Scanner;
public class Night {
    public static void main(String[] args) {
        int number1;
        int number2;
        int number3;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number1");
        number1 = input.nextInt();


        System.out.println("Enter number2");
        number2 = input.nextInt();


        System.out.println("Enter number 3");
        number3 = input.nextInt();

        int maxi = 0;
        if (number1 > number2 && number1 > number3) maxi = number1;
        else if (number2 > number1 && number2 > number3) maxi = number2;

        else if (number3 > number2 && number3 > number1) maxi = number3;

        else if (number1 == number2 && number1 == number3) maxi = number1;
        else if (number2 == number1 && number2 == number3) maxi = number2;
        else if (number3 == number2 && number3 == number1)maxi = number3; {
            System.out.println(maxi);
        }
        {
        }
    }
    }




