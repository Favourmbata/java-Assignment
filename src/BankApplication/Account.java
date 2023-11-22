package BankApplication;


public class Account {
    private String name;
    private int balance;
    private String pin;
    private  int accountNumber;

    public Account(String accountNumber, String accountName, String pin) {
        this .pin = pin;
    }


    public void deposit(int amount){
        validate(amount);
        balance = +amount;

  }
  public void withdraw(int amount,String pin){
//  validate(pin);
  validate(amount);
  checksufficientFundsWith(amount);
  balance -= balance;
  }

    private void checksufficientFundsWith(int amount) {
//  if (amount > balance)
    }

    public int checkBalance(String pin){
//        validate(pin);
      return balance;
  }

    private void validate(int amount) {
    if (amount < 0)throw new InvalidAmountException(String.format("%s is an invalid amount"));
    }

}
