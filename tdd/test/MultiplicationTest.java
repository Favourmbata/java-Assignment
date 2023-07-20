package test;

import Chapter5.Multiplication;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicationTest {

    @Test
    public void testThatCanMultiply() {
     Multiplication multiplication = new Multiplication();
     int multiply = multiplication.multiply(2,5);
     assertEquals(10,multiply);

    }

 @Test
    public void testThatCanRaiseToPower(){
        Multiplication multiplication =  new Multiplication();
        int square = multiplication.square(5,2);
        assertEquals(25,square);
 }

//  @Test
//    public void testThatCanReverseANumber(){
//        Multiplication multiplication = new Multiplication();
//        int reverse = multiplication.reverse(1,2,3,4,5);
//
//  }

}

