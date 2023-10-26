package test;

public class WarmUp {
    public String reverseString(String word) {
        int number = word.length();
        String reverse = "";
        char collect;

        for (int i = 0; i < number; i++) {
           collect = word.charAt(i);
            reverse  = collect + reverse;
        }
        return reverse;
    }

    public String isPalindrome(String inPut) {
        String word = "";
        for (int i =  inPut.length()-1 ; i >= 0; i--) {
         word = word + inPut.charAt(i);
        }

          return word;
    }

    public int reverseInteger(int number) {
     int reverse = 0;
     while (number != reverse){
             reverse = reverse * 10 + number % 10;
             number = number /= 10;
     }

     return reverse;
    }

    public static int[] getDuplicate(int[] expected) {

        int number = 0;

        for (int i = 0; i < expected.length - 1; i++) {
            for (int j = i + 1; j < expected.length ; j++) {
                if ((expected[i] == expected[j])  && (i != j)){
                  number++;

                }
            }

        }
        int [] count = new int[number];
         number = 0;
        for (int i = 0; i < expected.length ; i++) {
            for (int j = i + 1; j < expected.length ; j++) {
                if ((expected[i] == expected[j]) && (i != j)){

                }
            }
        }
              return count;

    }



    public static int[] findDomantValue(int[] list) {
        int[] result = new int[list.length];
        for (int index = 0; index < list.length ; index++) {

            int currectElement = list[index];
            for (int index2 = index + 1; index2 < list.length ; index2++) {
              if (currectElement < list[index2])break;
              if (index2 == list.length- 1)result[index] = currectElement;
              
            }
        }
       result[result.length-1] = list [list.length];
        return removeZerosFrom(result);
    }
       private static int [] removeZerosFrom(int [] numbers){
        int count  = 0;
        for (int number : numbers){
            if (number != 0)count++;
        }
          int []result = new int[count];
          count = 0;
           for (int index = 0; index <numbers.length; index++) {
               if (numbers [index] != 0){
                   result[count] = numbers[index];
                   count++;
               }
           }
            return result;
    }
}





