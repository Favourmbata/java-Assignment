package practice;

public class AsterikSameLine {
    public static void main(String[] args) {

        int n = 15;
        for (int i = 1; i <= n ; i++) {

            for (int j = i; j <= n; j++) {
                System.out.print(".");
            } for (int j = i; j <= n; j++) {
                System.out.print(".");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }


    }
}