package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TargetTest {
    @Test
    public void findTargetBetweenNunbers(){
       Target target = new Target();

        int [] numbers = {13579};
        int []index = {1,2};
        assertArrayEquals(index,target.getIndeces(numbers));
    }
}
