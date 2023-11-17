package AirlineReservationWahala;


import org.junit.jupiter.api.Test;

import static AirlineReservationWahala.ClassType.ECONOMYTYPE;
import static AirlineReservationWahala.ClassType.FIRSTCLASSTYPE;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AirlineReservationTest {
    private AirlineReservation airlineReservation;
    private Passengers passengers;

    @Test
    public void testThatIfAPassengerEnters1_FirstClassWillBeTheClassType() {
        AirlineReservation airlineReservation = new AirlineReservation();
        Passengers passengers = new Passengers();
        passengers.selectClassType(1);
        assertEquals(FIRSTCLASSTYPE, passengers.getClassType());
    }

    @Test
    public void testThatIfAPassengerEnters2_EconomyClassWillBeTheClassType() {
        AirlineReservation airlineReservation = new AirlineReservation();
        Passengers passengers = new Passengers();
        passengers.selectClassType(2);
        assertEquals(ECONOMYTYPE, passengers.getClassType());
    }

    @Test
    public void testThatIfAPassengerClassIsFirst_SeatNumberIsBetweenOneToFiveWhenThePassengerBooksFlight() {
        AirlineReservation airlineReservation = new AirlineReservation();
        Passengers passengers = new Passengers();

        passengers.selectClassType(1);
        passengers.bookFlight(airlineReservation);
        assertEquals(1, passengers.getSeatNumber());
        passengers.selectClassType(1);
        passengers.bookFlight(airlineReservation);
        assertEquals(1,passengers.getSeatNumber());
    }

 @Test
    public void testThatIfAPassengerClassIsEconomy_SeatNumberIsBetweenSixToTenWhenThePassengerBooksFlight(){
     AirlineReservation airlineReservation = new AirlineReservation();
     Passengers passengers = new Passengers();
     passengers.selectClassType(2);
     passengers.bookFlight(airlineReservation);
     assertEquals(6, passengers.getSeatNumber());

     passengers.selectClassType(2);
     passengers.bookFlight(airlineReservation);
     assertEquals(7, passengers.getSeatNumber());
 }
}