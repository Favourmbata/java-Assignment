package Chapter7;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SpilttingArrayTest {


    @Test
    void testOddNumber() {
        List<Integer> result = SpilttingArray.testOdd(new int[]{23, 45, 78});
        assertEquals(List.of(2,3,4,5,7,8), result);
    }

}