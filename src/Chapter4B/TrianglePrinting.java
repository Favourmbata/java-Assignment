package Chapter4B;

public class TrianglePrinting {

   public int asterisks(int number){

       int row = 10;
       int column = 10;
       System.out.println("(a)        \t(b)      \t(c)  \t(d)");
       for (row  = 1; row <= number ; row++) {
           for (column = 1; column <= row; column++) {
               System.out.print("*");
           }
           for ( column = 1; column <= number - row ; column++) {
               System.out.print(" ");
           }

           for ( column = 1; column <= number -row ; column++) {
               System.out.print("*");
           }
           for ( column = 1; column <=  row ; column++) {
               System.out.print(" ");
           }
           for ( column = 1; column <= row ; column++) {
               System.out.print(" ");
           }
           for ( column = 1; column <= number -row ; column++) {
               System.out.print("*");
           }
           for ( column = 1; column <= row ; column++) {
               System.out.print(" ");
           }
           for ( column = 1; column <= row ; column++) {
               System.out.print("*");
           }
           System.out.println();

       }



    return number;
     }


    public static void main(String[] args) {
        TrianglePrinting trianglePrinting = new TrianglePrinting();
        trianglePrinting.asterisks(10);
   }
    }

