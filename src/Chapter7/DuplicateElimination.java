package Chapter7;

import java.util.Scanner;

public class DuplicateElimination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int []duplicate = new int[10];
        for (int i = 0; i < duplicate.length ; i++) {
            duplicate[i] = -1;

        }
        for (int i = 0; i < duplicate.length ; i++) {
            System.out.println("Enter number between 10 and 100: ");
            int number = input.nextInt();
        }
    }
}
