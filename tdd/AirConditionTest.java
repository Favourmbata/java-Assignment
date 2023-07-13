import Assignment.AirCondition;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionTest {

     @Test
    public void testThatAirConditionIfIsOn(){
        AirCondition airCondition = new AirCondition();
        airCondition.turnOn();
         assertTrue(airCondition.checkPowerStatus());
    }
    @Test
    public void testThatAirConditionCanTurnOff(){
         AirCondition airCondition = new AirCondition();
         airCondition.turnOn();
         assertTrue(airCondition.checkPowerStatus());
         airCondition.turnOff();
        assertFalse(airCondition.checkPowerStatus());

    }
    @Test
    public void testThatAirConditionCanIncreasetemperatre(){
         AirCondition airCondition = new AirCondition();
         airCondition.turnOn();
         assertTrue(airCondition.checkPowerStatus());
        airCondition.increaseTemperature();
        assertEquals(30,airCondition.checkTemperature());
    }
    @Test
    public void testThatAirConditionCanDecreaseTemperature(){
         AirCondition airCondition = new AirCondition();
         airCondition.turnOn();
         assertTrue(airCondition.checkPowerStatus());
        airCondition.increaseTemperature();
        airCondition.decreaseTemperature();
        assertEquals(16,airCondition.checkTemperature());

    }




}
