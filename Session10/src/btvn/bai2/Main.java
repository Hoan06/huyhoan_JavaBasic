package btvn.bai1;

public class Main {
    public static void main(String[] args) {

        Vehicle car = new Car("Toyota");
        Vehicle bicycle = new Bicycle("Giant");

        System.out.println(car.brand + " - Cách di chuyển: " + car.move());
        System.out.println(bicycle.brand + " - Cách di chuyển: " + bicycle.move());
    }
}