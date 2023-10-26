package Coding;

public class DoThis {
    public static void main(String[] args) {
        int a = 6;
        int b = 12;
        int c = 18;
        int count = 1;
        for (int max = 1; max < a; max++) {
            if (a % max == 0 && b % max == 0 && c % max == 0) {
                count = max;
            }
        }

        System.out.println(count);
    }
}