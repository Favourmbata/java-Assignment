package Chapter4B;

public class CheckerBoard {
    public static void main(String[] args) {
        int column;
        int row;
        for ( column = 1; column <= 8 ; column++) {
            for ( row = 1; row <=column ; row++) {


                System.out.print("*");
                System.out.print(" ");
                System.out.println();
            }

        }

    }
}
