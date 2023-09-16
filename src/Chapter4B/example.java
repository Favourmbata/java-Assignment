package Chapter4B;

import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("""
                press
                1-> English
                2-> Yoruba
                3-> Pidgin
                4-> French
                
                """);

        int userInput = input.nextInt();
        switch (userInput){
            case 1:
                System.out.println("English");
               break;
            case 2:
                System.out.println("Yoruba");
               break;
            case 3:
                System.out.println("Pidgin");
           break;
            case 4:
                System.out.println("French");
               break;
            default:
                System.out.println("Enter something valid");
        }


    }
}
