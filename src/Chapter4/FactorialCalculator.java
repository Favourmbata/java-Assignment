package Chapter4;

import java.util.Scanner;

public class FactorialCalculator {
   private  double exponetial;
    private int calculate;
    private static int power;


    public static void main(String[] args) {
        FactorialCalculator fave = new FactorialCalculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int calculate = fave.calculate(scanner.nextInt());
        System.out.println((power) + "!: =" + calculate);
    }


    public int calculate(int number) {
         power = number;
        if (number == 0) {
            return 1;
        }
        if (number == 1) {
            return 1;
        }
       if (number < 0){
            terminate();

       }

        calculate = 1;
    while (number > 0){
        calculate = calculate * number;
        number = number - 1;
    }


        return calculate;
    }
   private  static void terminate (){
       System.out.print("cant accept non negative number");
   System.exit(1);
   }


    }



