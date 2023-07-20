package Chapter4;

import java.util.Scanner;

public class SalesCommissionCalculator {

public static String salesCommissionCalculator(double totalSales,int numberOfItemSold, String salesManName){
     double salesPersonsEarnings = 9 * totalSales /100 ;
      return String.format( """
              sales man's name ->  %s
              total value sold for the week -> %f
              number of item sold for the week -> %d 
              %s earning for the week -> %f
              """,salesManName,
              totalSales,
              numberOfItemSold,
              salesManName,
              salesPersonsEarnings);

}

    public static void main(String[] args) {

    int counter = 0;
    int number =1;
    double value = 0;
        Scanner inputCollctor = new Scanner(System.in);
        Scanner inputCollctor1 = new Scanner(System.in);




        System.out.println("enter sale man name ");
        String salesManName = inputCollctor.next();
    while (true){


        System.out.println("please enter price " +number);
         value = value + inputCollctor1.nextDouble();
         counter++;
         number++;

        System.out.println("enter -1 to exist\n" +
                "press 1 to continue");
              int option = inputCollctor1.nextInt();
              if (option == -1) break;

    }


        System.out.println(salesCommissionCalculator(value, counter, salesManName));

    }



}
