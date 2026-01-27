import java.util.Scanner;

public class demo {
    public static boolean checkFibonaci(int number) {
        if (number < 0) {
            return false;
        }
        if (number == 0 || number == 1){
            return true;
        }
        int a = 0;
        int b = 1;
        for(int i = a + b ; i <= number ; i = a + b){
            if (i == number) {
                return true;
            }
            a = b;
            b = i;
        }
        return false;
    }

    public static void checkMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] < min){
                min = arr[i];
            }
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.printf("Số lớn nhất trong mảng là : %d .\n" , max);
        System.out.printf("Số nhỏ nhất trong mảng là : %d .\n" , min);
    }

    public static void sumFactorial(int[] arr){
        int sum = 0;
        for (int i = 0 ; i < arr.length ; i++){
            int total = 1;
            for (int j = 1 ; j <= arr[i] ; j++){
                total *= j;
            }
            sum += total;
        }
        System.out.printf("Tổng giai thừa của từng phần tử trong mảng là : %d ." , sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử trong mảng : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0 ; i < arr.length ; i++){
            System.out.printf("Nhập phần tử thứ %d : " , i+1);
            arr[i] = sc.nextInt();
        }
        for (int i = 0 ; i < arr.length ; i++){
            System.out.printf("%d \n" , arr[i]);
        }

        // in ra các số nguyên tố có trong mảng
        System.out.println("Các số nguyên tố trong mảng : ");
        for (int i = 0 ; i < arr.length ; i++){
            boolean check = true;
            if (arr[i] < 2){
                check = false;
            } else {
                for (int j = 2; j < Math.sqrt(arr[i]) ; j++) {
                    if(arr[i] % j == 0) {
                        check = false;
                        break;
                    }
                }
            }
            if (check) {
                System.out.printf("%d " , arr[i]);
            }
        }

        System.out.println("");

        // Tính tổng các số fibonaci trong mảng
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if (checkFibonaci(arr[i])) {
                sum += arr[i];
            }
        }
        System.out.printf("Tổng của số fibonacci trong mảng là : %d .\n" , sum);

        checkMinMax(arr);
        sumFactorial(arr);
    }
}
