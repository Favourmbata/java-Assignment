package ClassTask;

import java.util.Scanner;

public class collectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 0 or 1");
         int number = input.nextInt();
         if (number == 0 )
             System.out.println(1);
         else
             System.out.println(0);

    }
}
//updates method are called mutators:because they change the state of the object deposit,withdraw
//query method
//accessor method