package Chibuzor;

public class DisplayFourPattern {

    public int asterisk(int number){

       int row = 6;
       int column = 6;

        for ( row = 1; row <= 6; row++) {
            for ( column = 1; column <= row; column++) {
                System.out.print(column +  "" );
            }
              System.out.print("  " );
            for ( column = 1; column <= number -row ; column++) {
                System.out.print(column + " ");
            }
            for ( column = 1; column <=  row ; column++) {
                System.out.print(" ");
            }
            for ( column = 1; column <= row ; column++) {
                System.out.print(" ");
            }
            for ( column = 1; column <= number -row ; column++) {
                System.out.print(column +" ");
            }
            for ( column = 1; column <= row ; column++) {
               System.out.print(" ");
            }
            for ( column = 1; column <=  row ; column++) {
                System.out.print(column +"");
            }
            System.out.println();


        }
   return  number;
    }

    public static void main(String[] args) {
        DisplayFourPattern displayFourPattern = new DisplayFourPattern();
        displayFourPattern.asterisk(6);
    }
}