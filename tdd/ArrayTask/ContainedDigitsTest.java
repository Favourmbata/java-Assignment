package ArrayTask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainedDigitsTest {

    @Test
    public void testThatPickOutNumbers() {
        String []elements = {"ABC123","Efg56"};
        int count = ContainedDigits.countArray(elements);
        assertEquals(5,count);
    }
}