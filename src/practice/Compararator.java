package practice;

import java.util.Scanner;

public class Compararator {

   private Scanner scanner = new Scanner(System.in);
    public void twoNUmbersComparator() {


        System.out.println("enter first number");
        int number1 = scanner.nextInt();
        System.out.println("enter second number");
        int number2 = scanner.nextInt();

        if (01 == 02) {
            System.out.println(0);
        }
        else if(01 > 02){
            System.out.println(1);

        }
        else {
            System.out.println(-1 );
        }
    }


    public static void main(String[] args) {
    Compararator compararator = new Compararator();
    compararator.twoNUmbersComparator();

    }
}