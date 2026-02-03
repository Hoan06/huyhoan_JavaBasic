package mini_project;

public class Student {
    private String studentId;
    private String fullName;
    private int age;
    private String gender;
    private double scoreMath;
    private double scorePhysic;
    private double scoreChemistry;

    public Student(String studentId, String fullName, int age, String gender, double scoreMath, double scorePhysic, double scoreChemistry) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.scoreMath = scoreMath;
        this.scorePhysic = scorePhysic;
        this.scoreChemistry = scoreChemistry;
    }

    public Student() {

    }

    // Getter and Setter

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getScoreMath() {
        return scoreMath;
    }

    public void setScoreMath(double scoreMath) {
        this.scoreMath = scoreMath;
    }

    public double getScorePhysic() {
        return scorePhysic;
    }

    public void setScorePhysic(double scorePhysic) {
        this.scorePhysic = scorePhysic;
    }

    public double getScoreChemistry() {
        return scoreChemistry;
    }

    public void setScoreChemistry(double scoreChemistry) {
        this.scoreChemistry = scoreChemistry;
    }

    public String rating(){
        double avg = avgScore();
        if(avg >= 8.0 && scoreMath >= 6.5 && scoreChemistry >= 6.5 && scorePhysic >= 6.5){
            return "Giỏi";
        } else if (avg >= 6.5 && scoreMath >= 5.0 && scoreChemistry >= 5.0 && scorePhysic >= 5.0){
            return "Khá";
        } else if (avg >= 5.0 && scoreMath >= 3.5 && scoreChemistry >= 3.5 && scorePhysic >= 3.5){
            return "Trung bình";
        } else {
            return "Yếu";
        }
    }

    public double avgScore(){
        return (this.scoreMath + this.scoreChemistry + this.scorePhysic)/3;
    }
}
