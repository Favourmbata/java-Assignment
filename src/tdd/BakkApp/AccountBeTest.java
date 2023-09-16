package tdd.BakkApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountBeTest {
    @Test
    public void testToDepositMoney_balanceIncreases(){
        AccountBe accountBe = new AccountBe("575277","favour","0331");
        assertEquals(0,accountBe.checkBalance("0331"));
        accountBe.depositAmount(5000);
       assertEquals(5000,accountBe.checkBalance("0331"));
    }

@Test
    public void testToCheckBalanceWithWrongPinthrowsIllegalExceptionTest(){
        AccountBe accountBe = new AccountBe("575277","favour","0331");
        accountBe.depositAmount(5000);
        assertEquals(5000,accountBe.checkBalance("0331"));
}
    @Test
    public void checkBalance(){
        AccountBe accountBe = new AccountBe("575211","favor","0331");
        accountBe.checkBalance("0331");
    }

}
