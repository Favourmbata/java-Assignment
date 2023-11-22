package BankApplication;

public class InsuffientFundException extends RuntimeException{
    public InsuffientFundException(String message){
        super(message);
    }
}
