package W3School;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class convertingTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter seconds");
        int seconds = input.nextInt();


        int s = seconds % 60;
        int h = seconds / 60;
        int m = h % 60;
        h = h / 60;
        System.out.println(h + ": " + m + " :" + s);
    }
}
