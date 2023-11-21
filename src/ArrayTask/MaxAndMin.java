package ArrayTask;

public class MaxAndMin {
//    write a program that display the maximum and
//    minimum elements of an array.
    public static void main(String[] args) {
    int [] numbers = {2,1,44,22};

    int max = numbers[0];
    int min = numbers[0];

    for (int i = 0; i < numbers.length; i++) {
            max = (numbers[i] > max)? numbers[i] :max;
            min = (numbers[i] < min)? numbers[i] :min;
        }
        System.out.println(" max= " + max + " min=  "  + min);
    }


}
