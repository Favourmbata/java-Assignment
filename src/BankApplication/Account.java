package BankApplication;


public class Account {
    private String name;
    private int balance;
    private String pin;
    private  int accountNumber;

    public Account(int accountNumber, String accountName, String pin) {
        this .pin = pin;
        this.accountNumber = accountNumber;
        name = accountName;
    }


    public void deposit(int amount){
        validate(amount);
        balance += amount;

  }
  public void withdraw(int amount,String pin){
  validate(pin);
  validate(amount);
  checksufficientFundsWith(amount);
  balance -= amount;
  }

    private void validate(String pin) {
     if (!this.pin.equals(pin))throw new WrongPinException("Incorrect pin");
    }

    private void checksufficientFundsWith(int amount) {
  if (amount > balance)throw new IllegalArgumentException("Insufficient funds");
    }

    public int checkBalance(String pin){
        validate(pin);
      return balance;
  }

    private void validate(int amount) {
    if (amount < 0)throw new InvalidAmountException("%s is an invalid amount");
    }

}
