package btvn.Bai5;

public class ProductionEmployee extends Employee {


    public ProductionEmployee(String fullName, int salary) {
        super(fullName, salary);
    }

    public ProductionEmployee() {
    }

    @Override
    public int calculateSalary() {
        return super.salary * 5;
    }
}
