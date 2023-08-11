package CheckOutApp;

import java.time.LocalDateTime;
import java.util.Scanner;

public class EcommerceCheckOutApp {


    Scanner input = new Scanner(System.in);
    LocalDateTime purchseTime = LocalDateTime.now();

    String cashier = input.next();

    public String checkApp(CheckAppParameter appParameter) {

        int amountOfItems = 0;
        while (true) {
            amountOfItems = +appParameter.getNumberOfItems() * appParameter.getPrice();

            if (!appParameter.getIsAgain()) {
                break;
            }
        }


        return String.format("""
                 SEMICLON
                 MAIN BRANCH
                 Location: 321,Herbert Macaulay way,Sabo Yaba,Lagos.
                 Tel:03293828343
                 DATE : %S
                 cashier:%s
                 custumer name : %s
                ===============================================================
                 ITEM              QUANTITY           PRICE         TOTAL(NGN)
                --------------------------------------------------------------- 
                
                
                ----------------------------------------------------------------
                
                
                ================================================================
                
                
                
                ================================================================
                THANK YOU FOR YOUR PATRONAGE
                ================================================================
                 """, purchseTime, cashier);


    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CheckAppParameter checkAppParameter = new CheckAppParameter();


        System.out.println("enter customer name ");
        String customerName = scanner.next();
        checkAppParameter.setCustomerName(customerName);
        while (true) {
            System.out.println("What did the user buy? ");
            String itemPurchased = scanner.next();
            checkAppParameter.setItemPurchase(itemPurchased);


            System.out.println("How many pieces?");
            int numberOfItem = scanner.nextInt();
            checkAppParameter.setNumberOfItems(numberOfItem);


            System.out.println("How much per unit?");
            int price = scanner.nextInt();
            checkAppParameter.setPrice(price);

            System.out.println("""
                    Do you want to buy again?
                    press -> yes to continue
                    press -> no to continue
                    """);
            String again = scanner.next();
            if(again.equalsIgnoreCase("yes")){
                continue;
            }
            else if(again.equalsIgnoreCase("no")){
                System.out.println("Thanks for using our service");
                break;
            }
            else break;
        }
          double item = scanner.nextDouble();
          double qty = scanner.nextDouble();
          double price = scanner.nextDouble();
          double Total = scanner.nextDouble();
          double SubTotal = scanner.nextDouble();
          double Discount = scanner.nextDouble();
          double VAT = scanner.nextDouble();
          double BillTotal = scanner.nextDouble();
          
            EcommerceCheckOutApp ecommerceCheckOutApp = new EcommerceCheckOutApp();

            System.out.println(ecommerceCheckOutApp.checkApp(checkAppParameter));

        }

    }

