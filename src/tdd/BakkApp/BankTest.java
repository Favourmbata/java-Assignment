package tdd.BakkApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankTest {

    @BeforeEach

    public void testToDeposit(){
        Bank bank = new Bank();
        bank.resgister("favour","jude","2020");
    }
}