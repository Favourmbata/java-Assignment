package chapter3;

public class Account {
    private String name;
    private double balance;
    private double withdraw;

    public Account(String name, double balance) {
    }


    public String getName(String name) {
        return name;
    }

    public void setName(String name) {
        this.name = name;

     if (balance > 1000.00){
         this.balance = balance;
     }

    }



    public void  depositAmount(double depositAmount){
         if (depositAmount > 1000.00){
             balance = balance + depositAmount;
         }

    }
   public double getBalance(){
        return balance;
   }



   public void withdrawAmount(double withdrawAmount){
        if (withdrawAmount  > 1000.00 ){
            balance = balance - withdrawAmount;
            System.out.println("withdrawal exceeded account balance try again");
       }
   }




}
