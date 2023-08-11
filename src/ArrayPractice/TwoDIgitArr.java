package ArrayPractice;

public class TwoDIgitArr {

    public static void main(String[] args) {

    int [] myArr = {5,12,4,6,7,8,15,9,11,3};
        for (int i = 0; i <myArr.length ; i++) {
            if (myArr[i] > 9 && myArr[i] < 100){
                System.out.println(myArr[i]);
            }
        }

    }

}
