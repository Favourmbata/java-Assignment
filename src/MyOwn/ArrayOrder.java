package MyOwn;

import java.util.Arrays;

public class ArrayOrder {
    public static  int arrangeOrder(int[]myArr,int number){
        Arrays.sort(myArr);
        int num = myArr[number -1];
        for (int i = number -2; i >= 0; i--) {
            num = num * 10 + myArr[i];
        }
     return num;
    }

    public static void main(String[] args) {
        int []myArr = {1,2,3,4,5,6,7,0};
        int number = myArr.length;
        System.out.println(arrangeOrder(myArr,number ));
    }


}
