package Jennifer;

import java.util.Scanner;

public class Try {
    public static void main(String[] args) {

          Scanner input = new Scanner(System.in);
          Scanner input1 = new Scanner(System.in);


        while (true) {

            System.out.println("Enter miles driven");
            double milesDriven = input.nextDouble();

            System.out.println("Enter gallons used");
            double gallonsUsed = input.nextDouble();


            System.out.println("Enter miles per gallon");
            double milesPerGallon = input.nextDouble();

          double total = milesDriven / gallonsUsed *(milesPerGallon);
            System.out.println("The total is " +total);

            System.out.println("""
                    Do you want to perform another operation
                    press anything to continue
                    press no to quit
                    
                    """);
                  String again = input1.next();
                  if (again.equalsIgnoreCase("no"))  break;
                  }

        }


    }
