package Chapter6;

import java.util.Random;
import java.util.Scanner;

public class RandomGuess {
    public static void main(String[] args) {

        Random random = new Random();

        Scanner input = new Scanner(System.in);
        int numberToGuess = random.nextInt(1000) + 1;

        while (true) {
            System.out.println("Enter numbers between 1 and 1000");
          int guessNumber = input.nextInt();

           if (guessNumber != guessNumber){

           }

        }


    }
}
