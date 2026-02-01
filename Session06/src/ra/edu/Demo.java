package ra.edu;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        // Khởi tạo đối tượng
        Student student = new Student(); // Cấp phát bộ nhớ cho đối tượng student
        // Gán thông tin của đối tượng
        student.studentId = "S0001";
        student.fullName = "Nguyễn Văn A";
        student.email = "a@gmail.com";
//        student.phoneNumber = "012483484843";
        student.dateOfBirth = new Date();

        // Gọi phương thức
        student.checkIn();
        student.doHomework();
        student.getPhoneNumber();

        // Object và Instance

        Student s2 = new Student("S002" , "An Hải Lọ" , "D@gmail.com" , "0332823832");

        java.util.Scanner sc = new java.util.Scanner(System.in);
    }
}

















