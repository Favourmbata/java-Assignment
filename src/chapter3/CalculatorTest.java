package chapter3;

import org.junit.Test;

import java.util.concurrent.Callable;

import static org.junit.Assert.*;

public class CalculatorTest {


    @Test
    public void testThatCalculatorExist() {
    Calculator calculator = new Calculator();
    assertNotNull(calculator);

    }
    @Test
    public void testThatCalculatorCanBePowerOn(){

        Calculator calculator = new Calculator();
        calculator.powerOn();
        assertTrue(calculator.isOn());

            }
        @Test
      public void   testThatCalculatorCanBeTurnOff(){
        Calculator calculator = new Calculator();
        calculator.powerOn();
       assertFalse(calculator.isOn());
        }




}