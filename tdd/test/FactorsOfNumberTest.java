package test;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorsOfNumberTest {
    FactorsOfNumber factorsOfNumber = new FactorsOfNumber();
    @Test


            public void lcmOfNumberTest(){
        int []result = {2,5};
        assertArrayEquals(result,FactorsOfNumber.calculateLcmOfNumber(10));
    }



}
