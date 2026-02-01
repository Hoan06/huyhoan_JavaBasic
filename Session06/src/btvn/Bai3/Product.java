package btvn.Bai3;

public class Product {
    private String productId;
    private String productName;
    private double price;

    public Product(String productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0){
            System.out.println("Giá tiền không được nhỏ hơn 0.");
            return;
        }
        this.price = price;
    }

    public void displayProduct(){
        System.out.println("Thông tin sản phẩm : ");
        System.out.println("Mã : " + productId);
        System.out.println("Tên sản phẩm : " + productName);
        System.out.println("Giá tiền : " + price);
    }

    public static void main(String[] args) {
        Product pr1 = new Product("PR01" , "Kẹo chupachup" , 5.50);
        pr1.displayProduct();
        pr1.setPrice(-1.2);
    }
}
