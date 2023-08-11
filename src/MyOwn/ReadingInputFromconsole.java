package MyOwn;

import java.util.Scanner;

public class ReadingInputFromconsole {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("what is your name");
        String name = scanner.next();
        System.out.println("your name is: " +name);
    }


}
