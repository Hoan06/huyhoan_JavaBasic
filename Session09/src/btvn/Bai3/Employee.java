package btvn.Bai3;

public class Employee {
    protected String fullName;
    protected int salary;

    public Employee(String fullName, int salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public Employee() {
    }

    public void printInfo(){
        System.out.println("Họ và tên : " + fullName);
        System.out.println("Lương cơ bản : " + salary);
    }
}
