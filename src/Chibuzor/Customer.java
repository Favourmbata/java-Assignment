package Chibuzor;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer {

    public static boolean validate(String goat){
        for (int i = 0; i < goat.length(); i++) {
            if (!Character.isDigit(goat.charAt(i)))return false;
        }
        return true;
    }
     public void  displayHeader(int [][]array,String numberOfCustomer){
         System.out.println();
         System.out.println("Tables ");
         System.out.println("s/n             ");
         System.out.println("____________________________");
         for (int i = 0; i < array.length ; i++) {
             System.out.print((i + 1) +" ");
             for (int j = 0; j < Integer.parseInt(numberOfCustomer) ; j++) {
                 System.out.println();
             }
         }
     }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String numberOfItem = "";
        String numberOfCustomer = "";
        String itemPrice = "";



        while (true) {
            try {
                System.out.println("how many customer did you sell to ");
                numberOfCustomer = input.next();
                if (!validate(numberOfCustomer)) continue;
            }catch (Exception e){
                System.out.println("how many customer did you sell to ");
                numberOfCustomer = input.next();
                if (!validate(numberOfCustomer)) continue;
            }

        try {
            System.out.println("hw many item did you sell  ");
            numberOfItem = input.next();
            if (!validate(numberOfItem)) continue;
            break;
        }catch (Exception e){
            System.out.println("hw many item did you sell  ");
            numberOfItem = input.next();
            if (!validate(numberOfItem)) continue;
            break;
        }


        }

        int[][] customerAndItem = new int[Integer.parseInt(numberOfCustomer)][Integer.parseInt(numberOfItem)];

        for (int i = 0; i < customerAndItem.length; i++) {

            for (int j = 0; j < customerAndItem[i].length; j++) {
                int item = j + 1;
                int numberOfC = i + 1;
                while (true) {
    System.out.println("for customer  " + numberOfC + "\n  enter price for item " + item);
                    try {
                        itemPrice = input.next();
                        System.out.println("i am here >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                        if (!validate(itemPrice)) continue;
                        break;
                    }catch( Exception e){
                        System.out.println("for customer  " + numberOfC + "\n  enter price for item " + item);
                        itemPrice = input.next();
                        if (!validate(itemPrice)) continue;
                        break;
                    }

                }
                customerAndItem[i][j] = Integer.parseInt(itemPrice);
            }

        }



    }




}