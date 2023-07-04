package Chapter4;

import java.util.Scanner;

public class palindromeDigit {

    public static Scanner  input = new Scanner(System.in);

    public static String palindrome(){
        System.out.println("Enter a five digit number: ");
        int userInput = getUserInput();
        while (!validateDigit(userInput)){
            System.out.println("Please Enter a five digit number: ");
            userInput = getUserInput();
        }
        String palin = Integer.toString(userInput);
        if(palin.charAt(0) == palin.charAt(4) && palin.charAt(1) == palin.charAt(3)){
            return userInput+ " is a Palindrome";
        }
        return userInput+ " is not a Palindrome";
    }

    private static int getUserInput() {
        return input.nextInt();
    }

    public static boolean validateDigit(int userInput){
        return Integer.toString(userInput).length() == 5;
    }

    public static void main(String[] args) {
        System.out.println("Samson".charAt(4));
    }

}
