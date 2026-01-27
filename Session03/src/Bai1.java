import java.util.Scanner;

 class Bai1 {
     public static int[] addBookToLibraries(int n , int[] arr){
         Scanner sc = new Scanner(System.in);
         for (int i = 0 ; i < n ; i++){
             System.out.printf("Nhập giá trị cho phần tử thứ %d : " , i);
             arr[i] = sc.nextInt();
         }
         return arr;
     }

     public static void  displayLibraries(int[] arr){
         Scanner sc = new Scanner(System.in);
         for (int i = 0 ; i < arr.length ; i++){
             System.out.printf("%d" , arr[i]);
             if (arr[i] != arr[arr.length - 1]) {
                 System.out.printf(",   ");
             }
         }
     }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhập vào số n : ");
        n = sc.nextInt();
        int[] arr = new int[n];
        addBookToLibraries(n,arr);
        displayLibraries(arr);
    }
}