package Chapter4B;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorizationTest {

    @Test
    public void testForFiveFactorial() {
        Factorization factorization = new Factorization();

        int number = factorization.favouration(4);
        assertEquals(24, number);

    }

    @Test
    public void testThatEstimateFactorialConstant() {
        Factorization factorization = new Factorization();
        String result = factorization.factorialConstant(4);
        assertEquals("2.708", result);


    }

   @Test
    public void testThatcalculateExponentialOfFactorial(){
        Factorization factorization = new Factorization();
        int total = factorization.exponentialOfFactorial(5);
        assertEquals(56,total);

    }



}