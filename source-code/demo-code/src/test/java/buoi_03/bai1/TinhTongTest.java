package buoi_03.bai1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TinhTongTest {
    private TinhTong tinhTong = new TinhTong();

    @Test
    public void tinhTongDung() {
        int expected = 75;
        int actual = tinhTong.tinhTongN(45);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nKhongThoaMan() {
        int expected = 0;
        int actual = tinhTong.tinhTongN(-10);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nKhongThoaMan2() {
        int expected = 0;
        int actual = tinhTong.tinhTongN(10010);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nTrong() {
        Assertions.assertThrows(NullPointerException.class, () -> tinhTong.tinhTong(""));
    }

    @Test
    public void nDouble() {
        Assertions.assertThrows(NumberFormatException.class, () -> tinhTong.tinhTong("108.7"));
    }

    @Test
    public void nNgoaiVung() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> tinhTong.tinhTong("-100"));
    }
}