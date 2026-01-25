
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập giá sách (USD - kiểu double) : ");
        double usd = sc.nextDouble();
        float usdReal = 25450.0f;
        System.out.println("Giá chính xác : " + usd * usdReal);
        long VND = (long) (usd * usdReal);
        System.out.printf("Giá làm tròn để thanh toán ( long ) : %d" , VND );
    }
}