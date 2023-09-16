package Chapter4B;

public class CreditLimitCalculator {
   private String customerAccountNumber;
   private int balanceAtTheBeginningOfTheMonth;
   private  int totalItemsChargedByTheCustomerByTheMonth;
   private int totalOfAllCreditAppliedToTheCustomersAccount;
   private  int creditLimit;


    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public int getTotalOfAllCreditAppliedToTheCustomersAccount() {
        return totalOfAllCreditAppliedToTheCustomersAccount;
    }

    public void setTotalOfAllCreditAppliedToTheCustomersAccount(int totalOfAllCreditAppliedToTheCustomersAccount) {
        this.totalOfAllCreditAppliedToTheCustomersAccount = totalOfAllCreditAppliedToTheCustomersAccount;
    }

    public int getTotalItemsChargedByTheCustomerByTheMonth() {
        return totalItemsChargedByTheCustomerByTheMonth;
    }

    public void setTotalItemsChargedByTheCustomerByTheMonth(int totalItemsChargedByTheCustomerByTheMonth) {
        this.totalItemsChargedByTheCustomerByTheMonth = totalItemsChargedByTheCustomerByTheMonth;
    }

    public String getcustomerAccountNumber() {
        return customerAccountNumber;
    }



    public int getBalanceAtTheBeginningOfTheMonth() {
        return balanceAtTheBeginningOfTheMonth;
    }

    public void setBalanceAtTheBeginningOfTheMonth(int balanceAtTheBeginningOfTheMonth) {
        this.balanceAtTheBeginningOfTheMonth = balanceAtTheBeginningOfTheMonth;
    }


    public void setCustomersAccount(String number) {
    this.customerAccountNumber = number;
    }

    public void calculatingNewBalance(){
        int newBalance =  balanceAtTheBeginningOfTheMonth +totalItemsChargedByTheCustomerByTheMonth-creditLimit;
        if(newBalance > creditLimit){
            System.out.println("credit limit exceeded");
        }

    }



 }
