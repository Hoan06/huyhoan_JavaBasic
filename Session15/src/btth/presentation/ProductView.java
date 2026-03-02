package btth.presentation;

import btth.bussiness.IProductService;
import btth.bussiness.ProductSevice;
import btth.model.Product;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ProductView {
    private static final IProductService productService = new ProductSevice();
    public static void showProductMenu(Scanner sc){
        while(true){
            System.out.println("""
                    +--------------------MENU-------------------+
                    |1. Hiển thị danh sách sản phẩm             |
                    |2. Thêm mới sản phẩm                       |
                    |3. Cập nhật thông tin sản phẩm             |
                    |4. Xóa sản phẩm                            |
                    |5. Lọc sản phẩm                            |
                    |6. Sắp xếp sản phẩm                        |
                    |7. Thoát                                   |
                    +-------------------------------------------+
                """);
            System.out.print("Lựa chọn của bạn : ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    showListProduct();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    updateProduct();
                    break;
                case 4:
                    deleteProduct();
                    break;
                case 5:
                    filterProduct();
                    break;
                case 6:
                    sortProduct();
                    break;
                case 7:
                    System.out.println("Chương trình kết thúc !");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ !");
            }
        }
    }

    private static void showListProduct(){
        List<Product> list = productService.findAll();

        if(productService.findAll().isEmpty()){
            System.out.println("Danh sách trống !");
        }

        // in tiêu đề
        System.out.printf("+%s+%s+%s+%s+%s+%s+\n",
                "-".repeat(6),
                "-".repeat(27),
                "-".repeat(12),
                "-".repeat(7),
                "-".repeat(12),
                "-".repeat(22)
        );
        System.out.printf("| %-4s | %-25s | %-10s | %-5s | %-10s | %-20s |\n",
                "ID", "Name", "Price", "Stock", "Desc", "Created At"
        );
        System.out.printf("+%s+%s+%s+%s+%s+%s+\n",
                "-".repeat(6),
                "-".repeat(27),
                "-".repeat(12),
                "-".repeat(7),
                "-".repeat(12),
                "-".repeat(22)
        );


        for (Product p : list){
            System.out.print(p);
        }

        System.out.printf("+%s+%s+%s+%s+%s+%s+\n",
                "-".repeat(6),
                "-".repeat(27),
                "-".repeat(12),
                "-".repeat(7),
                "-".repeat(12),
                "-".repeat(22)
        );
    }

    private static void addProduct(){
        Scanner sc = new Scanner(System.in);
        Product p = new Product();
        System.out.print("Nhập id sản phẩm : ");
        p.setId(sc.nextLine());
        System.out.print("Nhập tên sản phẩm : ");
        p.setName(sc.nextLine());
        System.out.print("Nhập giá tiền : ");
        p.setPrice(Float.parseFloat(sc.nextLine()));
        System.out.print("Nhập số lượng tồn kho : ");
        p.setStock(Integer.parseInt(sc.nextLine()));
        System.out.print("Nhập mô tả : ");
        p.setDescription(sc.nextLine());
        p.setDayCreate(new Date());
        productService.add(p);
    }

    private static void updateProduct(){
        Scanner sc = new Scanner(System.in);
        Product p = new Product();
        System.out.print("Nhập id sản phẩm muốn cập nhật : ");
        p.setId(sc.nextLine());
        System.out.print("Nhập tên sản phẩm mới : ");
        p.setName(sc.nextLine());
        System.out.print("Nhập giá tiền mới : ");
        p.setPrice(Float.parseFloat(sc.nextLine()));
        System.out.print("Nhập số lượng tồn kho mới : ");
        p.setStock(Integer.parseInt(sc.nextLine()));
        System.out.print("Nhập mô tả mới : ");
        p.setDescription(sc.nextLine());
        p.setDayCreate(new Date());
        productService.update(p);
    }

    private static void deleteProduct(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập id sản phẩm muốn xóa : ");
        String input = sc.nextLine();
        productService.delete(input);
    }

    private static void filterProduct(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm muốn lọc : ");
        String input = sc.nextLine();
        productService.filter(input);
    }

    private static void sortProduct(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn muốn sắp xếp theo ? ");
        System.out.println("1. Theo tên .");
        System.out.println("2. Theo giá tiền .");
        System.out.print("Lựa chọn của bạn : ");
        int input = Integer.parseInt(sc.nextLine());
        switch (input){
            case 1:
                productService.sort(1);
                break;
            case 2:
                productService.sort(2);
                break;
            default :
                System.out.println("Lựa chọn không hợp lệ !");
        }
    }
}


