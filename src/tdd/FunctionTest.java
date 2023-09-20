package tdd;

import Chibuzor.Function;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FunctionTest {
    @Test
    public void testForEvenAndOddInteger(){
        Function instance = new Function();
        assertEquals(false, instance.isEvenNumber(7));
    }

   @Test
    public void testThatANumberIsPrime(){
        Function instance = new Function();
        assertEquals(true,instance.primeNumber(10));
   }
   @Test
    public void testForFactorsOfNumber(){
        Function instance = new Function();
        assertEquals(4,instance.factorsOfNumber(10));
   }

    @Test
    public void testSquaresOfNumber(){
        Function instance =  new Function();
        assertEquals(true,instance.squaresOfNumbers(20));
    }

   @Test
    public void testForFactorialsOfNumbers(){
        Function instance = new Function();
        assertEquals(24,instance.factorialOfNumber(4));
   }
   @Test
    public void testThatANumberIsPalindrome(){
        Function instance = new Function();
        assertEquals(true,instance.isPalindrome(89706));
   }


}
