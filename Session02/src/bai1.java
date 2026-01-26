import java.util.Scanner;

public class bai1 {
    public static final String RED = "\u001B[31m";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số tuổi của bạn : ");
        int age = sc.nextInt();

        System.out.print("Nhập số sách đang mượn : ");
        int borrowBook = sc.nextInt();

        if (age < 18 || borrowBook >= 3) {
            if (age < 18 ) {
                System.out.println("Kết quả : Bạn không đủ điều kiện.");
                System.out.println(RED + "\t - Lý do : Bạn phải từ 18 tuổi trở lên.");
                return;
            }
            if (borrowBook >= 3) {
                System.out.println("Kết quả : Bạn không đủ điều kiện.");
                System.out.println(RED + "\t - Lý do : Bạn đã mượn tối đa 3 cuốn  ");
                return;
            }
        }
        System.out.println("Kết quả : Bạn ĐỦ ĐIỀU KIỆN mượn sách quý hiếm.");
    }
}