package com.rikkeiedu.management;

import java.util.Scanner;

public class Student {
    private static int currentId = 0;
    private int id;
    private String fullname;
    private double score;
    private final String className = "rikkeiedu";

    public Student(){
        this.id = currentId++;
    }

    public Student(String fullname, double score, String className) {
        this.fullname = fullname;
        this.score = score;
    }


    public static int getCurrentId() {
        return currentId;
    }

    public static void setCurrentId(int currentId) {
        Student.currentId = currentId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getClassName() {
        return className;
    }

    public static void addStudent(Student[] students , int currentIndex){
        Student newStudent = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sinh viên : ");
        String newName = sc.nextLine();
        System.out.print("Nhập điểm : ");
        double newScore = Double.parseDouble(sc.nextLine());
        newStudent.setId(currentId);
        newStudent.setFullname(newName);
        newStudent.setScore(newScore);
        students[currentIndex] = newStudent;
        System.out.println("Thêm sinh viên thành công.");
    }

    public static void displayStudent(Student[] students , int currentIndex){
        for (int i = 0; i < currentIndex ; i++){
            System.out.println("Id : " + students[i].getId());
            System.out.println("FullName : " + students[i].getFullname());
            System.out.println("Score : " + students[i].getScore());
            System.out.println("ClassName : " + students[i].getClassName());
        }
    }

    public static void avgScoreStudent(Student[] students , int currentIndex){
        int sum =0;
        for (int i =0 ;i <currentIndex ;i++){
            sum+=students[i].getScore();
        }
        int avg = sum/currentIndex;
        System.out.println("Điểm trung bình của sinh viên là : " + avg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[100];
        int currentIndex  = 0;

        int choice;
        do {
            System.out.println("""
                    =============== Menu ===============
                    1. Thêm mới học sinh.
                    2. Hiển thị danh sách.
                    3. Tính điểm trung bình.
                    0. Thoát.
                    """);
            System.out.print("Nhập lựa chọn của bạn : ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice){
                case 1:
                    addStudent(students,currentIndex);
                    currentIndex++;
                    break;
                case 2:
                    displayStudent(students , currentIndex);
                    break;
                case 3:
                    avgScoreStudent(students,currentIndex);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!!!");
            }
        } while(choice != 0);
    }
}
