package Chapter4B;

import ClassTask.MultiplicationWithoutOperator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class MultiplicationWithoutOperatorTest {
    @Test
    public void testWithoutMultiplicationOperator() {
        MultiplicationWithoutOperator multiply = new MultiplicationWithoutOperator();
        int total = multiply.multiplyWithoutOperator(6, 6);
        assertEquals(36, total);
    }

}