package practice;

import org.junit.Test;

import static org.junit.Assert.*;

public class TelevisionTest {

    @Test
    public void testThatTelevisionCanTurnOn() {
        Television television = new Television();
        television.turnOn();
        assertTrue(television.checkPowerBotton());
    }

    @Test
    public void testThatTelevesionCanTurnOff() {
        Television television = new Television();
        television.turnOff();
        assertFalse(television.checkPowerBotton());

    }
    @Test
    public void testThatTelevisionCanIncreaseVolume(){
        Television television = new Television();
        television.turnOn();
        television.increseVolume();
        assertEquals(26,television.checkVolume());

}
@Test
    public void testThatTelevisionCanDecreaseVolume(){
        Television television = new Television();
        television.turnOn();
    television.increseVolume();
        television.decreaseVolume();
        assertEquals(6,television.checkVolume());
    }
@Test
    public void testThatTevelevisionCanChannelUp(){
        Television television = new Television();
        television.turnOn();
        television.channelUp();
    assertEquals(70,television.changeChannel());
    }

@Test
    public void testThatTelevesionCanChannelDown(){
    Television television = new Television();
    television.turnOn();
    television.channelUp();
    television.channelDown();
    assertEquals(0,television.checkVolume());

    }


    }
