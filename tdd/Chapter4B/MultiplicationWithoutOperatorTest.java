package Chapter4B;

import ClassTask.MultiplicationWithoutOperator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MultiplicationWithoutOperatorTest {
    @Test
    public void testWithoutOutMultiplicationOperatorExist() {
        MultiplicationWithoutOperator multiply = new MultiplicationWithoutOperator();
        assertNotNull(multiply);
    }

    @Test
    public void testWithoutMultiplicationOperator() {
        MultiplicationWithoutOperator multiply = new MultiplicationWithoutOperator();
        int total = multiply.multiplyWithoutOperator(-6, -6);
        assertEquals(-36, total);
    }


}