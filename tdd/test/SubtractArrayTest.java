package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubtractingTest {
    @Test
    public void testThatArrayCanBeNegative(){
        int []subArr = {22,41,15,8,2,1};
        int []expected = {39,13,-1};
        
        assertArrayEquals(expected, subArr);
    }
}
