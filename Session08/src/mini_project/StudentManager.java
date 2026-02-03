package mini_project;

import java.util.Scanner;

public class StudentManager {
    static Student[] students = new Student[100];
    public static int currentIndex = 0;

    // thêm sinh viên
    public static void addStudent(){
        Scanner sc = new Scanner(System.in);
        Student newStudent = new Student();
        System.out.print("Nhập mã sinh viên : ");
        newStudent.setStudentId(sc.nextLine());
        if(newStudent.getStudentId().trim().isEmpty()){
            System.out.println("Mã sinh viên không được để trống.");
            return;
        }
        System.out.print("Nhập tên sinh viên : ");
        newStudent.setFullName(sc.nextLine());
        if(newStudent.getFullName().trim().isEmpty()){
            System.out.println("Tên sinh viên không được để trống.");
            return;
        }
        System.out.print("Nhập tuổi sinh viên : ");
        newStudent.setAge(Integer.parseInt(sc.nextLine()));
        if (newStudent.getAge() <= 0){
            System.out.println("Tuổi phải lớn hơn 0.");
            return;
        }
        System.out.print("Nhập giới tính sinh viên : ");
        newStudent.setGender(sc.nextLine());
        String gender = newStudent.getGender().trim();
        if(newStudent.getGender().trim().isEmpty()){
            System.out.println("Giới tính không được để trống.");
            return;
        }
        if(!gender.equals("Nam") && !gender.equals("Nữ")){
            System.out.println("Giới tính không hợp lệ ( chỉ nhập Nam or Nữ ).");
            return;
        }
        System.out.print("Nhập điểm toán : ");
        newStudent.setScoreMath(Double.parseDouble(sc.nextLine()));
        if(newStudent.getScoreMath() < 0 || newStudent.getScoreMath() > 10){
            System.out.println("Điểm phải lớn hơn hoặc bằng 0 và nhỏ hơn hoặc bằng 10.");
            return;
        }
        System.out.print("Nhập điểm lý : ");
        newStudent.setScorePhysic(Double.parseDouble(sc.nextLine()));
        if(newStudent.getScorePhysic() < 0 || newStudent.getScorePhysic() > 10){
            System.out.println("Điểm phải lớn hơn hoặc bằng 0 và nhỏ hơn hoặc bằng 10.");
            return;
        }
        System.out.print("Nhập điểm hóa : ");
        newStudent.setScoreChemistry(Double.parseDouble(sc.nextLine()));
        if(newStudent.getScoreChemistry() < 0 || newStudent.getScoreChemistry() > 10){
            System.out.println("Điểm phải lớn hơn hoặc bằng 0 và nhỏ hơn hoặc bằng 10.");
            return;
        }

        students[currentIndex] = newStudent;
        currentIndex++;
        System.out.println("Thêm sinh viên thành công.");
    }

    // hiển thị sinh viên
    public static void displayStudent(){
        if (currentIndex == 0) {
            System.out.println("Chưa có sinh viên nào trong danh sách.");
            return;
        }

        System.out.printf("%-12s | %-20s | %-3s | %-6s | %-13s | %-10s%n",
                "Mã SV", "Tên SV", "Tuổi", "Giới tính", "Điểm TB", "Xếp loại");
        System.out.println("----------------------------------------------------------------------------");

        for (int i = 0; i < currentIndex; i++) {
            Student s = students[i];
            double avg = s.avgScore();
            String rating;
            if(avg >= 8.0 && s.getScoreMath() >= 6.5 && s.getScoreChemistry() >= 6.5 && s.getScorePhysic() >= 6.5){
                rating = "Giỏi";
            } else if (avg >= 6.5 && s.getScoreMath() >= 5.0 && s.getScoreChemistry() >= 5.0 && s.getScorePhysic() >= 5.0){
                rating = "Khá";
            } else if (avg >= 5.0 && s.getScoreMath() >= 3.5 && s.getScoreChemistry() >= 3.5 && s.getScorePhysic() >= 3.5){
                rating = "Trung bình";
            } else {
                rating = "Yếu";
            }

            System.out.printf("%-12s | %-20s | %-3d | %-6s | %-13.2f | %-10s%n",
                    s.getStudentId(),
                    s.getFullName(),
                    s.getAge(),
                    s.getGender(),
                    avg,
                    rating);
        }
    }

