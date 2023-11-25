package BankApplication;


public class Account {
    private String name;
    private int balance;
    public String pin;
    private  String accountNumber;

    public Account(String accountNumber, String accountName, String pin) {
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

    private void validate(String inComingPin) {
     if(!pin.equals(inComingPin))throw new WrongPinException("Favour Mbata");
    }


    private void checksufficientFundsWith(int amount) {
  if (amount > balance)throw new IllegalArgumentException("Insufficient funds");
    }

    public int checkBalance(String pin){
        validate(pin);
        return balance;
  }

    private void validate(int amount) {
    if (amount < 0 )throw new InvalidAmountException("%s is an invalid amount");
    }

    public String getAccountNumber() {
    return accountNumber;
    }


    public void updateAccount(String currentPin, String newPin) {
    validate(currentPin);
    this.pin = newPin;
    }

    public String name() {
     return name;
    }
}
