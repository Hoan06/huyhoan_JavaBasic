import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số ngày chậm trễ : ");
        int n = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập số lượng sách mượn : ");
        int m = Integer.parseInt(sc.nextLine());

        int total = n * m * 5000;

        double totalAfter = total;

        if (n > 7 && m >= 3 ) {
            totalAfter = total + (total * 0.2);
        }

        System.out.println("Tiền phạt gốc : " + total);
        System.out.println("Tiền phạt sau điều chỉnh : " + totalAfter);
        System.out.printf("Yêu cầu khóa thẻ : %s " , totalAfter > 50000 ? "true" : "false");

    }
}