package tdd;

public class Account {
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if(amount < 0 || amount == 0) {
            System.out.println("bad deposit");
        }
        if (amount > 0) {
            balance += amount;
            System.out.println("deposit successfully");
        }}

            public void withdraw(int amount){
             if(amount >= balance){

             }
            }




           }



