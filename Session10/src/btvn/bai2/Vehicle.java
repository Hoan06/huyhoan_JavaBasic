package btvn.bai1;

public abstract class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Phương thức trừu tượng
    public abstract String move();
}
