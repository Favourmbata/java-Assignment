package Chapter5.Practice;

import java.util.Scanner;

public class MinimumAndMaximumEtreme {
 static Scanner scanner = new Scanner(System.in);
  public static void minimumAndMaximum(){

      int minimum = Integer.MAX_VALUE;
      int maximum = Integer.MIN_VALUE;
      System.out.println("How many values do you want to input: ");
          int numner = scanner.nextInt();
      for (int i = 0; i <= numner ; i++) {

      }
          if (numner > maximum){
          maximum = numner;
      }
      if (numner < minimum){
          minimum = numner;
      }
          System.out.println("Enter the sum of minimum and"  +minimum);
          System.out.println("The maximum of value is" +maximum);
         System.out.println("sum of the two extremes is");
  }
    public static void main(String[] args) {
minimumAndMaximum();
    }
}
