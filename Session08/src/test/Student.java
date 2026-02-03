package test;

import java.util.Scanner;

import static test.Main.students;
import static test.Main.currentIndex;

public class Student {
    private String id;
    private String name;
    private double score;

    public Student(String id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public Student(){
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getRank(){
        if(this.score >= 8.0){
          return "Giỏi";
        } else if (this.score >= 6.5 && this.score < 8.0){
            return "Khá";
        } else {
            return "Trung bình";
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public static void addStudent(){
        Scanner sc = new Scanner(System.in);
        Student newStudent = new Student();

        System.out.print("Nhập id cho sinh viên ( theo định dạng SV + number ) : ");
        String newId = sc.nextLine();
        if (!newId.matches("^SV[0-9]{3}$")){
            System.out.println("Định dạng id cho sinh viên không chính xác!");
            return;
        }
        if (newId.trim().isEmpty()){
            System.out.println("Id không được để trống!");
            return;
        }
        System.out.print("Nhập tên sinh viên : ");
        String newName = sc.nextLine();
        if(newName.trim().isEmpty()){
            System.out.println("Tên sinh viên không được để trống!");
            return;
        }
        System.out.print("Nhập điểm cho sinh viên : ");
        Double newScore = Double.parseDouble(sc.nextLine());
        if (newScore < 0 && newScore > 10){
            System.out.println("Điểm không hợp lệ!");
            return;
        }
        newStudent.setId(newId);
        newStudent.setName(newName);
        newStudent.setScore(newScore);
        students[currentIndex] = newStudent;
        currentIndex++;
        System.out.println("Thêm sinh viên thành công.");
    }

    public static void displayStudent(){
        if(currentIndex == 0){
            System.out.println("Danh sách trống!");
            return;
        }
        System.out.println("=== Danh sách sinh viên ===");
        System.out.printf("%-12s | %-20s | %-3s | %-12s |%n",
                "Mã SV", "Tên SV", "Điểm" , "Học lực");
        for (int i = 0; i < currentIndex ; i++){
            System.out.printf("%-12s | %-20s | %-3s | %-12s |%n",
                    students[i].getId(), students[i].getName(), students[i].getScore() , students[i].getRank());
        }
    }

    public static void searchStudents(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập học lực sinh viên muốn tìm ( Giỏi , Khá , Trung bình ) : ");
        String input = sc.nextLine();
        if (input.trim().isEmpty()){
            System.out.println("Không được để trống!");
            return;
        }
        boolean flag = true;

        if (input.equals("Giỏi")){
            System.out.println("=== Danh sách sinh viên : ===");
            System.out.printf("%-12s | %-20s | %-3s | %-12s |%n",
                    "Mã SV", "Tên SV", "Điểm" , "Học lực");
            for (int i = 0 ; i < currentIndex ; i++){
                if(students[i].getRank().equals("Giỏi")){
                    flag = false;
                    System.out.printf("%-12s | %-20s | %-3s | %-12s |%n",
                            students[i].getId(), students[i].getName(), students[i].getScore() , students[i].getRank());
                }
            }
        } else if (input.equals("Khá")) {
            System.out.println("=== Danh sách sinh viên : ===");
            System.out.printf("%-12s | %-20s | %-3s | %-12s |%n",
                    "Mã SV", "Tên SV", "Điểm" , "Học lực");
            for (int i = 0 ; i < currentIndex ; i++){
                if(students[i].getRank().equals("Khá")){
                    flag = false;
                    System.out.printf("%-12s | %-20s | %-3s | %-12s |%n",
                            students[i].getId(), students[i].getName(), students[i].getScore() , students[i].getRank());
                }
            }
        } else if (input.equals("Trung bình")){
            System.out.println("=== Danh sách sinh viên : ===");
            System.out.printf("%-12s | %-20s | %-3s | %-12s |%n",
                    "Mã SV", "Tên SV", "Điểm" , "Học lực");
            for (int i = 0 ; i < currentIndex ; i++){
                if(students[i].getRank().equals("Trung bình")){
                    flag = false;
                    System.out.printf("%-12s | %-20s | %-3s | %-12s |%n",
                            students[i].getId(), students[i].getName(), students[i].getScore() , students[i].getRank());
                }
            }
        } else {
            System.out.println("Lựa chọn không hợp lệ !");
        }
        if (flag){
            System.out.println("Không tìm thấy sinh viên !");
            return;
        }
    }

    public static void sortRank(){
        for (int i = 0 ; i < currentIndex ; i++){
            for (int j = 0 ; j < currentIndex - i - 1 ; j++){
                if (students[j].getScore() < students[j+1].getScore()){
                    Student temp;
                    temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
            }
        }
        displayStudent();
    }
}
