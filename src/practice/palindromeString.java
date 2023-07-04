package practice;

import java.util.Scanner;

public class palindromeString {

  private Scanner scanner = new Scanner(System.in);

    public  void palindrome(){

        System.out.println("Enter your String");
        String str = scanner.next();
        String org_Str = str;
        String rev = " ";

        int len = str.length();
        for (int i = len -1; i >= 0; i--) {
            rev = rev+str.charAt(i);
        }
        if (org_Str.equals(rev))
        System.out.println(org_Str+"  is a palindrome String");
        else {
            System.out.println(org_Str+" is not palindrome String");
        }
    }

    public static void main(String[] args) {
        palindromeString palindromeString = new palindromeString();
        palindromeString.palindrome();
    }
    }



