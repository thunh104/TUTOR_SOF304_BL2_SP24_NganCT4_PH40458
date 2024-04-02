package buoi_01.bai1;

import buoi_01.bai1.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        int expected = 10;
        int actual = calculator.add(3, 7);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAddFail() {
        int expected = 2147483647 + 2147483647; //overflow
        int actual = calculator.add(2147483647, 2147483647);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDivision() {
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(2, 0));
    }
}
