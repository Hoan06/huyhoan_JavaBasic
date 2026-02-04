package btvn.Bai3;

public class Manager extends Employee {
    private String department;

    public Manager(String fullName, int salary, String department) {
        super(fullName, salary);
        this.department = department;
    }

    public Manager(String department) {
        this.department = department;
    }

    public Manager() {
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Phòng ban : " + department);
    }
}
