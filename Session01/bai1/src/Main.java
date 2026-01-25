import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ID sách: ");
        String bookID = sc.nextLine();

        System.out.print("Nhap tên sách: ");
        String bookName = sc.nextLine();

        System.out.print("Nhập năm sản xuất: ");
        int publishYear = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập giá: ");
        Double price = Double.parseDouble(sc.nextLine());

        System.out.print("Tình trạng sách: ");
        boolean isAvailable = Boolean.parseBoolean(sc.nextLine());

        System.out.println("-- Phiếu Thông tin sách --");
        System.out.printf("Tên sách: %s\n" ,bookName);
        System.out.printf("Mã số: %s | Tuổi thọ: %d\n" , bookID , 2026 - publishYear );
        System.out.printf("Giá bán: %f VNĐ\n" , price);
        System.out.printf("Tình trạng: %s\n" , isAvailable ? "Còn sách" : "Hết sách");
    }
}
