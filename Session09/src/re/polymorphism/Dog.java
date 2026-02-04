package re.polymorphism;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Gâu Gâu");
    }
}
