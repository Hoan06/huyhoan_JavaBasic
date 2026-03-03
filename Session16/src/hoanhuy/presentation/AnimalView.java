package hoanhuy.presentation;

import hoanhuy.business.AnimalService;
import hoanhuy.business.IManager;
import hoanhuy.model.Customer;
import hoanhuy.model.Pet;

import java.util.List;
import java.util.Scanner;

public class AnimalView {
    private static final AnimalService animalService = new AnimalService();

    public static void showAnimalMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("""
                    +--------------------MENU-------------------+
                    |1. Thêm thú cưng .                         |
                    |2. Hiển thị danh sách .                    |
                    |3. Tìm pet theo id .                       |
                    |4. Xóa pet .                      |
                    |5. Thoát .                                 |
                    +-------------------------------------------+
                """);
            System.out.print("Lựa chọn của bạn : ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    addAnimal();
                    break;
                case 2:
                    showListPet();
                    break;
                case 3:
                    searchPet();
                    break;
                case 4:
                    sellPet();
                    break;
                case 5:
                    System.out.println("Chương trình kết thúc !");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ !");
            }
        } while(choice != 5);
    }

    public static void showListPet() {

        List<Pet> list = animalService.findAll();

        if (list.isEmpty()) {
            System.out.println("Danh sách trống !");
            return;
        }

        System.out.println("Danh sách thú cưng:");

        System.out.printf("+%s+%s+%s+%s+\n",
                "-".repeat(6),
                "-".repeat(27),
                "-".repeat(8),
                "-".repeat(10));

        System.out.printf("| %-4s | %-25s | %-6s | %-8s |\n",
                "ID", "Name", "Age", "Price");

        System.out.printf("+%s+%s+%s+%s+\n",
                "-".repeat(6),
                "-".repeat(27),
                "-".repeat(8),
                "-".repeat(10));

        for (Pet p : list) {
            System.out.printf("| %-4s | %-25s | %-6d | %-8.2f |\n",
                    p.getId(),
                    p.getName(),
                    p.getAge(),
                    p.getPrice());
        }

        System.out.printf("+%s+%s+%s+%s+\n",
                "-".repeat(6),
                "-".repeat(27),
                "-".repeat(8),
                "-".repeat(10));
    }

    public static void addAnimal() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập ID: ");
        String id = sc.nextLine();

        System.out.print("Nhập tên: ");
        String name = sc.nextLine();

        System.out.print("Nhập tuổi: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập giá: ");
        double price = Double.parseDouble(sc.nextLine());

        Pet pet = new Pet(id, name, age, price) {
            @Override
            public void makeSound() {
                System.out.println("Pet phát ra âm thanh");
            }
        };

        animalService.add(pet);
    }

    public static void searchPet() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập ID cần tìm: ");
        String id = sc.nextLine();

        animalService.search(id);
    }

    public static void sellPet() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập ID pet cần bán: ");
        String petId = sc.nextLine();

        System.out.print("Nhập ID khách mua: ");
        String cusId = sc.nextLine();

        Customer customer = new Customer(cusId);

        animalService.remove(petId , cusId);
    }
}
