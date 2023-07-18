package ArrayAssigment;

public class LargestNumber {

   public static void largestNumber(){
       int [] array = {10,40,30,20,11,200,812};
       int largest = 0;
      for (int i = 0; i < array.length ; i++) {
         for (int j = 0; j < array.length; j++) {
            if (array[i] > array[j]);
            largest = array[i];
         }
      }
      System.out.println(largest);
   }

   public static void main(String[] args) {
 largestNumber();
   }
}
