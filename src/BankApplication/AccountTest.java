package BankApplication;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {
    private Account account;
    @BeforeEach

    @Test
    public void deposit1k_balanceIs1kTest(){
        Account account = new Account("Account number","Account name","pin");
        account.deposit(1000);
        assertEquals(1000,account.checkBalance("pin"));
    }

    @Test
    public void deposit1k_deposit2k_balanceIs3kTest(){
        Account account = new Account("Account number","Account name","pin");
        account.deposit(1000);
        account.deposit(2000);
        assertEquals(3000,account.checkBalance("pin"));
    }

@Test
    public void wrongPin_inCheckBalance_throwsException(){
        assertThrows(WrongPinException.class,() ->account.checkBalance("pin"));
}

@Test
    public void correctPin_returnsBalanceTest(){
        assertEquals(0,account.checkBalance("correct pin"));
}

 @Test
    public void DepositNegativeAmount_throwsExceptionTest(){
        assertThrows(InvalidAmountException.class,()-> account.deposit(-30));
 }

  @Test
    public void deposit1k_withdraw5h_balanceIs5hTest(){
        account.deposit(1000);
        account.withdraw(500,"correct pin");
        assertEquals(500,account.checkBalance("correct pin"));
  }
   @Test
    public void deposit1k_withdraw5hWithWrongPin_throwTest(){
        account.deposit(1000);
        assertThrows(WrongPinException.class,()-> account.withdraw(-30,"correct pin"));

   }
}
