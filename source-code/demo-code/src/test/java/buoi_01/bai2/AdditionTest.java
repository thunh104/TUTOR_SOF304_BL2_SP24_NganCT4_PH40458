package buoi_01.bai2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AdditionTest {
    private Addition addition = new Addition();
    @Test
    public void testAddition(){
        int expected = 1;
        int actual = addition.addition("4");
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testAdditionWithEmpty(){
        Assertions.assertThrows(NullPointerException.class, ()-> addition.addition(""));
    }

    @Test
    public void testAdditionWithCharacters(){
        Assertions.assertThrows(NumberFormatException.class, ()-> addition.addition("Nguyễn Hoài Thu"));
    }

    @Test
    public void testAdditionWithN1(){
        Assertions.assertThrows(IllegalArgumentException.class, ()-> addition.addition("0"));
    }
}
