package ArrayAssigment;


import java.util.Arrays;

public class ConcateAList {
    public static Object[] concatenatingArr(Object[] arr1, Object[] arr2) {
        int lenghth1 = arr1.length;
        int length2 = arr2.length;

        Object[] concatenatedArr = new Object[lenghth1 + length2];
        for (int i = 0; i < lenghth1; i++) {
            concatenatedArr[i] = arr1[i];
        }
        for (int i = 0; i < length2; i++) {
            concatenatedArr[lenghth1 + 1] = arr2[i];
        }


        return concatenatedArr;
    }

    public static void main(String[] args) {
        Object[] arrA = {"a", "b", "c"};
        Object[] arrB = {1, 2, 3};

        Object[] result = concatenatingArr(arrA, arrB);

//        for (Object element : result) {
            System.out.print(Arrays.toString(result) + " ");
        }

    }
//}