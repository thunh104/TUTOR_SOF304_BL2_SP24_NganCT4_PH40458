package buoi_01.bai3;

public class ArrayUtils {
    public int findMax(int[] array){
        if (array.length == 0){
            throw  new IllegalArgumentException("Mang khong duoc trong");
        }
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        return  max;
    }
}
