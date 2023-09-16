package Chapter4B;

import java.util.ArrayList;
import java.util.List;

public class ExtractNumbers {
    public static List<Integer> extractDigits(int[] numbers) {

        List digits = new ArrayList<>();
        for (int num : numbers) {
            int remainingNumber = num;
            while (remainingNumber > 0) {
                int digit = remainingNumber % 10;
                digits.add(digit);
                remainingNumber /= 10;

            }
        }
        return digits;
    }

    public static void main(String[] args) {



    }

  }



