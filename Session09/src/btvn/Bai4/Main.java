package btvn.Bai4;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        if (a1 instanceof Dog){
            ((Dog) a1).soundDog();
        }
    }
}
