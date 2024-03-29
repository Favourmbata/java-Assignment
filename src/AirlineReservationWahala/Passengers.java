package AirlineReservationWahala;

import static AirlineReservationWahala.ClassType.ECONOMYTYPE;
import static AirlineReservationWahala.ClassType.FIRSTCLASSTYPE;

public class Passengers {
    private  int seatNumber;
    private  ClassType classType;
   public  void selectClassType (int classNumber){
       if (classNumber == 1)classType = FIRSTCLASSTYPE;
       if (classNumber == 2)classType = ECONOMYTYPE;
   }



   public void bookFlight(AirlineReservation airlineReservation){
       seatNumber = -1;
       var seats = airlineReservation.getSeatsChart();
       assignFirstClassSeats(seats);
       assignEconomyClassSeat(seats);
   }

   public void assignFirstClassSeats(boolean[] seat) {
        if (classType == FIRSTCLASSTYPE) {
            for (int i = 1; i <= 5; i++) {
            if (!seat[i]){
                seatNumber = i + 1;
                seat[i] = true;
                break;
            }
            }
        }
    }

  public void assignEconomyClassSeat(boolean[]seat){
       if (classType == ECONOMYTYPE){
           for (int i = 5; i <= 10 ; i++) {
               if (!seat[i]){
                   seatNumber = i + 1;
                   seat[i] = true;
                   break;
               }
           }
       }
  }
    public int getSeatNumber(){
       return seatNumber;
    }
   public ClassType getClassType(){
       return classType;
   }

    public void passengerPass(){
        System.out.println("class type is:\nyour seat number is: "+ classType + seatNumber);
    }
}
