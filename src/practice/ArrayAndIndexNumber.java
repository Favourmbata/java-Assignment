package practice;

import java.util.Scanner;

public class ArrayAndIndexNumber {

public static String arrayAndIndexNumber(int[]array, int index){

        if (index > array.length)return "invalid ";
       return  "this is  "+array[index];

        }

        public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);



                System.out.println("enter the number of index of the array");

        int[] array = {7,0,6,6,9};
             //   System.out.println(arrayAndIndexNumber(array));

        }


}
