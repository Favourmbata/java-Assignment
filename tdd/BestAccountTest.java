import BestAccount.BestAccount;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BestAccountTest {
    @Test
    public void testDeposit(){
        BestAccount bestAccount = new BestAccount();
         bestAccount.deposit(7000);
         int balance = bestAccount.checkBalance();
         assertEquals(7000,balance);
    }

@Test
    public void testdepositTwice(){
        BestAccount bestAccount = new BestAccount();
        bestAccount.deposit(7000);
        bestAccount.deposit(7000);
        int balance = bestAccount.checkBalance();
      assertEquals(14_000,balance);
}

   @Test
    public void testdepositNegativeValuesFails(){
        BestAccount bestAccount  = new BestAccount();
        bestAccount.deposit(7000);
        bestAccount.deposit(-3000);
        int balance = bestAccount.checkBalance();
      assertEquals(7000,bestAccount.checkBalance());
    }

@Test
    public void testtoWithdraw(){
        BestAccount bestAccount = new BestAccount();
        bestAccount.deposit(4000);
        bestAccount.withdraw(3000);
        assertEquals(1000,bestAccount.checkBalance());
}

@Test
    public void testToWithdrawMoreThanBalance(){
        BestAccount bestAccount = new BestAccount();
        bestAccount.deposit(8000);
        bestAccount.withdraw(10_000);
        assertEquals(8000,bestAccount.checkBalance());
}

@Test
    public void testToWithDrawNegativeAmount(){
        BestAccount bestAccount = new BestAccount();
        bestAccount.deposit(5000);
        bestAccount.withdraw(-6000);
        assertEquals(5000,bestAccount.checkBalance()  );
}
 }
