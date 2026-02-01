package btvn.Bai5;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Tên sách: " + title);
        System.out.println("Tác giả: " + author);
        System.out.println("Giá: " + price);
    }

    public static void main(String[] args) {
        Book book = new Book("Lập trình Java", "Nguyễn Văn A", 120000);
        book.displayInfo();
    }
}
