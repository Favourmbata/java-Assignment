import org.junit.jupiter.api.Test;
import tdd.DisplayTime;

import static org.junit.jupiter.api.Assertions.*;

public class DisplayTimeTest{
    @Test
    public void testThatMinutesAndSecondsCanBeCreated(){
        DisplayTime displayTime = new DisplayTime();
        assertNotNull(displayTime);
}
    @Test
    public void testThatCanConvertMinutesToSecond() {
        DisplayTime displayTime = new DisplayTime();
        displayTime.setMinute(20);
        int minute = displayTime.getMinutes();
        assertEquals(20, minute);

    }


@Test
    public  void testThatCanConverSecondsToYear(){
    DisplayTime displayTime = new DisplayTime();
    displayTime.setMinute(525600);
    int Year = displayTime.getYears();
    assertEquals(1,Year);

}



    }





