import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        int choice;
        do {
            System.out.println("""
                +------------------Menu---------------------+
                |1. Nhập vào 1 số nguyên dương n            |
                |2. Tính tổng của số chẵn và tổng số lẻ < n |
                |3. Tìm các số hoàn hảo < n                 |
                |4. Tính n!                                 |
                |5. Thoát chương trình                      |
                +-------------------------------------------+
                        """);
            System.out.print("Nhập lựa chọn của bạn : ");
            choice = sc.nextInt();
            switch(choice) {
                case 1 :
                    while(true) {
                        System.out.printf("Nhập vào 1 số nguyên dương : ");
                        input = sc.nextInt();
                        if (input <= 0) {
                            System.out.println("Vui lòng nhập số nguyên dương !");
                        }
                        if (input > 0){
                            break;
                        }
                    }
                    boolean check = true;
                    if (input < 2) {
                        check = false;
                    } else {
                        for (int i = 2 ; i < Math.sqrt(input) ; i++){
                            if (input % i == 0){
                                check = false;
                                break;
                            }
                        }
                    }
                    if (check){
                        System.out.printf("Số %d là số nguyên tố.\n" , input);
                    } else {
                        System.out.printf("Số %d không phải là số nguyên tố.\n" , input);
                    }
                    break;
                case 2 :
                    int totalEven=0;
                    int totalOdd=0;
                    for (int i =0 ; i < input ; i++){
                        if (i % 2 == 0) {
                            totalEven+=i;
                        } else {
                            totalOdd+=i;
                        }
                    }
                    System.out.println("Tổng số chẵn < n : " + totalEven);
                    System.out.println("Tổng số lẻ < n : " + totalOdd);
                    break;
                case 3 :
                    System.out.println("Các số hoàn hảo < n : ");
                    for(int i = 1 ; i < input ; i++){
                        int sum = 0;
                        for (int j = 1;j<=i/2;j++){
                            if(i%j == 0){
                                sum += j;
                            }
                        }

                        if (sum == i){
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println("");
                    break;
                case 4 :
                    int total = 1;
                    for (int i=1 ; i<= input ; i++){
                        total *= i;
                    }
                    System.out.println("Kết quả : " + total);
                    break;
                default :
                    System.out.println("Lựa chọn không phù hợp !!!");
            }
        } while (choice != 5);

    }
}
