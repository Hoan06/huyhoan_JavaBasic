package btvn.bai6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1500));
        products.add(new Product("Phone", 800));
        products.add(new Product("Tablet", 1200));


        Collections.sort(products, new Comparator<Product>() {

            private double exchangeRate = 1.0;

            @Override
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.getPrice() * exchangeRate,
                        p2.getPrice() * exchangeRate);
            }
        });

        System.out.println("Sắp xếp theo giá tăng dần:");
        products.forEach(System.out::println);



        products.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));

        System.out.println("\nSắp xếp theo tên A-Z:");
        products.forEach(System.out::println);
    }
}
