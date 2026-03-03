package hoanhuy.presentation;

import hoanhuy.business.CustomerService;
import hoanhuy.model.Customer;

import java.util.Scanner;

public class ClientView  {
    private static final CustomerService customerService = new CustomerService();

    public static void showClientMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("""
                    +--------------------MENU-------------------+
                    |1. Đăng kí thành viên .                    |
                    |2. Tra cứu nhanh .                         |
                    |3. Thoát .                                 |
                    +-------------------------------------------+
                """);
            System.out.print("Lựa chọn của bạn : ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    addCustomer();
                    break;
                case 2:
                    searchCustomer();
                    break;
                case 3:
                    System.out.println("Chương trình kết thúc !");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ !");
            }
        } while (choice != 3);
    }
    private static void addCustomer(){

        Scanner sc = new Scanner(System.in);

        Customer customer = new Customer();

        System.out.print("Nhập ID khách: ");
        customer.setId(sc.nextLine());
        System.out.print("Nhập tên khách: ");
        customer.setFullName(sc.nextLine());
        System.out.print("Nhập số điện thoại khách : ");
        customer.setPhone(sc.nextLine());

        customerService.add(customer);
    }

    private static void searchCustomer(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập ID cần tìm: ");
        String id = sc.nextLine();

        customerService.search(id);
    }

}
