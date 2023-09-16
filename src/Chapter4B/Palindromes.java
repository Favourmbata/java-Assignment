package Chapter4B;

import java.util.Scanner;

public class Palindromes {
    public int readingForwardAndBackWard(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter five digits");
        int number = scanner.nextInt();

        int tem = number;
        int rev = 0;
        while (number != 0) {
            rev = rev * 10 + number % 10;
            number = number / 10;
        }
        if (tem == rev){
            System.out.println( "It is palindrome ");
        }else {
            System.out.println("it is not a palindrome");
        }
      return number;
    }

    public static void main(String[] args) {
        Palindromes palindromes = new Palindromes();
        palindromes.readingForwardAndBackWard();
    }

}
