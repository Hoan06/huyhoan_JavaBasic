package btvn.bai1;

public class Car extends Vehicle {

    public Car(String brand) {
        super(brand);
    }

    @Override
    public String move() {
        return "Di chuyển bằng động cơ";
    }
}
