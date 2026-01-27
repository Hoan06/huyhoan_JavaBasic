import java.util.Scanner;

public class Bai2 {
    public static int searchBooks(String[] arr, String search) {
        for (int i = 0; i < arr.length ; i++){
            if (arr[i].equals(search)) {
                System.out.printf("Tìm thấy tại vị trí %d .",i+1);
                return 0;
            }
        }
        System.out.println("Sách không tồn tại.");
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng : ");
        int n = Integer.parseInt(sc.nextLine());
        String[] books = new String[n];

        for(int i = 0 ; i < books.length ; i++){
            System.out.printf("Nhập phần tử thứ %d : " , i);
            books[i] = sc.nextLine();
        }

        System.out.print("Nhập tên sách muốn tìm kiếm : ");
        String nameSearch = sc.nextLine();
        searchBooks(books,nameSearch);
    }
}
