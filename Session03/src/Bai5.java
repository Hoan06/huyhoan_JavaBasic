import java.util.Scanner;

public class Bai5 {
    public static int deleteBook(int[] arr, int n, int bookId){
        int position = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == bookId) {
                position = i;
                break;
            }
        }

        for (int i = position ; i < n - 1 ; i++){
            arr[i] = arr[i+1];
        }

        System.out.printf("Đã xóa mã sách %d.\n", bookId);
        return n-1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử trong mảng : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0 ; i < arr.length ; i++){
            System.out.printf("Nhập giá trị cho phần tử thứ %d : " , i + 1);
            arr[i] = sc.nextInt();
        }

        System.out.printf("Kho sách hiện tại (%d cuốn ) :" , n);
        System.out.print("[");
        for (int i = 0 ; i < arr.length ; i++){
            System.out.printf("%d" , arr[i]);
            if(arr[i] != arr[arr.length - 1]){
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println("");

        while (true) {
            System.out.print("Nhập mã sách cần xóa ( 0 để thoát ) : ");
            int idDelete = sc.nextInt();

            if(idDelete == 0) break;
            n = deleteBook(arr,n,idDelete);

            System.out.printf("Kho sách hiện tại (%d cuốn ) :" , n);
            System.out.print("[");
            for (int i = 0 ; i < n ; i++){
                System.out.printf("%d" , arr[i]);
                if(arr[i] != arr[n - 1]){
                    System.out.print(", ");
                }
            }
            System.out.print("]");
            System.out.println("");
        }
    }
}
