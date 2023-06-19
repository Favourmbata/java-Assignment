package chapter3;

public class Bank {
    private  String accountNumber;
    private String name;
    private String accountType;
    private  double amount;
    public Bank(String accountNumber, String name, String accountType, double amount){
        this.accountNumber = accountNumber;
        this.name = name;
        this.accountType = accountType;
        this.amount = amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void deposit(double amount){
      amount += amount;
   System.out.println("deposit amount:" + amount);
    }
    public void withdraw(double amount){
        if(amount < amount) {
            System.out.println("insufficient fund");
        }
        else{
        amount -= amount;
       System.out.println("withdraw amount:" + amount);
        }


        }
    }



















