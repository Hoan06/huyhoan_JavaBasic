package btvn.Bai5;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new OfficeEmployee("Huy Hoàn" , 2000000);
        employees[1] = new ProductionEmployee("Hoàn Huy" , 30000);
        employees[2] = new OfficeEmployee("Huy Tú" , 10000);

        int totalSalary = 0;
        for (int i = 0 ; i < employees.length ; i++){
            Employee s = employees[i];
            String type = s.getClass().getSimpleName();
            int salary = s.calculateSalary();
            totalSalary+=salary;
            System.out.printf("Họ và tên : %s - Phòng ban : %s - Lương : %d \n" , s.fullName , type , salary);
        }
        System.out.println("Tổng lương : " + totalSalary);

    }
}
