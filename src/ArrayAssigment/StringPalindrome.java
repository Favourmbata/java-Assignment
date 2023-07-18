package ArrayAssigment;

import java.util.Scanner;

public class StringPalindrome {
   static Scanner scanner = new Scanner(System.in);
     public static void stringPalindrome(){
         System.out.println("Enter a String");
          String word = scanner.next();
         for (int i = word.length()-1; i >= 0 ; i--) {
             System.out.print(" " +word.charAt(i));
         }

        }

    public static void main(String[] args) {
 stringPalindrome();
    }

}

