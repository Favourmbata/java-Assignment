package SalesCommissionCalculator.src;

import java.util.Scanner;

public class SalesCommissionCalculatorMain {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        SalesCommissionCalculator salesCommissionCalculator = new SalesCommissionCalculator();
        System.out.println("Welcome\nplease enter the number sales persons");
        int numberOfSalesPersons = scanner.nextInt();

        int counter = 0;
        while (counter <= numberOfSalesPersons){
            System.out.println("Enter the number of item 1 sold");
            int numberOfItem1 = scanner.nextInt();

            System.out.println("Enter the number of item 2 sold");
            int numberOfItem2 = scanner.nextInt();

            System.out.println("Enter the number of item 3 sold");
            int numberOfItem3 = scanner.nextInt();

            System.out.println("Enter the number of item 4 sold");
            int numberOfItem4 = scanner.nextInt();

            salesCommissionCalculator.setNumberOfItem1Sold(numberOfItem1);
            salesCommissionCalculator.setNumberOfItem2Sold(numberOfItem2);
            salesCommissionCalculator.setNumberOfItem3Sold(numberOfItem3);
            salesCommissionCalculator.setNumberOfItem4Sold(numberOfItem4);

            salesCommissionCalculator.calculateGrossSales();
            System.out.printf("%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%f\n\n","The result for the person ",
                    "Number of items 1 sold ==> ", numberOfItem1, "Number of items 2 sold ==>", numberOfItem2,
                    "Number of items 3 sold ==>", numberOfItem3, "Number of items 4 sold ==>", numberOfItem4,
                    "Gross sales ==> ", salesCommissionCalculator.getGrossSales());
            counter++;
        }
    }
}
