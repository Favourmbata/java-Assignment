package Chapter4;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please number of citizen ->");
        int numberOfCitizen  = scanner.nextInt();

        String []nameOfCitizens = new String[numberOfCitizen];
        double []earnings = new double[numberOfCitizen];
        double [] tax = new double[numberOfCitizen];
        double rate;

        for (int i = 0; i <numberOfCitizen; i++) {
            System.out.println("What is citizen" + (i + 1) + " name->");
            nameOfCitizens[i] = scanner.next();
        }
        for (int i = 0; i <numberOfCitizen; i++) {
            System.out.println("What is citizen"+ (i+1)+ "earning->");
            earnings[i] = scanner.nextDouble();

            if(earnings[i] > 30000){
                rate = 0.20;
            }
            else{
                rate = 0.15;
            }
//            rate = earnings[i] > 30000 ? 0.20 : 0.15;
            tax[i] = rate * earnings[i];
        }

        for (int i = 0; i < numberOfCitizen; i++) {
            System.out.println("The TAX of citizen" + (i+1)+ " is " + tax[i]);
        }

}
}
