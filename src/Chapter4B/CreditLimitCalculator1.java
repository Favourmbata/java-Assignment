package Chapter4B;

import java.util.Scanner;

public class CreditLimitCalculator1 {
    public static void print(int word){
        System.out.println(word);
    }
 public static void print(String word){
     System.out.println(word);
 }

public int calculatingCreditLimit(int customersAccountNumber,int balanceAtTheBeginningOfTheMonth, int totalOfAllItemChargedByTheEndOfTheMonth,  int totalOfAllCreditAppliedToTheCustomersAccount,int allowedCreditLimit ){

    int newBalance = balanceAtTheBeginningOfTheMonth +totalOfAllItemChargedByTheEndOfTheMonth - totalOfAllCreditAppliedToTheCustomersAccount;


    if (newBalance > allowedCreditLimit)
            print("Credit limit exceeded you are broke");
           else {
               print("you are good");
    }
     return newBalance;
    }

    public static void main(String[] args) {
        CreditLimitCalculator1 creditLimitCalculator = new CreditLimitCalculator1();
        Scanner input = new Scanner(System.in);

        print("Enter customers account number");
        int customersAccountNumber = input.nextInt();

        print("Enter balance at the beginning of the month");
        int balanceAtTheBeginningOfTheMonth = input.nextInt();

        print("Enter total of all item charged by the customer this monnth");
        int totalOfAllItemChargedByTheEndOfTheMonth = input.nextInt();

        print("Enter total of all credit applied to the customers account this month");
        int totalOfAllCreditAppliedToTheCustomersAccount = input.nextInt();

        print("Enter allowed credit limit");
        int allowedCreditLimit = input.nextInt();
         creditLimitCalculator.calculatingCreditLimit(customersAccountNumber,balanceAtTheBeginningOfTheMonth,totalOfAllItemChargedByTheEndOfTheMonth,totalOfAllCreditAppliedToTheCustomersAccount,allowedCreditLimit);
    }

 }
