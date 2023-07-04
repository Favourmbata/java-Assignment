package chapter3;

import org.junit.Test;

import static org.junit.Assert.*;

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





