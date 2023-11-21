package ArrayTask;


import java.util.Scanner;

//write a program that displays the sum ,product,and
//average of the element of an integer array.
public class DisplaySumProductAndAverage {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int[] array = {2,4,1,5,8};

        int sum = 0;
        int product = 1;
        double   average = 0;
        for (int i = 0; i < array.length ; i++) {
            sum+= array[i];
            product *= array[i];
            average = (double) sum/array.length;

        }
        System.out.println("sum= " + sum + " product= "  + product + " average= " +average);

    }


}