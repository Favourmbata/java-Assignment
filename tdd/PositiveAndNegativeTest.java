import Coding.PositiveAndNegative;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PositiveAndNegativeTest {
   PositiveAndNegative positiveAndNegative;

   @BeforeEach
   void setUp(){positiveAndNegative = new PositiveAndNegative();}

    @Test
    public void testForPositiveOrNegativeNumberExist(){
        PositiveAndNegative positiveAndNegative = new PositiveAndNegative();
        assertNotNull(positiveAndNegative);
    }


  @Test
    public void testForPositiveAndNegative(){
       boolean number = positiveAndNegative.checkForPositiveAndNegative(36);
       assertEquals(true,number);
      }
  }




