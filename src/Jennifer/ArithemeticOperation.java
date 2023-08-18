package Jennifer;

import java.util.Scanner;
public class ArithemeticOperation {
    public String collectNumber(int number){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter firstNumber");
       int firstNumber = scanner.nextInt();
        System.out.println("enter secondNumber");
        int secondNumber = scanner.nextInt();
      int firstNumberSquared = firstNumber * firstNumber  ;
      int secondNumberSquared = secondNumber * secondNumber;

      int sumOfSquare = firstNumberSquared + secondNumberSquared;
       int differenceOfSquare = firstNumberSquared - secondNumberSquared;


     return " The sum of square is " + sumOfSquare + " The difference of square is " + differenceOfSquare;
    }

    public static void main(String[] args) {
        ArithemeticOperation arithemeticOperation = new ArithemeticOperation();
        System.out.println( arithemeticOperation.collectNumber(2));
    }

    public static class VolumeOfCylinder {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the radius of cylinder -> ");
            float radius = scanner.nextFloat();

            System.out.println("enter the length of a cylinder");
            float length = scanner.nextFloat();

         float area = radius * radius * 314159;
          float volume = area * length;

            System.out.printf("the area is   :" + area );
            System.out.println();
            System.out.printf("the volume is  : " +volume);
        }
    }
}
