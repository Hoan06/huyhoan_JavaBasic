package business;

import model.SexEnum;
import model.Student;

import java.time.LocalDate;
import java.util.Scanner;

public class StudentServiceImpl implements IStudentService {
    // Mảng
    private Student[] list;
    private int size;
    // Biến cái lớp này thành 1 Singleton Pattern
//    private static final IStudentService studentService = new StudentServiceImpl();
//
//    public static IStudentService

    public StudentServiceImpl() {
        list = new Student[100];
        size = 0;
        list[size++] = new Student("SV001" , "Hà Thị Minh Trang" , "0987654321" , SexEnum.OTHER , LocalDate.parse("2007-01-01"));
        list[size++] = new Student("SV002" , "Nguyễn Huy Hoàn" , "0987654321" , SexEnum.MALE , LocalDate.parse("2007-02-01"));
        list[size++] = new Student("SV003" , "Đào Trường Sơn" , "0987654321" , SexEnum.FEMALE , LocalDate.parse("2007-03-01"));
    }

    @Override
    public void displayStudent() {
        if (size == 0){
            System.out.println("Không có sinh viên nào!");
        } else {
            System.out.printf("+%s+%s+%s+%s+%s+\n", "-".repeat(9) , "-".repeat(22) ,"-".repeat(12) ,"-".repeat(12) ,"-".repeat(12) );
            System.out.printf("| %-7s | %-20s | %-10s | %-10s | %-12s | \n" , "id" , "name" , "phone" , "sex" , "birthDate");
            System.out.printf("+%s+%s+%s+%s+%s+\n", "-".repeat(9) , "-".repeat(22) ,"-".repeat(12) ,"-".repeat(12) ,"-".repeat(12) );
            for (int i  = 0 ; i < size ; i++){
                list[i].displayData();
            }
        }
    }

    @Override
    public void addStudent(Scanner sc) {
        if(size == 100){
            System.out.println("Mảng đã đạt kích thước tối đa!");
            return;
        }
        // Tạo dữ liệu
        Student stu = new Student();
        stu.inputData(sc);
        // Xác minh dữ liệu
//        while(existById((stu.getId()))){
//            System.out.print("Mã sinh viên đã tồn tại , hãy nhập lại : ");
//            stu.setId(sc.nextLine());
//        }
        list[size++] = stu;
        System.out.println("Thêm mới thành công.");
    }

    @Override
    public void deleteStudent() {

    }

    @Override
    public void updateStudent() {

    }

    @Override
    public void findStudent() {

    }

//    private boolean existById(String id){
//        for (int i = 0 ; i < size ; i++){
//            if(list[i].getId().equals("")){
//
//            }
//        }
//    }
//    private boolean existByPhone(String phone){
//
//    }
}
