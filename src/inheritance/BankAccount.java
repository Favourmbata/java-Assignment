package inheritance;

public class BankAccount {

    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber,double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount){
       balance += amount;
    }

    public void withDraw(double amount){
     if (balance >= amount){
         balance -=amount;
     }else {
         System.out.println("insufficient balance");
     }
    }
    public double getBalance(){
        return balance;
    }

}
