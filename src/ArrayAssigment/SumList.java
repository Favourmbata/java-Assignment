package ArrayAssigment;

public class SumList {

    public static void summingList() {


        int[] sumArr = {10, 20, 30, 40, 50, 60};
        int sum = 0;
        for (int i = 0; i < sumArr.length ; i++) {
            sum+= sumArr[i];

        }
        System.out.println("The sum of an arr is:" + sum);
    }


    public static void main(String[] args) {
        summingList();
    }
}