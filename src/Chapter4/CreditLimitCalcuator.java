package Chapter4;

public class CreditLimitCalcuator {
   private int accountNumber;
   private int balanceAtTheBeginningOfTheMonth;
   private int totalOfAllItemsChargedByTheCustomerThisMonth;
   private  int totalOfAllCreditsAppliedToTheCustomerAccountThisMonth;
   private  int allowedCreditLimit;
   private  int newBalance;
   public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return  accountNumber;
    }

    public void setCustomerBalanceAtTheBeginningOfTHeMonth(int balanceAtTheBeginningOfTheMonth) {
        this.balanceAtTheBeginningOfTheMonth = balanceAtTheBeginningOfTheMonth;
    }


    public int getBalanceAtTheBeginningOfTheMonth() {
       return balanceAtTheBeginningOfTheMonth;
    }

    public void setTotalOfAllItemsChargedByTheCustomerThisMonth(int totalOfAllItemsChargedByTheCustomerThisMonth) {
      this.totalOfAllItemsChargedByTheCustomerThisMonth = totalOfAllItemsChargedByTheCustomerThisMonth;
   }

    public int getTotalOfAllItemsChargedByTheCustomerThisMonth() {
      return totalOfAllItemsChargedByTheCustomerThisMonth;
    }

    public void setTotalOfAllCreditsAppliedToTheCustomerAccountThisMonth(int totalOfAllCreditsAppliedToTheCustomerAccountThisMonth) {
       this.totalOfAllCreditsAppliedToTheCustomerAccountThisMonth = totalOfAllCreditsAppliedToTheCustomerAccountThisMonth;
   }

    public int getTotalOfAllCreditsAppliedToTheCustomerAccountThisMonth() {
      return totalOfAllCreditsAppliedToTheCustomerAccountThisMonth;
   }

    public void setAllowedCreditLimit(int allowedCreditLimit) {
      this.allowedCreditLimit = allowedCreditLimit;
   }

    public int getAllowedCreditLimit() {
      return allowedCreditLimit;
   }

    public int getNewBalance() {
      int newBalance = balanceAtTheBeginningOfTheMonth  + totalOfAllItemsChargedByTheCustomerThisMonth - getTotalOfAllCreditsAppliedToTheCustomerAccountThisMonth();
       if (newBalance > allowedCreditLimit){
          System.out.println("Credit Limit Exceeded");
       }

       if(newBalance < 0){
           System.out.println("You are broke, you no get shi shi for hand go get money and come back later");
       }
       return  newBalance;
   }
}
