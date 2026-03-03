package hoanhuy.presentation;

import hoanhuy.business.HistoryService;
import hoanhuy.business.SpaService;

import java.util.Scanner;

public class HistoryView {
    private static final HistoryService historyServiceService = new HistoryService();

    public static void showAnimalMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("""
                    +--------------------MENU-------------------+
                    |1. Hiển thị lịch sử .                      |
                    |2. Thao tác gần đây .                      |
                    |3. Thoát .                                 |
                    +-------------------------------------------+
                """);
            System.out.print("Lựa chọn của bạn : ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Chương trình kết thúc !");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ !");
            }
        } while (choice != 3);
    }
}
