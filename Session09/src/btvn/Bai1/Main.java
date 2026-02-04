package btvn.Bai1;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Student("Huy Hoàn" , 19 , "SV01" , 9.0);
        p1.printInfo();
        System.out.printf("%s" , p1.toString());
    }
}
