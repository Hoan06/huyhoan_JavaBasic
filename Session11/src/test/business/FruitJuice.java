package test.business;

import test.model.IMixable;

public class FruitJuice extends Drink implements IMixable {
    private int discountPercent;

    public FruitJuice(int id, String name, int price, int discountPercent) {
        super(id, name, price);
        this.discountPercent = discountPercent;
    }

    public FruitJuice(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    @Override
    public double calculatePrice() {
        return super.getPrice() - (super.getPrice() * discountPercent/100);
    }

    @Override
    public void mix() {
        System.out.println("Đang ép trái cây tươi...");
    }

    @Override
    public void displayInfo(){
        System.out.printf("| Mã %d | Tên : %s | Giá : %.2f |.\n", super.getId() , super.getName() , super.getPrice());
    }
}
