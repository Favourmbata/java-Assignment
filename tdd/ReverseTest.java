import Chapter6.Reverse;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseTest {
    @Test
    public void testToReverseIntegers(){
        Reverse reverse = new Reverse();
        int number = reverse.reverseInteger(3456);
        assertEquals(6543,number);

    }
}
