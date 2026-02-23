package presentation;

import business.IStudentService;
import business.StudentServiceImpl;

import java.util.Scanner;

public class MainMenu {
    /*--------------------------------- Menu --------------------------------
    1. Hiển thị danh sách sinh viên
    2. Thêm mới sinh viên
    3. Xóa sinh viên
    4. Cập nhật thông tin sinh viên
    5. TÌm kiếm sinh viên
    0. Thoát
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        IStudentService studentService = StudentServiceImpl.getInstance();
        IStudentService studentService = new StudentServiceImpl();

        while(true){
            System.out.println("""
                        --------------------------------- Menu --------------------------------
                        1. Hiển thị danh sách sinh viên
                        2. Thêm mới sinh viên
                        3. Xóa sinh viên
                        4. Cập nhật thông tin sinh viên
                        5. TÌm kiếm sinh viên
                        0. Thoát
                        -----------------------------------------------------------------------
                    """);
            System.out.print("Nhập lựa chọn : ");
            byte choice = Byte.parseByte(sc.nextLine());

            switch(choice){
                case 1:
                    studentService.displayStudent();
                    break;
                case 2:
                    studentService.addStudent(sc);
                    break;
                case 3:
                    studentService.deleteStudent();
                    break;
                case 4:
                    studentService.updateStudent();
                    break;
                case 5:
                    studentService.findStudent();
                    break;
                case 0:
                    System.out.println("Chương trình kết thúc!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!!!");
            }
        }
    }
}
