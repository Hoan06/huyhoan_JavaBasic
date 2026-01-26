import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng sách trả muộn : ");
        int input = sc.nextInt();

        int total = 0;
        for (int i = 0 ; i < input ; i++) {
            System.out.printf("Nhập số ngày trễ của cuốn thứ %d : ", i+1);
            int temp = sc.nextInt();
            total+=temp;
        }
        total *= 5000;
        System.out.printf("===> Tổng tiền phạt : %d VNĐ" , total);
    }
}
