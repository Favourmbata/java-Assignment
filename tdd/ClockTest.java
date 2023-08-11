import chapter3.Clock;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ClockTest{

    @Test
    public void testThatClockHasHour(){
        Clock clock = new Clock();
        clock.setHour(23);
       assertEquals(23,clock.getHour());
    }

   public void testThatClockHasMinute(){
        Clock clock = new Clock();
        clock.setMinute(59);

   }

}
