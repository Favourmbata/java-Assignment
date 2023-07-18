package Chapter5;

import java.util.Scanner;

public class InttegerDivisibleByThree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for ( int i = 1; i <=30 ; i++) {
           if (i % 3 == 0){
               sum+= i;
           }

              System.out.println(sum + " divisibleBy 3 between 1 and 30");
          }
        }



    }






