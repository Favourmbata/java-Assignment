package test;

import Chapter4B.Subtacting;
import Chapter4B.SubtractArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubtractArrayTest {
    @Test
    public void testThatArrayCanBeNegative(){
        Subtacting object = new Subtacting();
        int []subArr = {22,41,15,8,2,1};
        int []expected = {39,13,-1};
        
        assertArrayEquals(expected, object.getArr(subArr));
    }
}
