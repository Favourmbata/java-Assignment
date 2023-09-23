import Chibuzor.LogisticService;
import Coding.LargestAndSmallest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class LargestAndSmallestTest {
    @Test
    public void testThatLargestAndSmallestExist(){
      LargestAndSmallest largestAndSmallest = new LargestAndSmallest();
      assertNotNull(largestAndSmallest);
    }


    @Test
    public void testForLargestAndSmallestNumber(){
        LargestAndSmallest largestAndSmallest = new LargestAndSmallest();
        assertEquals(700,largestAndSmallest.validatingTheLargest(400,700,500));
    }

}
