package CheckAppStore;

import java.util.Scanner;

public class ShoppingMall {

    Scanner input = new Scanner(System.in);
    Scanner input1 = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);
    double discount = 0;
    double productPrice = 0;
    String cashierName = "";
    public void shoppingMail(){
       Customer customer = new Customer();

           System.out.println("What is  customers name");
           customer.setName(input.next());

          while (true) {

           System.out.println("What did the user buy");
           String productName = input.next();

           System.out.println("How many pieces?");
           int productQuantity = input1.nextInt();
try{
    System.out.println("How much per unit");
    productPrice = input1.nextDouble();

}catch (Exception e){
    System.out.println("How much per unit");
     productPrice  = input1.nextDouble();

}

              Product boughtProduct = buyNewProduct(productName, productPrice, productQuantity);
              customer.listOfProduct.add(boughtProduct);

              System.out.println("""
                      Do you want to add more
                      press -> any thing to continue
                      press -> 2 to exist

                      """);

                 String addMore = input2.next();
                 if (addMore.equalsIgnoreCase("1")|| addMore.equalsIgnoreCase("y")){
                     continue;
                 } if (addMore.equalsIgnoreCase("2")||addMore.equalsIgnoreCase("n")){

                     System.out.println("What is your name");
                      cashierName = input.next();

                     System.out.println("How much discount will he get");
                      discount = input.nextInt();

                     break;
                 }
       }
        totalbillReceiptGenerator(customer,cashierName,discount);
        System.out.println(receiptGenerator(customer,cashierName,discount));
    }

    public Product buyNewProduct(String prductName,double productPrice,int productQuantity){
        Product product = new Product();
        product.setProductPrice(productPrice);
        product.setProductQuantity(productQuantity);
        product.setProductName(prductName);
        product.setTotal(productPrice * productQuantity);
       return product;
    }

    public  void totalbillReceiptGenerator(Customer customer,String cashierName, double discount){
        double billTotal = 0;
        double subTotal = 0;

        System.out.println("""
        SEMICOLON STORES MAIN BRANCH
        LOCATION:312,HERBERT MACURCULAY WAY,SABO,YABA,LAGOS
        TEL:0980324
        DATE:
        CASHIER:cashiers: %s
        CUSTOMERS NAME: %s
        =============================================================
       ITEM            QTY          PRICE           TOTAL(NGN)
       -------------------------------------------------------------

     """);
      if (customer.listOfProduct.size() > 0){
          for (int i = 0; i < customer.listOfProduct.size(); i++) {
              for (int j = 0; j < customer.listOfProduct.size(); j++) {
                  subTotal += customer.listOfProduct.get(j).getTotal();
              }
             billTotal = subTotal+discount;




System.out.println("     "+customer.listOfProduct.
        get(i).getProductName()+"            "+customer.
        listOfProduct.get(i).getProductQuantity()+"           "+customer
        .listOfProduct.get(i).getProductPrice()+"           "+customer.listOfProduct.get(i).getTotal());

          }
          System.out.printf("""
                  ---------------------------------------------------------------------
                                               subTotal: %f
                                               Discount:  %f
                                              Vat @ 17.50: 927.50
                  ======================================================================
                                             BillTotal: %f
                  ======================================================================
                  This is not a receipt kindly pay:
                  ======================================================================



                  """,subTotal, discount,billTotal);
      }




    }

    public  String receiptGenerator(Customer customer,String cashierName, double discount){
        System.out.println("how much did the customer give you ");
        double amountPaid = input1.nextDouble();
        double subTotal = 0;


            for (int i = 0; i < customer.listOfProduct.size(); i++) {
                for (int j = 0; j < customer.listOfProduct.size(); j++) {
                    subTotal += customer.listOfProduct.get(j).getTotal();
                }

                double billTotal = subTotal-discount;
                double balance = amountPaid - billTotal;

                return String.format("""
    SEMICOLON STORES MAIN BRANCH
    LOCATION:312,HERBERT MACURCULAY WAY,SABO,YABA,LAGOS
    TEL:0980324
    DATE:
    CASHIER:cashiers: %s
    CUSTOMERS NAME: %s
    ================================================================
   ITEM            QTY          PRICE           TOTAL(NGN)
   -----------------------------------------------------------------
    %s                %d            %f              %f



   -------------------------------------------------------------------
                                      sub Total:   %f
                                      Discount:    %f
                                   VAT @ 17.50:    927.50
   ===================================================================
                                    Bill Total:   %f
                                   Amount paid:   %f
                                       Balance:   %f
   ===================================================================
   THANKS  FOR SHOPPING WITH US
                """,cashierName,customer.getName(),customer.listOfProduct.get(i).getProductName(),
                        customer.listOfProduct.get(i).getProductQuantity(),
                        customer.listOfProduct.get(i).getProductPrice(),
                        customer.listOfProduct.get(i).getTotal(),subTotal,discount,billTotal,amountPaid,balance );
            }

        return String.format("thanks for checking out our Store please come buy from us when you can afford buy our goods");

    }

    public static void main(String[] args) {

        ShoppingMall shoppingMall =  new ShoppingMall();
        shoppingMall.shoppingMail();

    }

}
