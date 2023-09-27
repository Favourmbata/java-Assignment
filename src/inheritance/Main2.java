package inheritance;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("create a Bank Account object (A/c No. BA1234) with initial balance of $500:");
        BankAccount BA1234 = new BankAccount("BA1234",500);


        System.out.println("Deposit $1000 into account BA1234:");
        BA1234.deposit(1000);
        System.out.println("New balance after depositing $1000: $" + BA1234.getBalance());

        System.out.println("Withdraw $600 from account BA1234:");
        BA1234.withDraw(600);
        System.out.println("New balance after withdrawing $600: $" + BA1234.getBalance());


        System.out.println("\nCreate a SavingsAccount object (A/c No. SA1234) with initial balance of $450:");
        SavingsAccount SA1234 = new SavingsAccount("SA1234",450);

        SA1234.withDraw(300);
        System.out.println("Balance after trying to withdraw $300: $" + SA1234.getBalance());


        System.out.println("\nCreate a SavingsAccount object (A/c No. SA1000) with initial balance of $300:");
        SavingsAccount SA1000 = new SavingsAccount("SA1000",300);


        System.out.println("Try to withdraw $250 from SA1000!");
        SA1000.withDraw(250);
        System.out.println("Balance after trying to withdraw $250: $" + SA1000.getBalance());
    }


    }

