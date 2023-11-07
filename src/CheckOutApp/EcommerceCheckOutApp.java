package CheckOutApp;

import CheckAppStore.Customer;

import java.time.LocalDateTime;
import java.util.Scanner;

public class EcommerceCheckOutApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Product []products = new Product[3];
        for (int i = 0; i < 3 ; i++) {
            Product newProduct = new Product();
            System.out.println("what did user buy:");
            String name = input.nextLine();

            System.out.println("how may pieces:");
            int quantity = newProduct.setQuantity(Integer.parseInt(input.nextLine()));

            System.out.println("how much:");
            double price = newProduct.setPrice(Double.parseDouble(input.nextLine()));
        }

             for (int i = 0; i < 3 ; i++) {
            products[i] = new Product();

        }
    }

}