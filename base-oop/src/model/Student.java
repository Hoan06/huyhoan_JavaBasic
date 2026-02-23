package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Student implements IBaseModel {
    private String id;
    private String name;
    private String phone;
    private SexEnum sex;
    private LocalDate birthDate;
    public static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    public Student(String id, String name, String phone, SexEnum sex, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.sex = sex;
        this.birthDate = birthDate;
    }

    public Student() {
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public SexEnum getSex() {
        return sex;
    }

    public void setSex(SexEnum sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void inputData(Scanner scan) {
        System.out.print("Enter your id : ");
        id = scan.nextLine();
        System.out.print("Enter your name : ");
        name = scan.nextLine();
        System.out.print("Enter your phone : ");
        phone = scan.nextLine();
        System.out.print("Enter sex : 1.Nam - 2.Nữ - other.Khác ");
        int choice = Integer.parseInt(scan.nextLine());
        sex = choice == 1 ? SexEnum.MALE : choice == 2 ? SexEnum.FEMALE : SexEnum.OTHER;
        System.out.print("Enter your birth date (dd/MM//yyyy) : ");
        String input = scan.nextLine();
        birthDate = LocalDate.parse(input,dtf);
    }

    @Override
    public void displayData() {
        System.out.printf("| %-7s | %-20s | %-10s | %-10s | %-12s | \n" , id , name , phone , sex , birthDate.format((dtf)));
    }
}













