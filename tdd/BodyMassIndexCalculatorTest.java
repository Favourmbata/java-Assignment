import chapter2.BodyMassIndexCalculator;
import org.junit.jupiter.api.Test;

public class BodyMassIndexCalculatorTest {

@Test
    public void testThatCalulatesUserWeightInKilogramsAndHeightInMeters(){
    BodyMassIndexCalculator bodyMassIndexCalculator = new BodyMassIndexCalculator();
   bodyMassIndexCalculator.calculateBodyMassIndex();

  }

}
