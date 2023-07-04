package Chapter4;

public class checkPattern {

    public static void main(String[] args) {



        int length = 15;
        int height = 8;
        for (int i = 0; i <= height; i++) {

                if (i % 2 == 0) {
                    System.out.println("*");

                }
                else {
                    System.out.println(" ");
                }
            for (int j = 0; j <= length; j++) {
                if (j % 2 == 0) {
                    System.out.println(" ");
                } else if (j != length || i % 2 != 0) {

                    System.out.println(" *");
                }
            }
            System.out.println(" ");
        }
    }
}
