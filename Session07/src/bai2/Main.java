package bai2;

import bai1.Student;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = a;

        Student s1 = new Student("SV01", "Nguyễn Văn A");
        Student s2 = s1;

        b = 20;
        s2.setStudentName("Trần Thị B");

        s2.setStudentName("Trần Thị B");

        System.out.println("Kiểu tham chiếu:");
        System.out.println("Thông tin s1:");
        s1.displayInfo();

        System.out.println("Thông tin s2:");
        s2.displayInfo();
    }
}
