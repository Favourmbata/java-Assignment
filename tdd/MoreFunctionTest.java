import Chibuzor.MoreFunction;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MoreFunctionTest {
    @Test
    public void testForEvenAndOddInteger(){
        MoreFunction instance = new MoreFunction();
        assertEquals(false, instance.isEvenNumber(7));
    }

   @Test
    public void testThatANumberIsPrime(){
        MoreFunction instance = new MoreFunction();
        assertEquals(true,instance.primeNumber(10));
   }
   @Test
    public void testForFactorsOfNumber(){
        MoreFunction instance = new MoreFunction();
        assertEquals(4,instance.factorsOfNumber(10));
   }

    @Test
    public void testSquaresOfNumber(){
        MoreFunction instance =  new MoreFunction();
        assertEquals(true,instance.squaresOfNumbers(20));
    }

   @Test
    public void testForFactorialsOfNumbers(){
        MoreFunction instance = new MoreFunction();
        assertEquals(24,instance.factorialOfNumber(4));
   }
   @Test
    public void testThatANumberIsPalindrome(){
        MoreFunction instance = new MoreFunction();
        assertEquals(true,instance.isPalindrome(89706));
   }


}
