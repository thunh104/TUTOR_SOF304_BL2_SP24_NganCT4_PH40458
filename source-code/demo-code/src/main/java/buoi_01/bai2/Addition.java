package buoi_01.bai2;

public class Addition {
    public int addition(String nStr) {
        if(nStr.trim().isEmpty()){
            throw new NullPointerException("Không được bỏ trống !");
        } else {
            try {
                int n = Integer.parseInt(nStr);
                if (n < 1) {
                    throw new IllegalArgumentException("n phải lớn hơn 1");
                } else {
                    int sum = 0;
                    for (int i = 1; i < n; i++) {
                        if (i % 2 == 1 && i != 3) {
                            sum += i;
                        }
                    }
                    return sum;
                }
            } catch (NumberFormatException e) {
                throw new NumberFormatException("n phải là số nguyên !");
            }
        }
    }
}
