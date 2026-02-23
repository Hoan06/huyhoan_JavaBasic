package btvn.bai5;

public abstract class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Phương thức tính lương (abstract)
    public abstract double calculateSalary();

    public String getName() {
        return name;
    }
}
