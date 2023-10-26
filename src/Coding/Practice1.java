package Coding;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Practice1 {


    int[][] todaysSales;
    String numberOfItemsBougth, numberOfCustomer;

    public void promptAndSave() {
        Scanner input = new Scanner(System.in);

        String value = validateInput("How many Customers do you have? ");
        numberOfCustomer = value;

        value = validateInput("Number of items bought? ");
        numberOfItemsBougth = value;

        todaysSales = new int[Integer.parseInt(numberOfCustomer)][Integer.parseInt(numberOfItemsBougth)];
        for (int row = 0; row < Integer.parseInt(numberOfCustomer); row++) {
            System.out.println("----------------------- for Customer " + (row + 1) + "-----------------------");
            for (int col = 0; col < Integer.parseInt(numberOfItemsBougth); col++) {
                 value = validateInput("What is the Item " + (col + 1) + " price ->: ");
                todaysSales[row][col] = Integer.parseInt(value);
            }
        }
        System.out.println("Thanks for using our application");
    }

    public String validateInput(String query){
        Scanner input = new Scanner(System.in);
        String varToSave;
        int validity = 0, count =0;
        while (validity == 0) {
            System.out.println(query);
            varToSave = input.nextLine();

            for(int i=0; i<varToSave.length(); i++) {
                if (Character.isDigit(varToSave.charAt(i))) {
                    count++;
                }
            }
            if(count == varToSave.length()){
                validity++;
                return varToSave;
            }
            else {
                    System.out.println("Biko input a valid number");}
            count =0;
        }
         return null;
    }

    public void displayTable(int[][] array, String numberOfItemsBougth) {
        System.out.println();
        System.out.println("Here's The table");
        System.out.println("s/n              Items");
        System.out.println("----------------------------------------");
        for (int row = 0; row < array.length; row++) {
            System.out.print((row + 1) + "  ");
            for (int col = 0; col < Integer.parseInt(numberOfItemsBougth); col++) {
                System.out.print(array[row][col] + "           ");
            }
            System.out.println();
        }
    }

    public void play() {
            promptAndSave();
            displayTable(todaysSales, numberOfItemsBougth);
    }

    public static void main(String[] args) {
        Practice1 practice1 = new Practice1();
        practice1.play();
    }
}


