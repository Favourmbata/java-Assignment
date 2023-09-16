import Chapter4B.CreditLimitCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CreditLimitCalculatorTest {
    @Test
    public void testThatCustomerHasAccount(){
        CreditLimitCalculator creditLimitCalculator = new CreditLimitCalculator();
        creditLimitCalculator.setCustomersAccount("575277201");
        assertEquals("575277201",creditLimitCalculator.getcustomerAccountNumber());
    }
  @Test
    public void testThatCustomerHasBalanceAtTheBeginningOfTheMonth(){
        CreditLimitCalculator creditLimitCalculator = new CreditLimitCalculator();
       creditLimitCalculator.setBalanceAtTheBeginningOfTheMonth(10000);
       assertEquals(10000,creditLimitCalculator.getBalanceAtTheBeginningOfTheMonth());
    }

 @Test
    public void testTotalOfAllICreditAppliedByTheCustomerThisMonth(){
        CreditLimitCalculator creditLimitCalculator = new CreditLimitCalculator();
        creditLimitCalculator.setTotalOfAllCreditAppliedToTheCustomersAccount(2000);
       assertEquals(2000,creditLimitCalculator.getTotalOfAllCreditAppliedToTheCustomersAccount());


    }

@Test
    public void testTotalOfAllItemsChargedByCustomerThisMonth(){
        CreditLimitCalculator creditLimitCalculator = new CreditLimitCalculator();
        creditLimitCalculator.setTotalItemsChargedByTheCustomerByTheMonth(1500);
      assertEquals(1500,creditLimitCalculator.getTotalItemsChargedByTheCustomerByTheMonth());

    }


@Test
    public void testThatCustomerHasAllowedcreditLimit(){
        CreditLimitCalculator creditLimitCalculator = new CreditLimitCalculator();
        creditLimitCalculator.setCreditLimit(4000);
        assertEquals(4000,creditLimitCalculator.getCreditLimit());
}




 }
