package ArrayPractice;

public class EvenArray {

    public static void main(String[] args) {

    int [] myArr = {5,12,4,5,6,3,7,8,9,11};
        for (int i = 0; i <myArr.length ; i++) {
            if (myArr[i] % 2 == 0){
                System.out.println(myArr[i]);
            }
        }


    }


}