    public static void searchStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên muốn tìm : ");
        String searchId = sc.nextLine();
        System.out.print("Nhập họ và tên sinh viên muốn tìm : ");
        String searchName = sc.nextLine();

        boolean flag = true;
        for (int i = 0 ; i < currentIndex ; i++){
            if(students[i].getStudentId().equals(searchId) && students[i].getFullName().equalsIgnoreCase(searchName)){
                flag = false;
                System.out.println("Sinh viên được tìm thấy : ");
                System.out.printf("%-12s | %-20s | %-3d | %-6s | %-13.2f | %-10s%n",
                        students[i].getStudentId(),
                        students[i].getFullName(),
                        students[i].getAge(),
                        students[i].getGender(),
                        students[i].avgScore(),
                        students[i].rating());
            }
        }

        if(flag){
            System.out.println("Không tìm thấy sinh viên nào !");
        }
    }

    public static void updateStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên muốn cập nhật thông tin : ");
        String searchId = sc.nextLine();
        boolean flag = true;
        for (int i = 0 ; i < currentIndex ; i++){
            if(students[i].getStudentId().equals(searchId)){
                flag = false;
                System.out.print("Nhập tên mới : ");
                students[i].setFullName(sc.nextLine());
                System.out.print("Nhập tuổi mới : ");
                students[i].setAge(Integer.parseInt(sc.nextLine()));
                System.out.print("Nhập điểm toán : ");
                students[i].setScoreMath(Double.parseDouble(sc.nextLine()));
                System.out.print("Nhập điểm lí : ");
                students[i].setScorePhysic(Double.parseDouble(sc.nextLine()));
                System.out.print("Nhập điểm hóa : ");
                students[i].setScoreChemistry(Double.parseDouble(sc.nextLine()));
                double avg = students[i].avgScore();
                String rating = students[i].rating();
                System.out.printf("Cập nhật thành công. Điểm TB: %.2f, Xếp loại: %s%n", avg, rating);
                break;
            }
        }

        if(flag){
            System.out.println("Không tìm thấy sinh viên nào !");
        }
    }

    public static void deleteStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên muốn xóa : ");
        String searchId = sc.nextLine();
        int index = -1;
        boolean flag = true;
        for (int i = 0 ; i < currentIndex ; i++){
            if(students[i].getStudentId().equals(searchId)){
                flag = false;
                index = i;
                break;
            }
        }

        if(flag){
            System.out.println("Không tìm thấy sinh viên nào !");
            return;
        }

        for (int i = index ; i < currentIndex ; i++){
            students[i] = students[i+1];
        }
        currentIndex--;
        System.out.println("Xóa sinh viên thành công.");
    }

    public static void checkAvgRating(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên muốn tính điểm : ");
        String searchId = sc.nextLine();
        boolean flag = true;
        for (int i = 0 ; i < currentIndex ; i++){
            if(students[i].getStudentId().equals(searchId)){
                flag = false;
                double avg = students[i].avgScore();
                String rating = students[i].rating();
                System.out.printf("Điểm TB: %.2f, Xếp loại: %s%n", avg, rating);
                break;
            }
        }

        if(flag){
            System.out.println("Không tìm thấy sinh viên nào !");
        }
    }

    public static void sortStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Sắp xếp theo ( 1. Điểm tb 2. Tên a-z ) : ");
        int choice = Integer.parseInt(sc.nextLine());
        if (choice == 1){
            for (int i = 0 ; i < currentIndex ; i++){
                for (int j = 0 ; j < currentIndex - i - 1 ; j++){
                    if (students[j].avgScore() < students[j+1].avgScore()){
                        Student temp = new Student();
                        temp = students[j];
                        students[j] = students[j+1];
                        students[j+1] = temp;
                    }
                }
            }
            System.out.println("Danh sách sau sắp xếp : ");
            System.out.printf("%-12s | %-20s | %-3s | %-6s | %-13s | %-10s%n",
                    "Mã SV", "Tên SV", "Tuổi", "Giới tính", "Điểm TB", "Xếp loại");
            System.out.println("----------------------------------------------------------------------------");

            for (int i = 0; i < currentIndex; i++) {
                Student s = students[i];
                double avg = s.avgScore();
                String rating;
                if(avg >= 8.0 && s.getScoreMath() >= 6.5 && s.getScoreChemistry() >= 6.5 && s.getScorePhysic() >= 6.5){
                    rating = "Giỏi";
                } else if (avg >= 6.5 && s.getScoreMath() >= 5.0 && s.getScoreChemistry() >= 5.0 && s.getScorePhysic() >= 5.0){
                    rating = "Khá";
                } else if (avg >= 5.0 && s.getScoreMath() >= 3.5 && s.getScoreChemistry() >= 3.5 && s.getScorePhysic() >= 3.5){
                    rating = "Trung bình";
                } else {
                    rating = "Yếu";
                }

                System.out.printf("%-12s | %-20s | %-3d | %-6s | %-13.2f | %-10s%n",
                        s.getStudentId(),
                        s.getFullName(),
                        s.getAge(),
                        s.getGender(),
                        avg,
                        rating);
            }
        } else if (choice == 2){
            for (int i = 0; i < currentIndex - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < currentIndex; j++) {
                    if (students[j].getFullName().compareToIgnoreCase(students[minIndex].getFullName()) < 0) {
                        minIndex = j;
                    }
                }
                if (minIndex != i) {
                    Student temp = students[i];
                    students[i] = students[minIndex];
                    students[minIndex] = temp;
                }
            }

            System.out.println("Danh sách sau sắp xếp theo tên A-Z : ");
            System.out.printf("%-12s | %-20s | %-3s | %-6s | %-13s | %-10s%n",
                    "Mã SV", "Tên SV", "Tuổi", "Giới tính", "Điểm TB", "Xếp loại");
            System.out.println("----------------------------------------------------------------------------");

            for (int i = 0; i < currentIndex; i++) {
                Student s = students[i];
                double avg = s.avgScore();
                String rating = s.rating();

                System.out.printf("%-12s | %-20s | %-3d | %-6s | %-13.2f | %-10s%n",
                        s.getStudentId(),
                        s.getFullName(),
                        s.getAge(),
                        s.getGender(),
                        avg,
                        rating);
            }
        } else {
            System.out.println("Lựa chọn không hợp lệ!");
        }
    }

    public static void statisticalStudent(){
        if (currentIndex == 0) {
            System.out.println("Chưa có sinh viên nào trong danh sách.");
            return;
        }
        int countGood =0;
        int countRather =0;
        int countMedium =0;
        int countWeak =0;

        for (int i = 0 ; i<currentIndex ; i++){
            if (students[i].rating().equals("Giỏi")){
                countGood++;
            }
            if (students[i].rating().equals("Khá")){
                countRather++;
            }
            if (students[i].rating().equals("Trung bình")){
                countMedium++;
            }
            if (students[i].rating().equals("Yếu")){
                countWeak++;
            }
        }

        Student max = students[0];
        Student min = students[0];

        for (int i = 0 ; i<currentIndex ; i++){
            Student s = students[i];
            if (s.avgScore() > max.avgScore()) {
                max = s;
            }

            if (s.avgScore() < min.avgScore()) {
                min = s;
            }
        }
        System.out.println("===== Thống kê sinh viên =====");
        System.out.println("Số lượng sinh viên theo xếp loại:");
        System.out.println("Giỏi: " + countGood);
        System.out.println("Khá: " + countRather);
        System.out.println("Trung bình: " + countMedium);
        System.out.println("Yếu: " + countWeak);

        System.out.println("\nSinh viên có điểm TB cao nhất:");
        System.out.printf("%-12s | %-20s | %-3s | %-6s | %-13s | %-10s%n",
                "Mã SV", "Tên SV", "Tuổi", "Giới tính", "Điểm TB", "Xếp loại");
        System.out.println("----------------------------------------------------------------------------");
        System.out.printf("%-12s | %-20s | %-3d | %-6s | %-13.2f | %-10s%n",
                max.getStudentId(),
                max.getFullName(),
                max.getAge(),
                max.getGender(),
                max.avgScore(),
                max.rating());

        System.out.println("\nSinh viên có điểm TB thấp nhất:");
        System.out.printf("%-12s | %-20s | %-3s | %-6s | %-13s | %-10s%n",
                "Mã SV", "Tên SV", "Tuổi", "Giới tính", "Điểm TB", "Xếp loại");
        System.out.println("----------------------------------------------------------------------------");
        System.out.printf("%-12s | %-20s | %-3d | %-6s | %-13.2f | %-10s%n",
                min.getStudentId(),
                min.getFullName(),
                min.getAge(),
                min.getGender(),
                min.avgScore(),
                min.rating());
    }
}
