//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        String book1 = "Java Basic";
        String book2 = "Python Intro";
        System.out.printf("Trước khi thay đổi : Book1 = %s , Book2 = %s\n" , book1,book2);
        String temp = book1;
        book1 = book2;
        book2 = temp;
        System.out.printf("Sau khi thay đổi : Book1 = %s , Book2 = %s",book1,book2);
        // book1, book2, temp là biến tham chiếu nằm trên STACK
        // Giá trị của chúng là địa chỉ trỏ tới đối tượng String trong HEAP

        // Ban đầu:
        // book1 -> "Java Basic"   (Heap)
        // book2 -> "Python Intro" (Heap)

        // Khi gán: temp = book1
        // temp trỏ tới cùng đối tượng String "Java Basic" trong Heap
        // Không tạo String mới

        // Khi gán: book1 = book2
        // book1 đổi địa chỉ, trỏ sang "Python Intro" trong Heap

        // Khi gán: book2 = temp
        // book2 trỏ lại "Java Basic"

        // Các đối tượng String trong Heap không đổi
        // Chỉ có các biến tham chiếu trên Stack thay đổi địa chỉ trỏ
    }
}