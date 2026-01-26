import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int min = 1000;
        int avg = 0;
        for (int i = 0; i<7 ; i++ ){
            System.out.printf("Nhập lượt mượn ngày thứ %d : " , i+2);
            int input = sc.nextInt();
            if (input == 0) {
                continue;
            }
            if (input > max ){
                max = input;
            }
            if (input < min){
                min = input;
            }
            avg += input;
        }
        System.out.println("--- Kết quả thống kê ---");
        System.out.println("lượt mượn cao nhất : " + max);
        System.out.println("lượt mượn thấp nhất : " + min);
        System.out.println("Trung bình lượt mượn/ngày : " + avg/7);

    }
}
