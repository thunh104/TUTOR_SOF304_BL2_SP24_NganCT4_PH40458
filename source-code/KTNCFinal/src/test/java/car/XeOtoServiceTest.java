package car;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import xuong.ktnc.ktncfinal.car.entities.XeOto;
import xuong.ktnc.ktncfinal.car.service.XeOtoService;

public class XeOtoServiceTest {

    private final XeOtoService xeOtoService = new XeOtoService();

    @Test
    public void testAddCar1() {
        setListCar();
        xeOtoService.add(new XeOto(1, "Lambo", "Lambo", "XXX", 200, 20, 100, "Black"));
        Assertions.assertEquals(5, xeOtoService.getXeOtoList().size());
    }

    @Test
    public void testAddCar2() {
        setListCar();
        xeOtoService.add(new XeOto(1, "Lambo", "Lambo", "XXX", 200, -20, 100, "Black"));
        Assertions.assertEquals(4, xeOtoService.getXeOtoList().size());
    }

    @Test
    public void testAddCar3() {
        setListCar();
        xeOtoService.add(new XeOto(1, "Lambo", "Lambo", "XXX", -200, 20, 100, "Black"));
        Assertions.assertEquals(4, xeOtoService.getXeOtoList().size());
    }

    @Test
    public void testAddCar4() {
        setListCar();
        xeOtoService.add(new XeOto(1, "Lambo", "Lambo", "XXX", 200, 20, -100, "Black"));
        Assertions.assertEquals(4, xeOtoService.getXeOtoList().size());
    }

    @Test
    public void testAddCar5() {
        setListCar();
        XeOto xeOto = new XeOto(1, "Lambo&$%#", "Lambo", "XXX", 200, 20, 100, "Black");
        Assertions.assertThrows(ArithmeticException.class, () -> xeOtoService.add(xeOto));
        Assertions.assertEquals(4, xeOtoService.getXeOtoList().size());
    }



    @Test
    public void testFindCarByName1(){
        setListCar();
        Assertions.assertEquals(xeOtoService.getXeOtoList().get(1), xeOtoService.searchCarsByName("Lambo2").get(0));
        Assertions.assertEquals("Lambo2", xeOtoService.searchCarsByName("Lambo2").get(0).getName());
    }

    @Test
    public void testFindCarByName2(){
        setListCar();
        Assertions.assertEquals(xeOtoService.getXeOtoList().get(2), xeOtoService.searchCarsByName("Lambo3").get(0));
        Assertions.assertEquals("Lambo3", xeOtoService.searchCarsByName("Lambo3").get(0).getName());
    }

    @Test
    public void testFindCarByName3(){
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> xeOtoService.searchCarsByName("Lambo2").get(0));
    }

    @Test
    public void testFindCarByName4(){
        setListCar();
        Assertions.assertThrows(ArrayStoreException.class, () -> xeOtoService.searchCarsByName("Lambon").get(0));
    }

    @Test
    public void testFinCarByBrand1(){
        setListCar();
        Assertions.assertEquals(2, xeOtoService.searchCarsByBrand("lam").size());
    }

    @Test
    public void testFinCarByBrand2(){
        setListCar();
        Assertions.assertEquals(1, xeOtoService.searchCarsByBrand("Cang1").size());
    }

    @Test
    public void testFinCarByBrand3(){
        setListCar();
        Assertions.assertEquals(1, xeOtoService.searchCarsByBrand("Cang").size());
    }

    private void setListCar() {
        xeOtoService.add(new XeOto(1, "Lambo1", "lam", "1", 1, 1, 1, "Black1"));
        xeOtoService.add(new XeOto(2, "Lambo2", "Lam", "2", 2, 2, 2, "Black2"));
        xeOtoService.add(new XeOto(3, "Lambo3", "Cang1", "3", 3, 3, 3, "Black3"));
        xeOtoService.add(new XeOto(4, "Lambo4", "Cang", "4", 4, 4, 4, "Black4"));
    }

}
