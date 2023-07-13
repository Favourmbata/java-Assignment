import chapter3.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {


    @Test
   public void testThatCarHasModel(){
    Car car = new Car();
    car.setCarModel("toyota");
    assertEquals("toyota",car.getModel());
}

    @Test
    public void testThatCarHasyear(){
        Car car = new Car();
        car.setCarModel("toyota");
        assertEquals("toyota",car.getModel());
        car.setYear("1990");
    }


}





