package xuong.ktnc.ktncfinal.car.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class XeOto {

    private int carId;

    private String name;

    private String brand;

    private String model;

    private double price;

    private int quantity;

    private int year;

    private String color;

}
