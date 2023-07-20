package ArrayPractice;

import java.util.Arrays;

public class ArrayOfArray {

    public static void main(String[] args) {
     char [][] letters1 = {{'x', 'o', 'x'},{'o','o','x'},{'o','x','x'}};

       for (char y = 0;y < letters1.length;y++){
           for (int i = 0; i <letters1.length ; i++) {
               System.out.print(letters1[y][i] + " ");
           }
           System.out.println();
       }


    }



 }
