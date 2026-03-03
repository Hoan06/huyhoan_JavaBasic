package test.model;

public class ElectronicProduct extends Product {
    private int warrantyMonths;

    public ElectronicProduct(String id, String name, float price, int warrantyMonths) {
        super(id, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    public ElectronicProduct(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    public ElectronicProduct(String id, String name, float price) {
        super(id, name, price);
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public void setWarrantyMonths(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public double calculateFinalPrice() {
        if (this.warrantyMonths > 12){
            return super.getPrice() + 1000000;
        }
        return super.getPrice();
    }

    @Override
    public void displayInfo(){
        System.out.printf("| Id : %s | Name : %s | Price : %.2f | WarrantyMonths : %d | \n" , super.getId() , super.getName() , super.getPrice() , this.warrantyMonths);
    }


}
