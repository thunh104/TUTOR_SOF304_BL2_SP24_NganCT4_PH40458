package buoi_03.bai3;

import java.util.ArrayList;
import java.util.List;

public class GiaoVienService {
    public List<GiaoVien> giaoVienList = new ArrayList<>();

    public List<GiaoVien> getAll() {
        return giaoVienList;
    }

    public boolean themGiaoVien(GiaoVien giaoVien) {
        if (!giaoVien.getMaGV().startsWith("GV") || giaoVien.getSoNamKinhNghiem() <= 0 || giaoVien.getMaGV().trim().isEmpty()) {
            return false;
        }
        return giaoVienList.add(giaoVien);
    }

    public boolean xoaGiaoVien(GiaoVien giaoVien) {
        return giaoVienList.remove(giaoVien);
    }
}
