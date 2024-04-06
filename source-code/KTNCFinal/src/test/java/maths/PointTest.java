package maths;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import xuong.ktnc.ktncfinal.maths.Calculator;

public class PointTest {

    private final Calculator cal = new Calculator();

    @Test
    public void testSuccess1() {
        Assertions.assertEquals(7.800000190734863, cal.average(8F,7F,9F), 0.001);
    }

    @Test
    public void testSuccess2() {
        Assertions.assertThrows(ArithmeticException.class, () -> cal.average(-8F,7F,9F));
    }

    @Test
    public void testSuccess3() {
        Assertions.assertThrows(ArithmeticException.class, () -> cal.average(8F,-7F,9F));
    }

    @Test
    public void testSuccess4() {
        Assertions.assertThrows(ArithmeticException.class, () -> cal.average(8F,7F,-9F));
    }

    @Test
    public void testSuccess5() {
        Assertions.assertThrows(ArithmeticException.class, () -> cal.average(Float.MAX_VALUE, Float.MAX_VALUE,Float.MAX_VALUE));
    }

    @Test
    public void testSuccess6() {
        Assertions.assertThrows(NullPointerException.class, () -> cal.average(2F, null,3F));
    }

}
