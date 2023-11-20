package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.swap;

public class Pair {

    public int[] getPairs(int[] input) {

        for (int index = 0; index < input.length - 1; index += 2) {
            if (input[index] > input[index + 1])
                swap(index, index + 1, input);

        }

        return input;
    }

    private void swap(int firstIndex, int secondIndex, int[] list) {
        int temp = list[firstIndex];
        list[firstIndex] = list[secondIndex];
        list[secondIndex] = temp;
    }
}

//    public int[] getSwapedElement(int[] input) {
//
//        for (int index = 0; index < input.length - 1; index +=2) {
//            if (input[index] < input[index +1])
//            swaped(index,index+1,input);
//        }
//        return input;
//    }
//
//    private void swaped(int firstIndex, int secondIndex, int[] list) {
//        int temp = list[secondIndex];
//        list[secondIndex] = list[firstIndex];
//        list[firstIndex] = temp;
//    }
