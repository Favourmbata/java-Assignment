package AirlineReservationWahala;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    private static final Passengers passengers = new Passengers();
   private static final AirlineReservation airlineReservation = new AirlineReservation();
  private  static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        airLineBookingSystem();
    }
     private static void airLineBookingSystem(){
         System.out.println("""
                 Airline seat reservation system.
                 1.Book flight
                 2.Exit
                 """);
         int response = input.nextInt();
         switch (response){
             case 1 :bookFlight();
             case 2:exit(2);
             default:{
                 System.out.println("Enter a valid option");
                airLineBookingSystem();
             }
         }
     }

    private static void bookFlight() {
        System.out.println("""
                Kindly select an option:
                1.first class
                2.economy
                """);
        int selectClass = input.nextInt();
        switch (selectClass){
            case 1:firstClassBooking();
            case 2:economyClassBooking();
            default:{
                System.out.println("Enter a valid option");
                bookFlight();
            }
        }
    }

    private static void economyClassBooking() {
        passengers.selectClassType(2);
        passengers.bookFlight(airlineReservation);
        if (passengers.getSeatNumber()!= -1)sucessfulBooking();
     else {
         economyToFirstOption();
        }
    }

    private static void economyToFirstOption() {
        System.out.println("""
                Economy is occupied.\n
                Would you like to book first class? ");
            
                """);
        String answer = input.nextLine();
        if (answer.equalsIgnoreCase("yes"))firstClassBookingAlternative();
    }

    private static void firstClassBookingAlternative() {
    passengers.selectClassType(1);
    passengers.bookFlight(airlineReservation);
    if (passengers.getSeatNumber()!= -1){
        sucessfulBooking();
    }else {
        System.out.println("""
                First is occupied.
                \nKindly wait for the next available flight 
                which will arrive in the next 3hrs.");
                """);
          exit(2);
    }

    }

    private static void sucessfulBooking() {
        passengers.passengerPass();
        System.out.println();
        bookFlight();
    }

    private static void firstClassBooking() {

        passengers.selectClassType(1);
        passengers.bookFlight(airlineReservation);
        if (passengers.getSeatNumber() != -1){
            sucessfulBooking();
        }
        else firstToEconomyOption();
    }

    private static void firstToEconomyOption() {
        System.out.println("""
                "First class is occupied.
                \nWould you like to book economy class? ");
                """);
        String answer = input.next();
        input.nextLine();
        if (answer.equalsIgnoreCase("yes"))economyBookingAlternative();
    }

    private static void economyBookingAlternative() {
        passengers.selectClassType(2);
        passengers.bookFlight(airlineReservation);
        if (passengers.getSeatNumber()!= -1){
            sucessfulBooking();
        }else {
            System.out.println("""
                    Economy class is occupied.
                    \nkindly wait for the next
                    available flight which will arrive in the next 3hrs");
                    """);
              exit(2);
        }
    }
}



