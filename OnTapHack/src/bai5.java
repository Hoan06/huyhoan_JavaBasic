import java.util.Scanner;

public class bai5 {
    public static boolean isExist(int[] arr, int size, int value){
        for (int i = 0 ; i < size ; i++){
            if (arr[i] == value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử trong mảng A : ");
        int n = Integer.parseInt(sc.nextLine());
        int[] arr1 = new int[n];
        for (int i = 0 ; i < n ; i++){
            System.out.printf("Nhập phần tử thứ %d : " , i + 1);
            arr1[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.print("Nhập số phần tử trong mảng B : ");
        int k = Integer.parseInt(sc.nextLine());
        int[] arr2 = new int[k];
        for (int i = 0 ; i < k ; i++){
            System.out.printf("Nhập phần tử thứ %d : " , i + 1);
            arr2[i] = Integer.parseInt(sc.nextLine());
        }

        int size = Math.max(n, k);
        int count = 0;
        int[] arrCheck = new int[size];

        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < k ; j++){
                if (arr1[i] == arr2[j]){
                    if (isExist(arrCheck , size , arr1[i])){
                        break;
                    } else {
                        arrCheck[count++] = arr1[i];
                        System.out.print(arr1[i] + " ");
                    }
                }
            }
        }


    }
}
