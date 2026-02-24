import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử trong mảng : ");
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        for (int i = 0 ; i < n ; i++){
            System.out.printf("Nhập phần tử thứ %d : " , i + 1);
            arr[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.println("Mảng trước sắp xếp : ");
        for (int i : arr){
            System.out.print(i);
        }

        int index = 0;
        for (int i = 0 ; i < n ; i++){
            if (arr[i] % 2 == 0){
                int num = arr[i];
                for(int j = i ; j > index ; j--){
                    arr[j] = arr[j-1];
                }
                arr[index] = num;
                index++;
            }
        }

        System.out.println("");
        System.out.println("Mảng sau sắp xếp : ");
        for (int i : arr){
            System.out.print(i);
        }

    }
}
