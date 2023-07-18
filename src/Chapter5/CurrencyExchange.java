package Chapter5;

import java.util.Scanner;

public class CurrencyExchange {
static Scanner input = new Scanner(System.in);

    public static void print(int num){
    System.out.println();
}
    public  static void print(String word){
    System.out.println();
}
    public static void currencyExchange(){
    print("Enter Exchange rate from dollas to Rmb");
    double exchangeRate = input.nextDouble();
    print("Enter 0 to convert u.s.dollars to Rmb and  1 to convert Rmb to dollars");
    double conversion = input.nextDouble();
    if(conversion == 0){
        print("Enter Amount in dollars:");
        double amountInDollars = input.nextDouble();
       double convertedAmount = amountInDollars * exchangeRate;
       print(amountInDollars + "u.s.dollars is equal to " + convertedAmount + "u.s.dollars:" );
    } else if (conversion == 1 ){
        print("Enter the amount in chinese Rmb:");
        double amountInDollars = input.nextDouble();
        double  convertedAmount = amountInDollars/exchangeRate;
        print("chinese Rmb is equal to " +convertedAmount + "dollars.");
    }

    
    }
    public static void main(String[] args) {
currencyExchange();
    }

}
