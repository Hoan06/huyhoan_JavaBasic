package btvn.Bai4;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Employee {
    private String employeeId;
    private String employeeName;
    private BigDecimal salary;

    public Employee(BigDecimal salary, String employeeName, String employeeId) {
        this.salary = salary;
        this.employeeName = employeeName;
        this.employeeId = employeeId;
    }

    public Employee(){
        employeeId = "E01";
        employeeName = "Hello";
        salary = BigDecimal.valueOf(200000);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }


    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee(new BigDecimal("5000.0") , "Hi" , "E02");
        System.out.println(e1);
        System.out.println(e2);
    }
}
