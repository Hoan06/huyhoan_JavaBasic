package test.presentation;

import test.business.ProductRepository;
import test.model.ElectronicProduct;
import test.model.FoodProduct;
import test.model.Product;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ProductRepository productRepository = new ProductRepository();

        ElectronicProduct test1 = new ElectronicProduct("P01" , "Đồ Điện" , 120000 , 12 );
        ElectronicProduct test2 = new ElectronicProduct("P02" , "Đồ Nhựa" , 10000 , 12 );

        FoodProduct test3 = new FoodProduct("P03" , "Nem chua" , 5000 , 10);
        FoodProduct test4 = new FoodProduct("P04" , "Nem rán" , 1000 , 5);

        // test thêm
        productRepository.add(test1);
        productRepository.add(test2);
        productRepository.add(test3);
        productRepository.add(test4);
        productRepository.add(null);

        // test hiển thị
        for (int i = 0 ; i < productRepository.findAll().size() ; i++){
            if (productRepository.findAll().get(i) instanceof ElectronicProduct){
                ((ElectronicProduct) productRepository.findAll().get(i)).displayInfo();
                System.out.println("Thành tiền : " + ((ElectronicProduct) productRepository.findAll().get(i)).calculateFinalPrice());
            } else {
                ((FoodProduct) productRepository.findAll().get(i)).displayInfo();
                System.out.println("Thành tiền : " + ((FoodProduct) productRepository.findAll().get(i)).calculateFinalPrice());
            }
        }

        // test tìm
        productRepository.findById("sđs");
        Product p = productRepository.findById("P03");
        if (p != null){
            p.displayInfo();
        }

        //  sắp xếp
        Collections.sort(
                productRepository.findAll(),
                (o1, o2) -> Float.compare(
                        (float) o1.calculateFinalPrice(),
                        (float) o2.calculateFinalPrice()
                ));
        System.out.println("\n===== DANH SÁCH SAU KHI SẮP XẾP =====");

        for (Product product : productRepository.findAll()) {
            product.displayInfo();
            System.out.println("Thành tiền: " + product.calculateFinalPrice());
        }
        // thống kê
        int electronicCount = 0;
        int foodCount = 0;

        for (Object product : productRepository.findAll()) {
            if (product instanceof ElectronicProduct) {
                electronicCount++;
            } else if (product instanceof FoodProduct) {
                foodCount++;
            }
        }

        System.out.println("\n===== THỐNG KÊ =====");
        System.out.println("Sản phẩm điện tử: " + electronicCount);
        System.out.println("Sản phẩm thực phẩm: " + foodCount);
        System.out.println("Tổng sản phẩm: " + (electronicCount + foodCount));
    }
}
