package inheritance;

public class SavingsAccount extends BankAccount {

   public SavingsAccount(String accountNumber,double balance){
       super(accountNumber, balance);
   }

    @Override
    public void withDraw(double amount){
         if (getBalance()-amount < 100){
             System.out.println("minimum balance of $100 required!");
         }else {
             super.withDraw(amount);
         }
    }

}
