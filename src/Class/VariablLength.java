package Class;

public class VariablLength {
     public static double average(int... b) {
        if (b.length == 0){
            return  0;
        }
         int sum = 0;
         for (int i = 0; i < b.length; i++) {
             sum += b[i];
         }
     return (double)sum / b.length;
     }

    public static void main(String[] args) {
        System.out.println("The average of 5 and 10 is: " +average(5,10));
        System.out.println("The average of 23 ,78,56 is: " + average(23,78,56));


     }
}
