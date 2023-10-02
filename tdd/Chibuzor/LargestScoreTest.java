package Chibuzor;

import ArrayAssigment.ElementInEvenPosition;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestScoreTest {
    @Test
    public void testForTenScore() {
        LargestScore largestScore = new LargestScore();
        int[] scores = {5000, 10, 15, 20, 45, 66, 77, 80, 95, 120};
        assertEquals(5000, largestScore.getLargetScore(scores));

    }


   @Test
    public void testThatCheckIfAnElementOccured(){
       LargestScore number = new LargestScore();
       int [] numberExist = {2012,2033,20,19,45,900};
       assertTrue(LargestScore.getTheOcurrenceOfElement(numberExist, 20));
   }

   @Test
    public void testVerifyEvenElementPosition(){
        LargestScore even = new LargestScore();
        int []result = {10,20,40,30,55,77,92,120,12};
        int []expected = {10,40,55,92,12};
         assertArrayEquals(expected, even.getevenElementPosition(result));
   }

  @Test
    public void testThatReverseAList(){
        LargestScore largestScore = new LargestScore();
      int []result = {1,2,3,4,5,6,7,8,9,10};
      int []expected = {10,9,8,7,6,5,4,3,2,1};
      assertArrayEquals(expected,largestScore.getReversedArr(result));
  }
    @Test
    public void ThatSumsAnArray(){
        LargestScore sum = new LargestScore();
        int [] sumArr = {10, 20, 30, 40, 50, 60};
         assertEquals(210,sum.getSum(sumArr));
    }

    @Test
    public void testWhetherAStringIsPalindrome(){
        assertEquals(true,LargestScore.isPlindrome("madAM"));
    }


    @Test
    public void testThatReturnsDigits() {
        LargestScore digit = new LargestScore();


    }

  @Test
    public void testThatPrintsOddElement(){
      LargestScore odd = new LargestScore();
      int []result = {10,20,40,30,55,77,92,120,12};
      int []expected = {20,30,77,120};
      assertArrayEquals(expected,odd.getOddElement(result));
  }

    @Test
    public void testThatComputesRunningTotal(){
        LargestScore runningTotal = new LargestScore();
        int []result = {1,2,3,4,5,6,7,8,9,10,300};
        assertEquals(355,runningTotal.getRunningTotal(result));
    }

      @Test
    public void testThatCombinesElementsAlternatively(){
        LargestScore join = new LargestScore();
         Object[]letters = {"a","b","c"};
        Object  [] numbers = {1,2,3};
        String [] combinedArr = {"a","b","C","1","2","3"};
         assertArrayEquals(combinedArr,join.concatenateElement(letters,numbers));
      }


   @Test
    public void testReturnsDigit(){
       LargestScore separateDigit = new LargestScore();
        int digits = 2342;
        int[]numericStr = {2,3,4,2};
        assertArrayEquals(numericStr, LargestScore.returnDigits(digits));
   }

  }