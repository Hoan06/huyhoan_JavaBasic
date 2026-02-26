package cau2;

import java.util.Arrays;
import java.util.Scanner;

public class Phan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử trong mảng : ");
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        for (int i = 0 ; i < n ; i++){
            System.out.printf("Nhập phần tử thứ %d : " , i+1);
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.print("Nhập số bước dịch : ");
        int k = Integer.parseInt(sc.nextLine());

        if ( k > n){
            System.out.println("Số bước dịch lớn hơn kích thước mảng !");
            return;
        }

       for (int i = 0 ; i < k ; i++){
           int temp = arr[arr.length - 1];
           for (int m = arr.length - 1 ; m > 0 ; m--){
               arr[m] = arr[m-1];
           }
           arr[0] = temp;
       }

        System.out.println(Arrays.toString(arr));
    }
}
