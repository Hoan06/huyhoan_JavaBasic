package test.model;

public abstract class Product {
    private String id;
    private String name;
    private float price;

    public Product(String id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
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

    public abstract double calculateFinalPrice();

    public void displayInfo(){
        System.out.printf("| Id : %s | Name : %s | Price : %.2f | \n" , this.id , this.name , this.price);
    }
}
