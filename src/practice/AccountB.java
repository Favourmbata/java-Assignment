package practice;

public class AccountB {

    private String name;
    private  double balance;

    public  AccountB(){}


    public AccountB(String name,double balance){
        this.name = name;
        this.balance = balance;

    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void deposit(double depositAmount){
       if (depositAmount > 0.0){
           balance = + depositAmount;
       }
    }
    public String withdraw(int withdrawalAmount){
        if(withdrawalAmount > balance){
           return "withdrawl amount exceed account balance";
        }
        balance-= withdrawalAmount;
        return "sucessful";
    }


}
