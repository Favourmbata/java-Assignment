package test;

public class HighestCommonFactor {

    public int[] getHighestCommonFactor(int[] array) {

       int a = 0;
       int b = 0;
       int count = 1;
        for (int max = 1; max < a; max++) {
               if (a % max == 0 && b % max == 0 ){
                count = max;
              count = count/ max;
               }
        }
        return new int[] {count};
    }
}
