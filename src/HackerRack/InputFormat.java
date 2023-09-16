package HackerRack;

import java.util.Scanner;

public class InputFormat {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

         String result = " ";

         if (n % 2 == 1){
             result = "weird";
         }else if (n >= 6 && n <= 20){
             result = "weird";
         }else {
             result = "not weird";
         }
        System.out.println(result);

    }
}
