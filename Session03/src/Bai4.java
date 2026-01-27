import java.util.Scanner;

public class Bai4 {
    public static void  sortBooks(int[] arr){
        for (int i = 0 ; i < arr.length - 1 ; i++){
            for (int j = 0 ; j < arr.length - i - 1 ; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void displayBooks(int[] arr){
        System.out.print("[");
        for (int i = 0 ; i < arr.length ; i++){
            System.out.printf("%d" , arr[i]);
            if(arr[i] != arr[arr.length - 1]){
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        int[] arr = {105,102,109,101,103};

        displayBooks(arr);
        System.out.println("");
        sortBooks(arr);
        displayBooks(arr);
    }
}
