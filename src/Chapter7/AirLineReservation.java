package Chapter7;

import java.util.Scanner;

public class AirLineReservation {

    Scanner scanner = new Scanner(System.in);

    boolean [] seatChart = new boolean[10];
    public void seatReservation(int seatArragement){


        if (seatArragement == 1){
            assignFirstClassSeat();
        }
       else if (seatArragement == 2){
           assignEconomySeat();
       }else {
           System.out.println("please enter a  valid seat number");
       }

    }

 public void assignFirstClassSeat(){
     for (int i = 0; i < 5 ; i++) {
         if(!seatChart[i]){
             seatChart[i] =true;
             System.out.println("your seat number is 1"+i);
             return;
         }
         System.out.println("The first class section is full");
     }
    }

public void assignEconomySeat(){
    for (int i = 5; i < seatChart.length; i++) {
        if (!seatChart[i]){
            seatChart[i]=true;
            System.out.println("your seat is 6"+i);
        return;
        }
    }
    System.out.println("The economy section is full:");
    }

     public void nextFlightBoking(){
         System.out.println("would you like to be place in the in the first class section yes/no->");
         String response = scanner.next();
         if (response.equalsIgnoreCase("yes")){
             System.out.println("you have sucessfully booked a first class->");
         }if (response.equalsIgnoreCase("No")){
             System.out.println("The next flight leaves in three hours->");
         }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AirLineReservation airLineReservation = new AirLineReservation();




        System.out.println("Please type 1 for first class and 2 for Economy");
        int seatArragement = scanner.nextInt();
       airLineReservation.seatReservation(seatArragement);

    }
    }
