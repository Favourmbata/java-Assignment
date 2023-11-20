package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class PairTest {
    @Test
    public void returnElemetInPair(){
        Pair pairs = new Pair();
        int []input = {42,18,41,22,15,12};
        int []outPut = {18,42,22,41,12,15};
        Assertions.assertArrayEquals(outPut, pairs.getPairs(input));
        input = new int[]{18, 42, 22, 41, 12, 15};
        outPut = new int[]{18, 42, 22, 41, 12, 15};
        Assertions.assertArrayEquals(outPut, pairs.getPairs(input));

    }
    @Test
    public void testThatSwapsElement(){
        Pair pairs = new Pair();
        int []input = {42,18,41,22,15};
        int []output = {18,42,22,41,15};
        Assertions.assertArrayEquals(output, pairs.getPairs(input));
        input = new int [] {42,15,18,13,3,13};
        output = new int[] {42,15,18,13,3,13};

//        System.out.println(Arrays.toString(output));
//        assertArrayEquals(output, pairs.getPairs(input));

    }

//  @Test
//    public void testthatSwapsSecondElement(){
//      Pair pairs = new Pair();
//      int []input = {42,15,18,13,3,13};
//      int[]output = {42,15,18,13,3,13};
//      assertArrayEquals(output, pairs.getSwapedElement(input));
//  }

}
