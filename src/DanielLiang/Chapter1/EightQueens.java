package DanielLiang.Chapter1;

import java.util.Scanner;

public class EightQueens {
    public static void main(String[] args) {

        boolean[] schoolLocker = new boolean[100];

        for (int student = 1; student <= 100; student++) {
            for (int locker = student - 1; locker < schoolLocker.length; locker += student) {
                schoolLocker[locker] = !schoolLocker[locker];

            }
        }
        System.out.print("Open lockers:");
        for (int locker = 0; locker < schoolLocker.length; locker++) {
            if (schoolLocker[locker]) {
                System.out.println(locker + 1 + " ");
            }
        }
    }

}