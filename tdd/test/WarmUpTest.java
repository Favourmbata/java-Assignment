package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class WarmUpTest {


    @Test
    public void testToRemoveDuplicate(){
        int []array = {1,2,3,3,2,4,5,6};
        int[]expected = {2,3};
        assertArrayEquals(expected, WarmUp.getDuplicate(array));
    }

   @Test
    public void reverseTest() {
       WarmUp warmUp = new WarmUp();

       String reverse =  warmUp.reverseString("we outside");
        assertEquals("ew edistuo",reverse);



   }
    @Test
    public void isPalindrome(){
      WarmUp warmUp = new WarmUp();
       String inPut = "anna";
       assertEquals(true,warmUp.isPalindrome(inPut));
    }

    @Test
    public void testPalindromeDigit(){
       WarmUp warmUp = new WarmUp();
       int result = warmUp.reverseInteger(3456);
       assertEquals(6543,result);
    }

    @Test
    public void testForDominantValue(){
//        WarmUp warmUp = new WarmUp();
        int []list = {9,3,10,7,4};
        int []result = {10,7,4};
        assertArrayEquals(result, WarmUp.findDomantValue(list));
    }



    }
