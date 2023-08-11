package Amigoscode;

import org.junit.jupiter.params.shadow.com.univocity.parsers.conversions.BigDecimalConversion;

import java.math.BigDecimal;

public class Decimal {

    public static void main(String[] args) {


        BigDecimal num1 = new BigDecimal("0.02");
        BigDecimal num2 = new BigDecimal("0.03");

        BigDecimal result = num2.subtract(num1);
        System.out.println(result);
    }
}