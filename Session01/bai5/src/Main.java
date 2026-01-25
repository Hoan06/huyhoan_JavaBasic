import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã sách ( 4 chữ số ) : ");
        int n = sc.nextInt();

        int thousands = n/1000;
        int hundreds = (n/100) % 10;
        int dozens = (n/10) % 10;
        int units = n % 10;

        boolean check;
        int sumOfFirstThreeNumber =  thousands + hundreds + dozens;
        if (sumOfFirstThreeNumber % 10 == units){
            check = true;
        } else {
            check = false;
        }
        System.out.printf("Kết quả kiểm tra mã sách : %s " , check ? "Hợp Lệ" : "Sai Mã" );

    }
}