package DanielLiang.Chapter1;

import java.util.Scanner;

public class CountLetters {
    public static int countLetters(String letters) {
         int count = 0;
        for (int i = 0; i < letters.length() ; i++) {
            char save = letters.charAt(i);
                count++;
            }
        return count;
    }
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String letters = input.nextLine();

        int numberOfCount = countLetters("favourGirl");
        System.out.println("The total count is: "+numberOfCount);

    }
}
