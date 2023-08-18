package chapter2;

import java.util.Scanner;

public class SeparatingDigitsInInteger {

  public static void spaceNumber(){

      Scanner scanner = new Scanner(System.in);

      System.out.println("enter five number");
      int number = scanner.nextInt();

      int frstNumber = number/10000;


      int secondRemainder = number % 10000;
      int secondNumber = secondRemainder / 1000;


      int thirdRemainder = number % 1000;
      int thirdNumber = thirdRemainder / 100;


      int fourthRemainder = number % 100;
      int fourthNumber = fourthRemainder / 10;


      int fifthRemainder = number % 10;
      int fifthNumber = fifthRemainder;

      System.out.printf("%d %d %d %d %d",frstNumber,secondNumber,thirdNumber,fourthNumber,fifthNumber);

  }
    public static void main(String[] args) {

spaceNumber();
    }


}
