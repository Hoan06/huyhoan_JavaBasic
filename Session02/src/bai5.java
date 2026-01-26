import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int reputation = 100;
        int input;
        while(true){
            System.out.println("--- Hệ thống đánh giá độc giả ---");
            System.out.println("(Nhập số ngày trễ . Nhập 999 để kết thúc)");
            System.out.print("Số ngày trễ của lần này : ");
            input = sc.nextInt();

            if (input == 999) break;

            if (input > 0) {
                int minus = -2 * input;
                System.out.printf("=> Trả trễ %d ngày : %d điểm\n", input , minus);
                reputation += minus;
            } else {
                System.out.println("=> Trả đúng hạn : cộng 5 điểm" );
                reputation += 5;
            }
        }

        System.out.println("Tổng điểm uy tín : " + reputation);
        if (reputation > 120){
            System.out.println("Xếp loại : Độc giả thân thiết.");
        } else if (reputation >= 80) {
            System.out.println("Xếp loại : Độc giả tiêu chuẩn.");
        } else {
            System.out.println("Xếp loại : Độc giả cần lưu ý.");
        }
    }
}
