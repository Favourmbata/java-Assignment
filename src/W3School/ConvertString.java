package W3School;

import java.util.Scanner;

public class ConvertString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter a number(string)");
//        String number = scanner.next();
//        Integer.parseInt(number);
//
//        System.out.println("The converted string is:" +number);


        System.out.println("Enter a  (number)");
        int number = scanner.nextInt();
        String.valueOf(number);

        System.out.println("The converted interger is: "+number);
    }
}
