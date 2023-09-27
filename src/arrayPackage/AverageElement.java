package arrayPackage;

public class AverageElement {
    public static void main(String[] args) {
       int [] numbers = {20,40,60,70,6,8,56};
       int sum  = 0;
       int average = 0;
        for (int count = 0; count < numbers.length ; count++) {
            sum += numbers[count];
            average = sum /numbers.length;
        }
        System.out.println("The average element in an array is:" +average);
    }
}
