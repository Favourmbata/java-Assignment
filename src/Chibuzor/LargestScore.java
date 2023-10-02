package Chibuzor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestScore {


    public int getLargetScore(int[] scores) {

        int largestScore = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > largestScore) {
                largestScore = scores[i];
            }
        }
        return largestScore;

    }

    public static boolean getTheOcurrenceOfElement(int[] numberExist, int item) {
        for (int element : numberExist) {
            if (item == element) {
                return true;
            }
        }
        return false;
    }

    public int[] getevenElementPosition(int[] result) {
        int count = 0;
        for (int i = 0; i < result.length; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        int[] arrOfEven = new int[count];
        int count2 = 0;
        for (int i = 0; i < result.length; i++) {
            if (i % 2 == 0) {
                arrOfEven[count2++] = result[i];
            }
        }
        return arrOfEven;
    }


    public static int[] getReversedArr(int[] result) {
        int reverse = 0;
        int[] reveser = new int[result.length];

        for (int i = result.length - 1; i >= 0; i--) {
            reveser[reverse] = result[i];
            reverse++;

        }

        return reveser;
    }


    public int getSum(int[] sumArr) {
        int sum = 0;
        for (int i = 0; i < sumArr.length; i++) {
            sum += sumArr[i];
        }
        return sum;
    }

    public static boolean isPlindrome(String word) {
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
            if (word.equalsIgnoreCase(reverse)) {
                return true;

            }

        }
        return false;
    }

    public int[] getOddElement(int[] result) {
        int count = 0;
        for (int i = 0; i < result.length; i++) {
            if (i % 2 != 0) {
                count++;

            }

        }

        int[] arrOfOdd = new int[count];
        int count2 = 0;
        for (int i = 0; i < result.length; i++) {
            if (i % 2 != 0) {
                arrOfOdd[count2++] = result[i];
            }

        }
        return arrOfOdd;
    }

    public int getRunningTotal(int[] result) {
        int total = 0;
        for (int i = 0; i < result.length; i++) {
            total += result[i];
        }
        return total;
    }

    public static int[] returnDigits(int digits) {
      String numberStr = Integer.toString(digits);
       int [] number = new int[numberStr.length()];
        for (int i = 0; i < numberStr.length() ; i++) {
            char digitChar = numberStr.charAt(i);
             number[i] = Character.getNumericValue(digitChar);
        }
      return number;

    }

    public Object[] concatenateElement(Object[] letters, Object[] numbers) {
        List<Object>combinedList = new ArrayList<>();
        for (int i = 0; i < Math.min(letters.length,numbers.length); i++) {
            combinedList.add(letters[i]);
            combinedList.add(numbers[i]);
        }
          return new List[]{combinedList};
    }
}

//    public static String[] getCombinedElement(String[] Object, int[] number) {
//        int list1 = Object.length;
//        int list2 = number.length;
//        int combinedElement = list1 + list2;
//
//        Object[] getCombinedElement = new Object[combinedElement];
//        int index = 0;
//        int i = 0;
//        int j = 0;
//        while (i < list1 && j < list2) {
//
//
//        }
//
//    }
//}


