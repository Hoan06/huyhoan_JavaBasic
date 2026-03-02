package btth.bussiness;

import btth.model.Product;

import java.util.Comparator;

public class ProductComparatorPrice implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return Float.compare(o1.getPrice(),o2.getPrice());
    }
}
