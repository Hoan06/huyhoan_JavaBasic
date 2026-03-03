package test.model;

public class FoodProduct extends Product {
    private int discountPercent;

    public FoodProduct(String id, String name, float price, int discountPercent) {
        super(id, name, price);
        this.discountPercent = discountPercent;
    }

    public FoodProduct(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public FoodProduct(String id, String name, float price) {
        super(id, name, price);
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    @Override
    public double calculateFinalPrice() {
        return super.getPrice() - (super.getPrice() * this.discountPercent/100);
    }

    @Override
    public void displayInfo(){
        System.out.printf("| Id : %s | Name : %s | Price : %.2f | Discount : %d | \n" , super.getId() , super.getName() , super.getPrice() , this.discountPercent);
    }
}
