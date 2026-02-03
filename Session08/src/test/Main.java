package test;

import java.util.Scanner;

public class Main {
    static Student[] students = new Student[100];
    static int currentIndex = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;


        do {
            System.out.println("""
                    ===== QUẢN LÝ ĐIỂM SINH VIÊN ===== 
                    1. Nhập danh sách sinh viên.
                    2. Hiển thị danh sách sinh viên.
                    3. Tìm kiếm sinh viên theo Học lực.
                    4. Sắp xếp theo học lực giảm dần.
                    5. Thoát.
                    """);

            System.out.print("Chọn chức năng : ");
            choice = Integer.parseInt(sc.nextLine());

            switch(choice){
                case 1:
                    Student.addStudent();
                    break;
                case 2:
                    Student.displayStudent();
                    break;
                case 3:
                    Student.searchStudents();
                    break;
                case 4:
                    Student.sortRank();
                    break;
                case 5:
                    System.out.println("Chương trình kết thúc!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!!!");
            }
        } while(choice!=5);
    }
}
