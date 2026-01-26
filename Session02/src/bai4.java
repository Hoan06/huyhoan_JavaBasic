import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Nhập mã ID mới (phải > 0) : ");
            int input = sc.nextInt();
            if (input <= 0) {
                System.out.println("Lỗi : ID phải là số dương . Mời nhập lại!!!");
            }
            if (input > 0) {
                System.out.printf("Xác nhận : Mã sách %d đã được ghi nhận." , input);
                break;
            }
        }
    }
}
