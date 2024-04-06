package xuong.ktnc.ktncfinal.car.service;


import lombok.Getter;
import xuong.ktnc.ktncfinal.car.entities.XeOto;

import java.nio.charset.CharacterCodingException;
import java.util.ArrayList;
import java.util.List;

@Getter
public class XeOtoService {

    private final List<XeOto> xeOtoList = new ArrayList<>();

    public void add(XeOto xeOto){
        if(xeOto.getName() != null && !xeOto.getName().matches(".*[\\W_]+.*")){
            xeOtoList.add(xeOto);

        }else {
            throw new ArithmeticException("Car names cannot contain special characters");
        }
    }

    public List<XeOto> searchCarsByName(String name) {

        if(xeOtoList.isEmpty()){
            throw new ArrayIndexOutOfBoundsException();
        }

        List<XeOto> result = new ArrayList<>();
        for (XeOto xeOto : xeOtoList) {
            if (xeOto.getName().equalsIgnoreCase(name)) {
                result.add(xeOto);
            }
        }

        if(result.isEmpty()){
            throw new ArrayStoreException();
        }

        return result;
    }

    public List<XeOto> searchCarsByBrand(String brand) {
        List<XeOto> result = new ArrayList<>();
        for (XeOto xeOto : xeOtoList) {
            if (xeOto.getBrand().equalsIgnoreCase(brand)) {
                result.add(xeOto);
            }
        }
        return result;
    }

}
