import chapter3.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {

    @Test
    public void testThatCalculatorExist() {
    Calculator calculator = new Calculator();
    assertNotNull(calculator);

    }
    @Test
    public void testThatCalculatorCanBePoweredOn(){
        Calculator calculator = new Calculator();
        calculator.powerOnOrOff();
        assertTrue(calculator.checkPowerMode());
    }

    @Test
    public void testThatCalculatorCanBePoweredOff(){
        Calculator calculator = new Calculator();
        calculator.powerOnOrOff();
       // assertEquals(false,calculator.checkPowerMode());
      //  assertFalse();
    }
    @Test
    public void testThatCalculatorCanAddNumbers(){
        Calculator calculator = new Calculator();
        calculator.powerOnOrOff();
        assertTrue(calculator.checkPowerMode());

       assertEquals(28, calculator.addNumbers(9,19));
        
    }
}