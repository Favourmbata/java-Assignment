package test;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

public class PrimeTest {
    @Test
    public void testThatReturnsPrimeProduct(){
        Prime prime = new Prime();
        int  product = 8;
        int[] expected = {2,2,2};
     assertArrayEquals(expected,prime.getPrimeProducts(product));



    }
}
