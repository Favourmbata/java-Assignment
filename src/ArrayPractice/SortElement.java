package ArrayPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortElement {

    public static void main(String[] args) {
        int [] list1 = {34,12,33,50,70,90, 16,65,25};
        String [] list2 = {"banana","apple","pineapple","grape","mango"};
        System.out.println("Original value: " + Arrays.toString(list1));
        Arrays.sort(list1);
        System.out.println("sorted Value :"+ Arrays.toString(list1));
           System.out.println("Original Value:"+ Arrays.toString(list2));
        Arrays.sort(list2);
        System.out.println("sorted Value :"+Arrays.toString(list2));


    }



}
