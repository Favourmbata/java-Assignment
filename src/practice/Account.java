package practice;

public class Account {
  private  int balance;
    private String phoneNumber;
   private String password;
    private String firstName;
   private String secondName;
   private String accountNumber;

    public String registerCustomer(String name, String lastName, String password, String phoneNumber, String accountNumber) {
        this.firstName = name;
        this.secondName = lastName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.accountNumber = accountNumber;
        return "successful registration";

    }
        public int checkBalance(){
        return balance;
        }


    public String userLogIn(String password, String email) {
        if(!password.equals(password)){
            return "incorrect password";
        }

        if (!email.equals(email)){
            return  "incorrect email";
        }
        return "congratulation";

    }


    public void deposit(int amountDeposit) {
        balance+= amountDeposit;

    }

    public String withdraw(int withdrawAmount) {
    if(withdrawAmount > balance){
        return "insufficient fund";
    }
        balance-= withdrawAmount;
      return "success";
    }
}
