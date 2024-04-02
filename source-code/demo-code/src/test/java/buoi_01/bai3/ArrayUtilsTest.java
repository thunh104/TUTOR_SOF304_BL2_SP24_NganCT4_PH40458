package buoi_01.bai3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayUtilsTest {
    private ArrayUtils arrayUtils = new ArrayUtils();
    @Test
    public void testFindMaxEmpty(){
        int[] array = {};
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            arrayUtils.findMax(array);
        });
    }

    @Test
    public void testFindMaxSuccess(){
        int[] array = {1, 6, 21, 4};
        int arrMaxExpected = 21;
        int arrMaxActual = arrayUtils.findMax(array);
        Assertions.assertEquals(arrMaxExpected, arrMaxActual);
    }
}
