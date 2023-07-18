package ArrayAssigment;

public class ReverseArray {

   public static void reverseArray(){


       int [] array = new int[]{20,30,40,50,60,80,300};
       for (int i = 0; i <array.length ; i++) {
           System.out.println(array[i]);
       }
       System.out.println();
       for (int i = array.length - 1; i >= 0; i--) {
           System.out.print(array[i] + " ");
       }

   }

    public static void main(String[] args) {
reverseArray();
    }

       }
