package hoanhuy.presentation;

import hoanhuy.model.Customer;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("""
                    +--------------------MENU-------------------+
                    |1. Quản lí thú cưng .                      |
                    |2. Quản lí khách hàng .                    |
                    |3. Quản lí dịch vụ spa .                   |
                    |4. Nhật kí hoạt động .                     |
                    |5. Thoát .                                 |
                    +-------------------------------------------+
                """);
            System.out.print("Lựa chọn của bạn : ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    runAnimalMenu();
                    break;
                case 2:
                    runClientMenu();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Chương trình kết thúc !");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ !");
            }
        } while (choice != 3);
    }

    private static void runAnimalMenu(){
        Scanner sc = new Scanner(System.in);
        AnimalView.showAnimalMenu();
    }

    private static void runClientMenu(){
        Scanner sc = new Scanner(System.in);
        ClientView.showClientMenu();
    }
}
