import Chibuzor.LogisticService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class LogisticServiceTest {

    @Test
    public void testthatLogisticServiceExist(){
        LogisticService logisticService = new LogisticService();
        assertNotNull(logisticService);
    }
    @Test
    public void testthatValidateCollectionRate(){
        LogisticService logisticService = new LogisticService();
        int fiftyPercent =  logisticService.getWage(20);
        assertEquals(8200,fiftyPercent);

    }

   @Test
    public void testthatValidateCollectionRateBetweenFiftyToFiftyNinePercent(){
        LogisticService logisticService = new LogisticService();
        int fiftyToFiftyNinePercentRate = logisticService.getWage(55);
        assertEquals(16000,fiftyToFiftyNinePercentRate);
    }

    @Test
    public void testThatValidateCollectionRateBetweenSixtyToSixtyNinePercent(){
        LogisticService logisticService = new LogisticService();
        int sixtyToSixtyNinePercentRate = logisticService.getWage(66);
        assertEquals(21500,sixtyToSixtyNinePercentRate);
    }

  @Test
    public void testThatValidateCollectionRateAboveSeventyPercent(){
        LogisticService logisticService = new LogisticService();
        int seventyAndAbovePercentRate = logisticService.getWage(80);
        assertEquals(45000,seventyAndAbovePercentRate);
  }


}
