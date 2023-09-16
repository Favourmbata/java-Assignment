package CheckOutApp;

import CheckAppStore.Customer;

import java.time.LocalDateTime;
import java.util.Scanner;

public class EcommerceCheckOutApp {


    Scanner input = new Scanner(System.in);

    double item ;
    double qty ;
    double price;
    double Total ;
    double SubTotal ;
     double Discount;
     double VAT ;
   double BillTotal;
   double subTotal;
    double discountAmount;





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
                OUR PATRONAGE
                ================================================================
                 """, cashier);


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
            if(again.equalsIgnoreCase("yes")||again.equalsIgnoreCase("y")){
                continue;
            }
            else if(again.equalsIgnoreCase("no")||again.equalsIgnoreCase("n")){

                System.out.println("what is your name");
                String cashierName = scanner.next();

                System.out.println("How much discount will customer get");
                double discountAmount = scanner.nextDouble();

                System.out.printf("%nSEMICOLON STORES%n MAIN BRANCH%nLOCATION:312,HERBERT MACURCULAY WAY,SABO,YABA,LAGOS %nTEL:0980324%nCASHIER:%s%n%s%n",cashierName,customerName);

                for (int i = 0; i < 80 ; i++) {
                    System.out.print("=");
                }
                System.out.println();

                System.out.printf("\t\t\tITEM\t\t\tQTY\t\t\tPRICE\t\t\tTOTAL(NGN)");

                System.out.println();
                for (int i = 0; i < 80 ; i++) {
                    System.out.print("-");
                }


                break;

            }


        }

            EcommerceCheckOutApp ecommerceCheckOutApp = new EcommerceCheckOutApp();

            System.out.println(ecommerceCheckOutApp.checkApp(checkAppParameter));

        }
//    public static String totalbillReceiptGenerator(Customer customer, String cashierName, double discount, double amountPaid){
//        double subTotal = 0;
//
//        if (customer.listOfProduct.size() > 0){
//            for (int i = 0; i < customer.listOfProduct.size(); i++) {
//                for (int j = 0; j < customer.listOfProduct.size(); j++) {
//                    subTotal += customer.listOfProduct.get(j).getTotal();
//                }
//                double billTotal = subTotal+discount;
//                double balance = amountPaid - billTotal;
//                return String.format("""
//    SEMICOLON STORES MAIN BRANCH
//    LOCATION:312,HERBERT MACURCULAY WAY,SABO,YABA,LAGOS
//    TEL:0980324
//    DATE:
//    CASHIER:cashiers: %s
//    CUSTOMERS NAME: %s
//    =====================================================
//   ITEM            QTY          PRICE           TOTAL(NGN)
//   ------------------------------------------------------
//    %s                %d            %f              %f
//
//
//
//   ----------------------------------------------------------------
//                                      sub Total:   %f
//                                      Discount:    %f
//                                   VAT @ 17.50:    927.50
//   ==================================================================
//                                    Bill Total:   %f
//                                   Amount paid:   %f
//                                       Balance:   %f
//   ==================================================================
//   THANKS  FOR SHOPPING WITH US
//                """,cashierName,customer.getName(),customer.listOfProduct.get(i).getProductName(),
//                        customer.listOfProduct.get(i).getProductQuantity(),
//                        customer.listOfProduct.get(i).getProductPrice(),
//                        customer.listOfProduct.get(i).getTotal(),subTotal,discount,billTotal,billTotal,amountPaid,balance );
//            }
//        }
//
//
//        return String.format("thanks for checking out our Store please come buy from us when you can afford buy our goods");
//
//    }

    }

