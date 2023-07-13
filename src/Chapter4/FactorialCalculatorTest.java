package Chapter4;
import org.junit.jupiter.api.Test;

public class FactorialCalculatorTest{
     @Test
     public void calculateFactoriaTest(){
         FactorialCalculator factorialCalculator = new  FactorialCalculator();
         int factorial = factorialCalculator.calculate(-1);
         assertEquals(1,factorial);
     }

    private void assertEquals(int i, int factorial) {
    }

    @Test
   public  void testThatFactorialIsNonNegativeNumber(){
         FactorialCalculator factorialCalculator = new FactorialCalculator();
         int factorial = factorialCalculator.calculate(8);
         assertEquals(40320,factorial);

   }

 }

    





