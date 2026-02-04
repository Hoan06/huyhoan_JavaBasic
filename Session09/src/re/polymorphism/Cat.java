package re.polymorphism;

public class Cat extends Animal {
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Meoz Meoz");
    }

    public void catchMouse(){
        System.out.println("Bắt chuột");
    }
}
