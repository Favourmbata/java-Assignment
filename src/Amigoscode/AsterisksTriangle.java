package Amigoscode;

public class AsterisksTriangle {

  public int asterisks(int number){
      int row = 10;
      int column = 10;

      System.out.println("(a)");
      for ( row = 1; row <= number ; row++) {
          for ( column = 1; column <= row ; column++) {
              System.out.print("*");
          }
          System.out.println();
      }
      System.out.println("(b)");
      for ( row = 1; row <=number ; row++) {
          for ( column = 1; column < number - row +1 ; column++) {
              System.out.print("*");
          }
          System.out.println();
      }
      System.out.println("(C)");
      for ( row = 1; row <= number ; row++) {
          for ( column = 1; column <= row ; column++) {
              System.out.print("*");
          }
          System.out.println();
      }
      System.out.println("(d)");
      for (row  = 1; row <= number ; row++) {
          for ( column = 1; column < number - row +1 ; column++) {
              System.out.print("*");
          }
          System.out.println();
      }

   return number;
  }

    public static void main(String[] args) {
       AsterisksTriangle asterisksTriangle = new AsterisksTriangle();
       asterisksTriangle.asterisks(10);
    }
}
