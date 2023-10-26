package Coding;

import java.util.Scanner;

public class EncryptionAndDecription {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String original;
        System.out.println("Enter text for encryption:");
        original =  input.nextLine();

        System.out.println("Enter shift value(between 1 to 26):");
        int shift = input.nextInt();
        System.out.print("Encrypted text is as follows: " );

        for (int i = 0; i < original.length(); i++) {
            int validateCharacter = (int)original.charAt(i);
            char convert;

            if (validateCharacter >= 65 && validateCharacter <= 90){
                convert =  (char)(((validateCharacter - 65) + shift )% 26 + 65);
                System.out.print(convert);
            }
            else if (validateCharacter >= 97 && validateCharacter <= 122){
                convert =  (char)(((validateCharacter + 97) + shift )% 26 + 97);
                System.out.print(convert);
            }else {
                convert = (char)validateCharacter;
                System.out.print(convert);
            }
        }
    }
}
