import Chapter5.Functions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionsTest {
    @Test
    public void testThatAdd(){
        Functions functions = new Functions();
        int number = functions.add(2,5);
        assertEquals(7,number);

    }

  @Test
    public void testThatSubtract(){
        Functions functions = new Functions();
        int subtract = functions.subtract(100,50);
        assertEquals(50,subtract);
  }

  @Test
    public void testThatMultiplies(){
        Functions functions = new Functions();
        int multiply = functions .multiply(4,7);
        assertEquals(28,multiply);
  }
  @Test
    public void testThatPower(){
        Functions functions = new Functions();
        int power = functions.power(2,5);
        assertEquals(32,power);
  }
 }
