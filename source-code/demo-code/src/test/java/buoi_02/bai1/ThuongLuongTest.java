package buoi_02.bai1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ThuongLuongTest {
    private ThuongLuong thuongLuong = new ThuongLuong();
    @Test
    public void testThuongLuongPass(){
        String expected = "Thưởng 3 triệu";
        String actual = thuongLuong.getTienLuong(2);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testThuongLuongWithInvalidYear(){
        Assertions.assertThrows(IllegalArgumentException.class, ()-> thuongLuong.getTienLuong(145));
    }

    @Test
    public void testThuongLuongWithCharacter(){
        Assertions.assertThrows(IllegalArgumentException.class, ()-> thuongLuong.getTienLuongNangCao("3.5"));
    }

    @Test
    public void testThuongLuongNangCao(){
        String expected = "Thưởng 20 triệu";
        String actual = thuongLuong.getTienLuongNangCao("9");
        Assertions.assertEquals(expected, actual);
    }
}
