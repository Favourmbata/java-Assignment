package Coding;

import java.util.Scanner;

public class Vat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                System.out.println("Enter price of an item");
                int price = scanner.nextInt();
                System.out.println("Enter vat");
               int vat = scanner.nextInt();

       int price_inclusive = price + price *  vat/100;
       System.out.println(price_inclusive);



   }



    }


