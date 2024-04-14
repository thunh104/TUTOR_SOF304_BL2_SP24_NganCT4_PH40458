package buoi_03.bai1;

public class TinhTong {
    private boolean checkN(String nString) {
        if (nString.trim().isEmpty()) {
            throw new NullPointerException("Không được để trống");
            //return false;
        } else {
            int n = Integer.parseInt(nString);
            try {
                if (n < 0 || n >= 1000) {
                    //return false;
                    throw new IllegalArgumentException("Ngoài vùng (0-1000)");
                }
            } catch (NumberFormatException numberFormatException) {
                throw new NumberFormatException("n phải là số nguyên");
                //return false;
            }
        }
        return true;
    }

    public int tinhTong(String nString) {
        if (checkN(nString)) {
            int tong = 0;
            int n = Integer.parseInt(nString);
            for (int i = 0; i <= n; i++) {
                if (i % 3 == 0 && i % 5 == 0 && i != 15) {
                    tong += i;
                }
            }
            return tong;
        }
        return 0;
    }

    public int tinhTongN(int n) {
        int tong = 0;
        if (n < 0 || n >= 1000) {
            return 0;
        } else {
            for (int i = 0; i <= n; i++) {
                if (i % 3 == 0 && i % 5 == 0 && i != 15) {
                    tong += i;
                }
            }
        }
        return tong;
    }
}
