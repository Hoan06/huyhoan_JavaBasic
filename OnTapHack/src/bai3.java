import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử trong mảng : ");
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        for (int i = 0 ; i < n ; i++){
            System.out.printf("Nhập phần tử thứ %d : " , i + 1);
            arr[i] = Integer.parseInt(sc.nextLine());
        }

        int k;
        System.out.print("Nhập số muốn xóa : ");
        k = Integer.parseInt(sc.nextLine());
        System.out.print("Mảng trước xóa : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0 ; i < n ; i++){
            if (arr[i] == k){
                for (int j = i ; j < n - 1 ; j++){
                    arr[j] = arr[j+1];
                }
                n--;
                i--;
            }
        }
        System.out.println("");
        System.out.print("Mảng sau xóa : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
