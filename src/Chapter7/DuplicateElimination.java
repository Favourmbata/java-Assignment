package Chapter7;

import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateElimination {
    public static int[] removeDuplicateNumbes(int[] numbersWithDuplicate) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int number:numbersWithDuplicate){
            if(!result.contains(number))result.add(number);
        }
      return converToArray(result);
    }

    private static int[] converToArray(ArrayList<Integer> result) {
    int [] number = new int[result.size()];
        for (int i = 0; i <  number.length; i++) {
            number[i] = result.get(i);
        }
        return number;
    }

}
