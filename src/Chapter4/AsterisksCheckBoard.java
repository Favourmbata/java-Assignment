package Chapter4;

public class AsterisksCheckBoard {

    public static void main(String[] args) {
        for (int i = 10; i > 2; i--) {
            for (int j = 2; j < 10 ; j++) {

            }
            System.out.print(i+ "*");
            for (int j = 2; j < i; j++) {
                System.out.println("*");
            }
            System.out.print(" ");
            System.out.println();
        }
    }



}
