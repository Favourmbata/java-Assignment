package Chibuzor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestScoreTest {
    @Test
    public void testForTenScore(){
        LargestScore largestScore = new LargestScore();
        int [] scores = {5000,10,15,20,45,66,77,80,95,120};
         assertEquals(5000,largestScore.getLargetScore(scores));

    }


}