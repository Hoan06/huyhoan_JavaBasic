package re;

import re.inherit.Child;
import re.polymorphism.Animal;
import re.polymorphism.Calculator;
import re.polymorphism.Cat;
import re.polymorphism.Dog;

public class Main{
    public static void main(String[] args) {
        Child c = new Child();
        c.say();
        c.say1();

        System.out.printf("%d\n",Calculator.sum(1,2));

//        Animal[] animals = new Animal[20];
//        animals[0].makeSound(); Nó sẽ báo lỗi không biết con nào

        Animal cat = new Cat(); // Kiểu khai báo Animal - Kiểu thực tế : Cat
        Animal dog = new Dog();
        cat.makeSound();
        dog.makeSound();
        Cat cat2 = new Cat();
        cat2.catchMouse();

        // Ép kiểu ngầm định / Tường minh
        Cat cat1 = new Cat();
        Animal ani = cat1; // Ép kiểu ngầm định
        // Toán tử instanceOf kiểm tra kiểu thực tế
        if(ani instanceof Cat){
            Cat cat3 = (Cat) ani; // Ép kiểu tường minh => từ cha => con có thể sinh ra lỗi
        }
    }
}