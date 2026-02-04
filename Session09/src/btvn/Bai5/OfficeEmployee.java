package btvn.Bai5;

public class OfficeEmployee extends Employee {

    public OfficeEmployee(String fullName, int salary) {
        super(fullName, salary);
    }

    @Override
    public int calculateSalary() {
        return super.salary * 3;
    }
}
