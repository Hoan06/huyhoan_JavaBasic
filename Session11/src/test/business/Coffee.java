package test.business;

public class Coffee extends Drink{
    private boolean hasMilk;

    public Coffee(int id, String name, int price, boolean hasMilk) {
        super(id, name, price);
        this.hasMilk = hasMilk;
    }

    public Coffee(boolean hasMilk) {
        this.hasMilk = hasMilk;
    }

    public boolean isHasMilk() {
        return hasMilk;
    }

    public void setHasMilk(boolean hasMilk) {
        this.hasMilk = hasMilk;
    }

    @Override
    public double calculatePrice() {
        if (hasMilk){
            return getPrice() + 5000;
        } else {
            return getPrice();
        }
    }

    @Override
    public void displayInfo(){
        System.out.printf("| Mã %d | Tên : %s | Giá : %.2f | %s |.\n", super.getId() , super.getName() , super.getPrice() , this.hasMilk ? "Có sữa" : "Đen đá");
    }
}
