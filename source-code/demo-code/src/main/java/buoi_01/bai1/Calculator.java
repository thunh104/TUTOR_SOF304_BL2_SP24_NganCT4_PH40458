package buoi_01.bai1;

public class Calculator {
    //Phép cộng
    public int add(int soNguyenA, int soNguyenB){
        return soNguyenA + soNguyenB;
    }

    //Phép chia (Xét trường hợp chia cho số 0)
    public double divide(int soNguyenA, int soNguyenB){
        if(soNguyenB == 0){
            throw new ArithmeticException("Không thể chia cho số 0 !");
        }
        return (double) soNguyenA/soNguyenB;
    }
}
