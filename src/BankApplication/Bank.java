package BankApplication;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;

    private int totalNumberOfAccounts;
    private List<Account> listOfAccount = new ArrayList<>();

    public Bank(String bankName ) {
        this.name = bankName;
    }


    private String generateName(String firstName, String lastName) {
        return firstName + lastName;
    }

    private String generateAccountNumber() {
        return (listOfAccount.size() + 1) + "";
    }

    public int getAccountNumber() {
        return totalNumberOfAccounts;
    }

    public Account registerCustomer(String firstName, String lastName, String pin) {
        totalNumberOfAccounts++;
        String fullName = firstName + " " + lastName;
        Account account = new Account(generateAccountNumber(), fullName, pin);
         listOfAccount.add(account);
        return account;
    }

    public void deposit(int amount,String accountNumber) {
     Account foundAccount = findAccount(accountNumber);
     foundAccount.deposit(amount);
    }

    private Account findAccount(String accountNumber) {
        for (Account account : listOfAccount)
            if (String.valueOf(account.getAccountNumber()).equals(accountNumber)) {
                return account;
            }
   throw new NullPointerException("Account not found");
    }

    public int checkBalance(String accountNumber ,String pin) {
      Account foundAccount = findAccount(accountNumber);
      return foundAccount.checkBalance(pin);
    }

    public void withDraw(int amount, String accountNumber,String pin) {
      Account foundAccount = findAccount(accountNumber);
      foundAccount.withdraw(amount,pin);
    }


    public void transfer(int amount, String sendersAccount,String receiversAccount,String pin) {
     Account fromAccount = findAccount(sendersAccount);
     fromAccount.withdraw(amount,pin);


     Account toAccount = findAccount(receiversAccount);
      toAccount.deposit(amount);
    }


    public void removeAccount(String accountNumber,String name) {
    }
    public Account findAccount(int account){
        return null;
    }

    public void updateAccountPin(String accountNumber, String currentPin, String newPin) {
    Account account = findAccount(accountNumber);
    account.updateAccount(currentPin,newPin);

    }



    public String alert(String accountNumber, String pin){
        String design = "=".repeat(40);
        Account account = findAccount(accountNumber);
        return  design + "\nAccount Number: " + account.getAccountNumber()
                + "\nAccount Name: " + account.name()
                + "\nAccount Balance: " + account.checkBalance(pin)
                + "\n" + design;
    }
}



