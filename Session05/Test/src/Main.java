import java.util.Scanner;

public class Main{

    static final int MAX = 100;
    static String[] arr = new String[MAX];
    static int count = 0;

    public static void printArray(String[] arr){
        if(count == 0){
            System.out.println("Danh sách trống!");
            return;
        }
        for (int i = 0 ; i < count ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static void addStudent(String input){
        Scanner sc = new Scanner(System.in);
        while (!input.matches("^B\\d{7}$")){
            System.out.print("Sai định dạng! Nhập lại MSSV (Bxxxxxxx): ");
            input = sc.nextLine();
        }
        arr[count] = input;
        count++;

        System.out.println("Thêm thành công sinh viên!");
    }

    public static void updateStudent(int index){
        Scanner sc = new Scanner(System.in);
        if (index < 0 || index > count){
            System.out.println("Index không hợp lệ!");
            return;
        }
        String newID;
        System.out.print("Nhập mã sinh viên mới : ");
        newID = sc.nextLine();
        while (!newID.matches("^B\\d{7}$")){
            System.out.print("Sai định dạng! Nhập lại MSSV (Bxxxxxxx): ");
            newID = sc.nextLine();
        }
        arr[index] = newID;
        System.out.println("Cập nhật thành công!");
    }

    public static void deleteStudent(String mssv) {
        int pos = -1;

        for (int i = 0; i < count; i++) {
            if (arr[i].equalsIgnoreCase(mssv)) {
                pos = i;
                break;
            }
        }
        if (pos == -1) {
            System.out.println("Không tìm thấy MSSV cần xóa!");
            return;
        }
        for (int i = pos; i < count - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[count - 1] = null;
        count--;

        System.out.println("Xóa MSSV thành công!");
    }

    public static void searchStudent(String keyword) {
        boolean found = false;
        String regex = ".*" + keyword + ".*";

        for (int i = 0; i < count; i++) {
            if (arr[i].toLowerCase().matches(regex.toLowerCase())) {
                System.out.println(arr[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy MSSV phù hợp!");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;


        do {
            System.out.println("""
                    ------------------ Menu ------------------
                    1. Hiển thị.
                    2. Thêm mới sinh viên.                      
                    3. Cập nhật sinh viên.
                    4. Xóa sinh viên.
                    5. Tìm kiếm.
                    6. Thoát.
                    ------------------------------------------
                    """);
            System.out.print("Nhập lựa chọn : ");
            choice = Integer.parseInt(sc.nextLine());
            System.out.println("");

            switch(choice){
                case 1:
                    printArray(arr);
                    break;
                case 2:
                    String input;
                    System.out.print("Nhập mã sinh viên (Bắt đầu bằng B) : ");
                    input = sc.nextLine();
                    addStudent(input);
                    break;
                case 3:
                    int index;
                    System.out.print("Nhập vị trí cần cập nhật : ");
                    index = Integer.parseInt(sc.nextLine());
                    updateStudent(index);
                    break;
                case 4:
                    System.out.print("Nhập mã sinh viên cần xóa: ");
                    String del = sc.nextLine();
                    deleteStudent(del);
                    break;

                case 5:
                    System.out.print("Nhập chuỗi cần tìm: ");
                    String key = sc.nextLine();
                    searchStudent(key);
                    break;
                case 6:
                    System.out.println("Chương trình kết thúc!!!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ !!!");
            }

        } while (choice != 6);
    }
}