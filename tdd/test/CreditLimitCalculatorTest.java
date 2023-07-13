package test;

import Chapter4.CreditLimitCalcuator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreditLimitCalculatorTest {
    @Test
    public void testThatCustomerHasAnAccount(){
        CreditLimitCalcuator creditLimitCalcuator =  new CreditLimitCalcuator();
        assertNotNull(creditLimitCalcuator);
    }

    @Test
    public void testThatCustomerHasAccountNumber(){
         CreditLimitCalcuator creditLimitCalcuator = new CreditLimitCalcuator();
         creditLimitCalcuator.setAccountNumber(575277201);
         assertEquals(575277201,creditLimitCalcuator.getAccountNumber());
    }

    @Test
    public void testThatCustomerhasBalanceAttheBeginningOfTheMonth(){
        CreditLimitCalcuator creditLimitCalcuator = new CreditLimitCalcuator();
        creditLimitCalcuator.setCustomerBalanceAtTheBeginningOfTHeMonth(5000);
        assertEquals(5000,creditLimitCalcuator.getBalanceAtTheBeginningOfTheMonth());
    }
    @Test
    public void testThatCustomerTotalOfAllItemsChargedByTheCustomerThisMonth(){
        CreditLimitCalcuator creditLimitCalcuator = new CreditLimitCalcuator();
        creditLimitCalcuator.setTotalOfAllItemsChargedByTheCustomerThisMonth(15);
        assertEquals(15,creditLimitCalcuator.getTotalOfAllItemsChargedByTheCustomerThisMonth());

    }
    @Test
    public void testThatCustomerHasTotalOfAllCreditsAppliedToTheCustomerAccountThisMonth(){
        CreditLimitCalcuator creditLimitCalcuator = new CreditLimitCalcuator();
        creditLimitCalcuator.setTotalOfAllCreditsAppliedToTheCustomerAccountThisMonth(3500);
        assertEquals(3500,creditLimitCalcuator.getTotalOfAllCreditsAppliedToTheCustomerAccountThisMonth());

    }

   @Test
    public  void  testThatCustomerHasAllowedCreditLimit(){
       CreditLimitCalcuator creditLimitCalcuator = new CreditLimitCalcuator();
       creditLimitCalcuator.setAllowedCreditLimit(10000);
    assertEquals(10000,creditLimitCalcuator.getAllowedCreditLimit());
    }

   @Test
    public void testThatCalculateCustomersNewBalance(){
       CreditLimitCalcuator creditLimitCalcuator = new CreditLimitCalcuator();
       creditLimitCalcuator.setAccountNumber(575277201);
       creditLimitCalcuator.setCustomerBalanceAtTheBeginningOfTHeMonth(5000);
       creditLimitCalcuator.setTotalOfAllItemsChargedByTheCustomerThisMonth(5000);
       creditLimitCalcuator.setTotalOfAllCreditsAppliedToTheCustomerAccountThisMonth(8000);
       creditLimitCalcuator.setAllowedCreditLimit(10000);
       assertEquals(2000,creditLimitCalcuator.getNewBalance());
    }

}
