import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã khu vực (A,B,C,D) : ");
        String code = sc.nextLine();

        switch(code) {
            case "A" :
                System.out.println("Vị trí : Tầng 1 - Sách văn học");
                break;
            case "B" :
                System.out.println("Vị trí : Tầng 2 - Sách khoa học");
                break;
            case "C" :
                System.out.println("Vị trí : Tầng 3 - Sách toán học");
                break;
            case "D" :
                System.out.println("Vị trí : Tầng 4 - Sách sinh học");
                break;
            default:
                System.out.println("Lỗi : Mã khu vực không hợp lệ !");
        }
    }
}
