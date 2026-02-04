package btvn.Bai1;

public class Student extends Person {
    private String studentId;
    private double avg;

    public Student(){
        super();
    };

    public Student(String fullName, int age, String studentId, double avg) {
        super(fullName, age);
        this.studentId = studentId;
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", avg=" + avg +
                '}';
    }
}
