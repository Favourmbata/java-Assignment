package Class;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PeriodCalculatorTest {
   @Test
    public void testForUserOvulation(){
     PeriodCalculator periodCalculator = new PeriodCalculator();
     String ovulationDates = periodCalculator.getOvulationDate("2023-10-17",26,4);
     assertEquals("2023-10-23",ovulationDates);
   }
}