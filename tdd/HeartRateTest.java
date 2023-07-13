import chapter3.HeartRate;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class HeartRateTest {

@Test

   public void testThatPersonHasFirstName(){
    HeartRate heartRate = new HeartRate();
    heartRate.setFirstName("Favour");
    assertEquals("Favour",heartRate.getFirstName());

}
 @Test
    public void testThatPersonHasLastName(){
    HeartRate heartRate = new HeartRate();
    heartRate.setLastName("mbata");
    assertEquals("mbata",heartRate.getLastName());
 }
@Test
    public void testThatPersonHasdateOfBirth(){
    
}
}
