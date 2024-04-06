package buoi_02.bai3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NhanVienServiceTest {
    private NhanVienService nhanVienService = new NhanVienService();
    private List<NhanVien> nhanVienList = nhanVienService.getAll();

    @Test
    public void addPass() {
        int expected = 5;
        NhanVien nhanVienMoi = new NhanVien(5, "NV04", "Hoài Anh", "Nguyễn", "Sinh viên", 399349.4);
        nhanVienService.add(nhanVienMoi);
        int actual = nhanVienList.size();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void addWithException() {
        NhanVien nhanVienMoi = new NhanVien(5, "NV04", "Hoài Anh", "Nguyễn", "Sinh viên", -1);
        Assertions.assertThrows(IllegalArgumentException.class, () -> nhanVienService.add(nhanVienMoi));
    }

    @Test
    public void addWithException1() {
        NhanVien nhanVienMoi = new NhanVien(5, "NV04", "Hoài Anh", "Nguyễn", "Sinh viên", 1001);
        Assertions.assertThrows(IllegalArgumentException.class, () -> nhanVienService.add(nhanVienMoi));
    }

    @Test
    public void testSearch() {
        int expected = 2;
        int actual = nhanVienService.searchByFirstName("Hoài Thu");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void searchInvalidName() {
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> nhanVienService.searchByFirstName("Duong"));
    }

    @Test
    public void searchInvalidName1() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> nhanVienService.searchByFirstName("#$"));
    }

    @Test
    public void searchInvalidNameCharacter() {
        Assertions.assertThrows(NullPointerException.class, () -> nhanVienService.searchByFirstName(""));
    }
}