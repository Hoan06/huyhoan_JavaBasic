package btvn.bai5;

public class Main {
    public static void main(String[] args) {

        Employee staff = new OfficeStaff("An", 8000);
        Employee manager = new Manager("Bình", 15000, 5000);

        System.out.println(staff.getName() + " - Lương: " + staff.calculateSalary());
        System.out.println(manager.getName() + " - Lương: " + manager.calculateSalary());
    }
}
