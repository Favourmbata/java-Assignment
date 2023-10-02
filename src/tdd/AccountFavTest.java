package tdd;

import java.util.Scanner;

public class AccountFavTest {

    public static void main(String[] args) {

        AccountFav accountFav = new AccountFav();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount");
        int deposit = scanner.nextInt();
        accountFav.deposit(deposit);



        System.out.println("enter amount for withdrawal");
        int withdraw = scanner.nextInt();
        accountFav.withdraw(withdraw);



        System.out.println("Your balance is " +accountFav.checkBalance());
    }




 }
