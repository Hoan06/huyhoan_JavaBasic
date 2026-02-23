package btvn.bai1;

public class Bicycle extends Vehicle {

    public Bicycle(String brand) {
        super(brand);
    }

    @Override
    public String move() {
        return "Di chuyển bằng sức người";
    }
}
