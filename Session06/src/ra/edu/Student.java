package ra.edu;

import java.util.Date;

public class Student {
    // Thuộc tính
    String studentId;
    public String fullName;
    Date dateOfBirth;
    protected String email;
    private String phoneNumber;


    // Phương thức
    // Phương thức khởi tạo : constuctor là 1 phương thức đặc biệt dùng để khởi tạo đối tượng
    public Student(){
        // dùng để thiết lập các giá trị ban đầu cho thuộc tính
        studentId = "S0001";
        fullName = "Nguyễn Văn A";
        email = "a@gmail.com";
        phoneNumber = "012483484843";
        dateOfBirth = new Date();
    }

    public Student(String studentId , String fullName , String email , String phoneNumber){
        this.studentId = studentId;
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        dateOfBirth = new Date();
    }


    void checkIn(){
        System.out.println("ra.edu.Student " + fullName + " checked in at " + new Date());
    }

    void doHomework(){
        System.out.println("ra.edu.Student " + fullName + " is doing homework.");
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}