package Jennifer;

import java.util.Scanner;

public class SumFromUser {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


         int count = 0;
          int sum = 0;
          while (count< 5) {
              System.out.println("Enter number");
              int number = input.nextInt();

              sum = sum + number;
              count = count + 1;
          }
        System.out.println(sum);
    }
}
