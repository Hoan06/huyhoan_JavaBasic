import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số thứ tự sách trong kệ : ");
        int stt = sc.nextInt();

        int ke = (stt - 1)/25 + 1;
        int viTri = (stt - 1)%25 +1;

        String khuVuc = ke <= 10 ? "Khu cận" : "Khu viễn";

        System.out.println("--- Thông tin định vị ---");
        System.out.println("Sách số : " + stt);
        System.out.printf("Địa chỉ : Kệ %d - Vị trí %d \n" , ke , viTri);
        System.out.println("Phân khu : " + khuVuc);
    }
}