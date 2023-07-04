import org.junit.Test;

import static org.junit.Assert.*;

public class BikeTest {

    @Test
    public void testThatBikeCanBeTurnedOn(){
        Bike bike = new Bike();
        bike.turnOnOrTurnOff();
        assertTrue(bike.checkPowerMode());
    }
    @Test
    public void testThatBikeCanTurnOff(){
        Bike bike = new Bike();
        bike.turnOnOrTurnOff();
        assertTrue(bike.checkPowerMode());
         bike.turnOnOrTurnOff();
        assertFalse(bike.checkPowerMode());
    }

    @Test
    public void testThatBikeCanAccelerated(){
        Bike bike = new Bike();
        bike.turnOnOrTurnOff();
        assertTrue(bike.checkPowerMode());
        bike.turnOnOrTurnOff();
        assertFalse(bike.checkPowerMode());
        bike.accelerate();
        assertEquals(1,bike.checkAcceleration());
    }
    @Test
    public void testThatBikeCanBeDeccerated(){
        Bike bike = new Bike();
        bike.turnOnOrTurnOff();
        assertTrue(bike.checkPowerMode());
        bike.turnOnOrTurnOff();
        assertFalse(bike.checkPowerMode());
        bike.accelerate();
        assertEquals(1,bike.checkAcceleration());
        bike.decelerate();
        assertEquals(1,bike.checkDecceleration());
    }

}
