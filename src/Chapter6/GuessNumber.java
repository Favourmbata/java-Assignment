package Chapter6;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Random random = new Random();

        Scanner input = new Scanner(System.in);
        int numberToGuess = input.nextInt();
        while (true) {

            System.out.println("Enter numbers between 1 and 100");
            int userGuess = input.nextInt();

            if (numberToGuess >  userGuess){
              System.out.println("Too high,try again:");
          }else if (numberToGuess < userGuess){
                System.out.println("Too low, try again:");
            }else {
                System.out.println("Congratuation!you guessed the number");
            }

        }
    }
}
