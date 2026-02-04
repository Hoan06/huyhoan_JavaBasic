package btvn.Bai1;

public class Person {
    protected String fullName;
    protected int age;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {

    }

    public void printInfo(){
        System.out.println("Họ tên : " + fullName);
        System.out.println("Tuổi : " + age);
    }
}
