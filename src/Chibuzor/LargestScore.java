package Chibuzor;

public class LargestScore {


    public int getLargetScore(int[] scores) {

        int largestScore = 0;
        for (int i = 0; i < scores.length ; i++) {
            if (scores[i] > largestScore){
                largestScore = scores[i];
            }
        }
         return largestScore;

    }
}
