package btth.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Product {
    private String id;
    private String name;
    private float price;
    private int stock;
    private String description;
    private Date dayCreate;

    public Product(String id, String name, float price, int stock, String description, Date dayCreate) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.description = description;
        this.dayCreate = dayCreate;
    }

    public Product() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDayCreate() {
        return dayCreate;
    }

    public void setDayCreate(Date dayCreate) {
        this.dayCreate = dayCreate;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return String.format("| %-4s | %-25s | %-10.2f | %-5d | %-10s | %-20s |\n",
                id,
                name,
                price,
                stock,
                description,
                sdf.format(dayCreate)
        );
    }

}
