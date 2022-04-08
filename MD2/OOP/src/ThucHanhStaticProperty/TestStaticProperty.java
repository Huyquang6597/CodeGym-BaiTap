package ThucHanhStaticProperty;

public class TestStaticProperty {
    public static void main(String[] args) {
        ThucHanhStaticProperty car1 = new ThucHanhStaticProperty("Mazda 3", "Skyactiv 3");
        System.out.println(ThucHanhStaticProperty.numberOfCars);
        ThucHanhStaticProperty car2 = new ThucHanhStaticProperty("Mazda 6","Skyactiv 6");
        System.out.println(ThucHanhStaticProperty.numberOfCars);
    }
}
