package hoanhuy.presentation;

import hoanhuy.business.AnimalService;
import hoanhuy.business.CustomerService;
import hoanhuy.business.IManager;
import hoanhuy.business.SpaService;
import hoanhuy.model.Customer;
import hoanhuy.model.Pet;

import java.util.Scanner;

public class SpaView {
    private static final SpaService spaService = new SpaService();
    private static final CustomerService customerService = new CustomerService();

    public static void showAnimalMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("""
                    +--------------------MENU-------------------+
                    |1. Tiếp nhận thú cưng .                    |
                    |2. Xử lí dịch vụ .                         |
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

    public void addPetSpa(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập id khách hàng : ");
        String input = sc.nextLine();
        Customer cus = customerService.findById(input);
        if (cus == null){
            System.out.println("Không tìm thấy khách hàng !");
            return;
        }
        System.out.print("Nhập id pet của khách hàng : ");
        String idPet = sc.nextLine();
        Customer petCus = new Customer();
        petCus.findByIdPet(idPet);
        if (petCus == null){
            System.out.println("Không tìm thấy thú cưng !");
            return;
        }
//        spaService.addPetSpa(petCus);
    }
}
