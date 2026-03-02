package btth.bussiness;

import btth.model.Product;

import java.util.*;

public class ProductSevice implements IProductService{
    private static final List<Product> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    static {
        list.add(new Product("P001" , "iphone 14 promax 36gb" , 500 , 99 , "kdskds" ,new Date()));
        list.add(new Product("P002" , "iphone 14 pro" , 650 , 9 , "kdskds" ,new Date()));
        list.add(new Product("P003" , "iphone 14" , 120 , 18 , "kdskds" ,new Date()));
    }

    @Override
    public List<Product> findAll() {
        return list;
    }

    @Override
    public void add(Product p) {
        list.add(p);
        System.out.println("Thêm sản phẩm thành công !");
    }

    @Override
    public void update(Product p) {
        boolean flag = true;
        for (int i = 0 ; i < list.size() ; i++){
            if (list.get(i).getId().equals(p.getId())){
                list.set(i , p);
                flag = false;
            }
        }
        if(flag){
            System.out.println("Không tìm thấy sản phẩm muốn cập nhật !");
        } else {
            System.out.println("Cập nhật sản phẩm thành công !");
        }
    }

    @Override
    public void delete(String id) {
        boolean flag = true;
        for (int i = 0 ; i < list.size() ; i++){
            if (list.get(i).getId().equals(id)){
                list.remove(i);
                flag = false;
            }
        }
        if (flag){
            System.out.println("Không tìm thấy sản phẩm muốn xóa !");
        } else {
            System.out.println("Xóa thành công sản phẩm .");
        }
    }

    @Override
    public void filter(String name) {
        boolean flag = true;
        for (int i = 0 ; i < list.size() ; i++){
            if (list.get(i).getName().contains(name)){
                System.out.println(list.get(i).toString());
                flag = false;
            }
        }
        if (flag){
            System.out.println("Không tìm thấy sản phẩm muốn lọc !");
        }
    }

    @Override
    public void sort(int choice) {
        if (choice == 1){
            Collections.sort(list , new ProductComparatorName());
            System.out.println("Sắp xếp sản phẩm theo tên thành công .");
        } else {
            Collections.sort(list , new ProductComparatorPrice());
            System.out.println("Sắp xếp sản phẩm theo giá tiền thành công .");
        }
    }
}
