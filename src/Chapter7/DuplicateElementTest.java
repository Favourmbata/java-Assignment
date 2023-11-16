package Chapter7;

import org.junit.jupiter.api.Test;

import static Chapter7.DuplicateElimination.removeDuplicateNumbes;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DuplicateElementTest {
    @Test
    public void removeDuplicateElement(){
        int []numbersWithDuplicate = {1,2,2,3,5,4,8,5,7,4,1,9,3};
        int [] numbersWithoutDuplicate = {1,2,3,4,5,7,8,9};
        assertArrayEquals(numbersWithoutDuplicate,removeDuplicateNumbes(numbersWithDuplicate));
    }
}
