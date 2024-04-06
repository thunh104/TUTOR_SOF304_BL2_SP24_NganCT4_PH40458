package buoi_02.bai3;

import java.util.ArrayList;
import java.util.List;

public class NhanVienService {
    public List<NhanVien> nhanVienList = new ArrayList<>();

    public NhanVienService() {
        nhanVienList.add(new NhanVien(1, "NV01", "Hoài Thu", "Nguyễn", "Sinh viên", 30000.5));
        nhanVienList.add(new NhanVien(1, "NV02", "Hoài Thu", "Nguyễn", "Sinh viên", 30000.5));
        nhanVienList.add(new NhanVien(1, "NV03", "Thị Ngân", "Chu", "Sinh viên", 30000.5));
        nhanVienList.add(new NhanVien(1, "NV04", "Thu Trang", "Hoàng", "Sinh viên", 30000.5));
    }

    public void add(NhanVien nv) {
        if (nv.getSalary() < 0 || nv.getSalary() > 1000) {
            throw new IllegalArgumentException("Lương ngoài vùng (0-1000)");
        } else {
            nhanVienList.add(nv);
        }
    }

    public List<NhanVien> getAll() {
        return nhanVienList;
    }

    public boolean validate(String inputFN) {
        if (inputFN.trim().isEmpty()) {
            throw new NullPointerException("Firstname trống");
        } else {
            if (!inputFN.matches(".*[a-zA-Z0-9].*")) {
                throw new IllegalArgumentException("Firstname chứa kí tự đặc biệt");
            }
        }
        return true;
    }

    public int searchByFirstName(String firstName) {
        int count = 0;
        if (validate(firstName)) {
            for (NhanVien nhanVien : nhanVienList) {
                String firstNameInNhanVien = nhanVien.getFirstName();
                if (firstNameInNhanVien.equalsIgnoreCase(firstName)) {
                    count++;
                }
            }
            if (count == 0) {
                throw new ArrayIndexOutOfBoundsException("Không có tên này trong danh sách");
            } else {
                return count;
            }
        }
        return 0;
    }
}
