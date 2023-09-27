package arrayPackage;

public class SumArray {
    public static void main(String[] args) {
      int [] myArr = {100,60,7,25,5, 0 ,3};
      int sum = 0;

        for (int number = 0; number < myArr.length ; number++) {
            sum += myArr[number];
        }
        System.out.println("The sum of array is:" + sum);

    }
}