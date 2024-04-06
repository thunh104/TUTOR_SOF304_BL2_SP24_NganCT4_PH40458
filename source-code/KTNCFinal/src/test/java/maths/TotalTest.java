package maths;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import xuong.ktnc.ktncfinal.maths.Calculator;

public class TotalTest {

    private final Calculator cal = new Calculator();

    @Test
    public void testSuccess1(){
        Assertions.assertEquals(6 , cal.calculateTheSumIncreasingFrom1ToN(5));
    }

    @Test
    public void testSuccess2(){
        Assertions.assertThrows(NullPointerException.class , () -> cal.calculateTheSumIncreasingFrom1ToN(null));
    }

    @Test
    public void testSuccess3(){
        Assertions.assertThrows(ArithmeticException.class , () -> cal.calculateTheSumIncreasingFrom1ToN(-3));
    }

}
