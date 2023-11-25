package BankApplication;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {

  @Test
    public void test_BankCanRegisterCustomer(){
      Bank gtbBank = new Bank("fcmb");
      Account newAccount = gtbBank.registerCustomer("favy","john","12");
      assertEquals(1,gtbBank.getAccountNumber());
      assertEquals("1",newAccount.getAccountNumber());

  }
  @Test
    public void test_CustomerCan_DepositAmount(){
    Bank gtbBank = new Bank("fcmb");
    Account newAccount = gtbBank.registerCustomer("favy","john","1112");
      gtbBank.deposit(1000, newAccount.getAccountNumber());
      assertEquals(1000,newAccount.checkBalance("1112"));

  }
   @Test
  public void test_CustomerCanDeposit_AndWithDraw(){
     Bank gtbBank = new Bank("fcmb");
     Account newAccount = gtbBank.registerCustomer("favy","john","1134");
     gtbBank.deposit(1000,newAccount.getAccountNumber());
     gtbBank.withDraw(500,newAccount.getAccountNumber(),"1134");
     assertEquals(500,newAccount.checkBalance("1134"));
   }

  @Test
    public void test_CustomerCanTransfer(){
      Bank gtbBank = new Bank("fcmb");
      Account newAccount = gtbBank.registerCustomer("favy","john","1134");
      gtbBank.deposit(25000,newAccount.getAccountNumber());
      gtbBank.withDraw(25000,newAccount.getAccountNumber(),"1134");
      assertEquals(0,newAccount.checkBalance("1134"));

       gtbBank.deposit(10000,newAccount.getAccountNumber());
       gtbBank.transfer(6000,newAccount.getAccountNumber(),"5454","1134");
       assertEquals(4000,newAccount.checkBalance("1134"));
  }

 @Test
    public void test_BankCanRemoveAccount(){
     Bank gtbBank = new Bank("fcmb");
     Account newAccount = gtbBank.registerCustomer("favy","john","1134");
     gtbBank.removeAccount (newAccount.getAccountNumber(),"favy");

 }
  @Test
    public void test_BankCanUpdateAccount(){
      Bank gtbBank = new Bank("fcmb");
      Account newAccount = gtbBank.registerCustomer("favy","john","1134");
      gtbBank.updateAccountPin(newAccount.getAccountNumber(),"1134","2023");

  }

}
