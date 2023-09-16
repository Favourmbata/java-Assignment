package tdd.BakkApp;

import java.util.Objects;

import static sun.security.util.KeyUtil.validate;

public class AccountBe {
    private int balance;
    private final String pin;


    public AccountBe(String accountNumber, String accountName, String accountPin) {
        this.pin = accountPin;

    }


    public void depositAmount(int amount) {
     balance += amount;
    }

    public int checkBalance(String pin) {
    validate(pin);
    return balance;
    }

    private void validate(String pin) {
    boolean isIncorrectPin = !this.pin.equals( pin);
    if (isIncorrectPin)throw new IllegalArgumentException("pin is Incorrect");
    }
}
