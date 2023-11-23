package Chapter8;

import static org.junit.jupiter.api.Assertions.*;

class SavingAccountTest {

    public static void main(String[] args) {
        SavingAccount saver1 = new SavingAccount(2000);
        SavingAccount saver2 = new SavingAccount(3000);

        SavingAccount.interestRate(4);



        for (int i = 1; i <=12 ; i++) {
            System.out.println("new  month balance after interest for saver  1  " + saver1.monthlyyInterestRate());
            System.out.println("new  month balance after interest for saver  2  " + saver2.monthlyyInterestRate());
            System.out.println();
        }

        SavingAccount.interestRate(5);

        System.out.println("new month balance after interest for saver   1  " + saver1.monthlyyInterestRate());
        System.out.println("new month balance after interet  for saver   2  " + saver2.monthlyyInterestRate());


    }



}