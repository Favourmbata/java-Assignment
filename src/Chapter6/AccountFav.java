package Chapter6;

public class AccountFav {
    private int balance;


    public void deposit(int amount){
       if (amount > balance)
           System.out.println("Deposit sucessful");
        this .balance = balance + amount;

    }

  public int checkBalance(){
        return balance;

  }
  public void withdraw(int amount){
       if (amount >  balance   ){
           System.out.println("insufficient balance");

       } else if (amount < 0) {
           System.out.println("wrong input");
       }else
      this.balance = balance - amount;
  }




}
