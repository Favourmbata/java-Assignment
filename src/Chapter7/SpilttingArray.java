package Chapter7;

import java.util.ArrayList;
import java.util.List;

public class SpilttingArray {
    public static void main(String[] args) {
        int[]spitArr = {23,45,60,38};
        for (int i = 0; i < spitArr.length  ; i++) {
            System.out.print(spitArr[i]/10 +",");
            System.out.print(spitArr[i]%10 +",");
        }
    }


    public static List<Integer> testOdd(int[] number) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < String.valueOf(number[i]).length(); j++) {
                String temp = String.valueOf(number[i]);
                int num = Integer.parseInt(String.valueOf(temp.charAt(j)));
                result.add(num);
            }
        }
        return result;
    }
}

