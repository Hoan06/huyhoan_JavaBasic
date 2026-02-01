package btvn.Bai1;

public class Student {
    public int studentId;
    public String name;
    public int year;
    public double avg;

    public Student(int studentId, String name, int year, double avg) {
        this.studentId = studentId;
        this.name = name;
        this.year = year;
        this.avg = avg;
    }

    public void printStudent(){
        System.out.println("Thông tin sinh viên :");
        System.out.println("Mã sinh viên : " + studentId);
        System.out.println("Họ ten sinh viên : " + name);
        System.out.println("Năm sinh : " + year);
        System.out.println("Điểm trung bình : " + avg);
    }

    public static void main(String[] args) {
        Student sv1 = new Student(1, "Nguyễn Văn A", 2003, 8.5);
        Student sv2 = new Student(2, "Trần Thị B", 2004, 7.8);

        sv1.printStudent();
        sv2.printStudent();
    }
}
