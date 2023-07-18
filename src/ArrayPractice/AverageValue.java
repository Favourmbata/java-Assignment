package ArrayPractice;

public class AverageValue {

    public static void averageValue(){
      int [] value = {15,44,13,9,30,-4,90,200};
       double sum = 0;
       double average = 0;
        for (int i = 0; i < value.length ; i++) {
            sum = sum + value[i];
        }
          average= sum/value.length;
        System.out.println("The average value is: " + average);

    }

    public static void main(String[] args) {
 averageValue();
    }
}
