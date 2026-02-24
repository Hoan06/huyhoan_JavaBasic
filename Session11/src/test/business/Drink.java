package test.business;

public abstract class Drink {
    private int id;
    private String name;
    private double price;

    public Drink(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Drink() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double calculatePrice();

    public void displayInfo(){
        System.out.printf("| Mã %d | Tên : %s | Giá : %b |.\n", this.id , this.name , this.price);
    }
}
