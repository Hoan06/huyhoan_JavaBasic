package btth.bussiness;

import btth.model.Product;

import java.util.ArrayList;
import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void add(Product p);
    void update(Product p);
    void delete(String id);
    void filter(String name);
    void sort(int choice);
}
