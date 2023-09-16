package ArrayPractice;

public class OddArray {

    public static void main(String[] args) {

        int[] myArr = {5, 12, 4, 21, 8, 2, 3, 7, 9, 11};
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] % 2 == 1) {
                System.out.println(myArr[i]);

            }
        }
    }

    }


