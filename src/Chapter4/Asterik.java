package Chapter4;

public class Asterik {

    public static void main(String[] args) {


        for (int k = 0; k < 1; k++) {


            for (int i = 0; i < 11; i++) {
                for (int j = 11 - i;j > 0;j++) {
                    System.out.print("#");
                }
                for (int j = 11 - i; j > 0; j--) {
                    System.out.print("#");
                }
                for (int j = 11 - i; j > 0; j--) {
                    System.out.print("#");
                }

                System.out.println();
            }

            System.out.println();
            for (int i = 0; i < 11; i++) {
                for (int j = 11 - i; j > 0; j--) {
                    System.out.print("#");
                }
                System.out.println();
            }



        }
        for (int i = 0; i < 11 ; i++) {
            for (int j = 11 - i ; j > 0 ; j--) {
                System.out.print("#");
            }
            System.out.println();
        }

        for (int i = 0; i < 11 ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    }