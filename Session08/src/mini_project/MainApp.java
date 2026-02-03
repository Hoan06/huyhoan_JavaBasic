package mini_project;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("""
                    ===== QUẢN LÝ SINH VIÊN =====
                    1. Thêm sinh viên mới.
                    2. Hiển thị tất cả sinh viên.
                    3. Tìm kiếm sinh viên.
                    4. Cập nhật thông tin sinh viên.
                    5. Xóa sinh viên.
                    6. Tính điểm trung bình và xếp loại.
                    7. Sắp xếp sinh viên.
                    8. Thống kê.
                    9. Thoát.
                    """);
            System.out.print("Nhập lựa chọn : ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice){
                case 1:
                    StudentManager.addStudent();
                    break;
                case 2:
                    StudentManager.displayStudent();
                    break;
                case 3:
                    StudentManager.searchStudent();
                    break;
                case 4:
                    StudentManager.updateStudent();
                    break;
                case 5:
                    StudentManager.deleteStudent();
                    break;
                case 6:
                    StudentManager.checkAvgRating();
                    break;
                case 7:
                    StudentManager.sortStudent();
                    break;
                case 8:
                    StudentManager.statisticalStudent();
                    break;
                case 9:
                    System.out.println("Chương trình kết thúc!!!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ !!!");
            }
        } while (choice != 9);
    }
}