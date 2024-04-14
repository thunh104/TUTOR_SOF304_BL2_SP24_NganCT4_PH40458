package buoi_03.bai3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Date;

public class GiaoVienServiceTest {
    private GiaoVienService giaoVienService;

    @BeforeEach
    public void setUp() {
        giaoVienService = new GiaoVienService();
    }

    @Test
    public void themThanhCong() {
        GiaoVien giaoVien = new GiaoVien(1, "GV01", "Phạm Gia Khánh", new Date(1988, 10, 22), "Hà Đông", 5);
        boolean expected = giaoVienService.themGiaoVien(giaoVien);
        Assertions.assertTrue(expected);
    }

    @Test
    public void themKhongThanhKhongBatDauBangGV() {
        GiaoVien giaoVien = new GiaoVien(1, "C01", "Phạm Gia Khánh", new Date(1988, 10, 22), "Hà Đông", 5);
        boolean expected = giaoVienService.themGiaoVien(giaoVien);
        Assertions.assertFalse(expected);
    }

    @Test
    public void soNamKinhNghiemNhoHon0() {
        GiaoVien giaoVien = new GiaoVien(1, "C01", "Phạm Gi Khánh", new Date(1988, 10, 22), "Hà Đông", -5);
        boolean expected = giaoVienService.themGiaoVien(giaoVien);
        Assertions.assertFalse(expected);
    }

    @Test
    public void maGVIsEmpty() {
        GiaoVien giaoVien = new GiaoVien(1, "", "Phạm Gia Khánh", new Date(1988, 10, 22), "Hà Đông", 5);
        boolean expected = giaoVienService.themGiaoVien(giaoVien);
        Assertions.assertFalse(expected);
    }

    @Test
    public void xoaThanhCong() {
        GiaoVien giaoVien1 = new GiaoVien(1, "GV01", "Phạm Gia Khánh", new Date(1988, 10, 22), "Hà Đông", 5);
        giaoVienService.themGiaoVien(giaoVien1);
        GiaoVien giaoVien2 = new GiaoVien(2, "GV02", "Phạm Gia Khánh", new Date(1988, 10, 22), "Hà Đông", 5);
        giaoVienService.themGiaoVien(giaoVien2);
        Assertions.assertTrue(giaoVienService.xoaGiaoVien(giaoVien2));
    }
}
