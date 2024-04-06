package buoi_02.bai1;

public class ThuongLuong {
    public String getTienLuong(int soNamLamViec) { //Cơ bản
        if (soNamLamViec < 0 || soNamLamViec > 125) {
            //return "Số năm làm việc không hợp lệ !"; //Cách 1: Không sử dụng exception
            throw new IllegalArgumentException("Số năm làm việc không hợp lệ (0-125)"); //Cách 2: Sử dụng exception
        } else if (soNamLamViec < 3) {
            return "Thưởng 3 triệu";
        } else if (soNamLamViec <= 6) {
            return "Thưởng 10 triệu";
        } else if (soNamLamViec <= 10) {
            return "Thưởng 20 triệu";
        } else {
            return "Thưởng 40 triệu";
        }
    }

    public boolean validate(String soNamLamViec) {
        try {
            int soNam = Integer.parseInt(soNamLamViec);
            return true;
        } catch (NumberFormatException numberFormatException) {
            throw new NumberFormatException("Số năm làm việc phải là số nguyên !");
        }
    }

    public String getTienLuongNangCao(String soNamLamViec) {
        if (validate(soNamLamViec)) {
            int soNam = Integer.parseInt(soNamLamViec);
            if (soNam < 0 || soNam > 125) {
                //return "Số năm làm việc không hợp lệ !"; //Cách 1: Không sử dụng exception
                throw new IllegalArgumentException("Số năm làm việc không hợp lệ (0-125)"); //Cách 2: Sử dụng exception
            } else if (soNam < 3) {
                return "Thưởng 3 triệu";
            } else if (soNam <= 6) {
                return "Thưởng 10 triệu";
            } else if (soNam <= 10) {
                return "Thưởng 20 triệu";
            } else {
                return "Thưởng 40 triệu";
            }
        }
        return null;
    }
}
