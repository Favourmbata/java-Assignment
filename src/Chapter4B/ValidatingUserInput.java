package Chapter4B;

import java.util.Scanner;

public class ValidatingUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1 or 2");
        int number = input.nextInt();

        while (true) {
            System.out.println("You have entered wrong input,choose (1 or 2)");
            number = input.nextInt();

            if (number == 1 || number == 2) {
                break;

            }else {
                System.out.println();
            }
        }


    }

}
