package btvn.Bai5;

public class Employee {
    protected String fullName;
    protected int salary;

    public Employee(String fullName, int salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public Employee() {
    }

    public int calculateSalary() {
        return 0;
    }
}
