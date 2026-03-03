package test.business;

import test.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepository implements IRepository<Product>{
    List<Product> listProducts = new ArrayList<>();
    Map<String , Product> listProductMaps = new HashMap<>();

    @Override
    public boolean add(Product item) {
        if (item == null){
            System.out.println("Dữ liệu trống !");
            return false;
        }
        listProducts.add(item);
        listProductMaps.put(item.getId() , item);
        return true;
    }

    @Override
    public boolean removeById(String id) {
        if (id == null){
            System.out.println("Dữ liệu trống !");
            return false;
        }
        Product p = listProductMaps.get(id);
        if (p == null){
            System.out.println("Không tìm thấy sản phẩm muốn xóa !");
            return false;
        }
        listProducts.remove(p);
        return true;
    }

    @Override
    public Product findById(String id) {
        if (id == null){
            System.out.println("Dữ liệu trống !");
            return null;
        }
        Product p = listProductMaps.get(id);
        if (p == null){
            System.out.println("Không tìm thấy sản phẩm !");
            return null;
        }
        return p;
    }

    @Override
    public List findAll() {
        return listProducts;
    }

}
