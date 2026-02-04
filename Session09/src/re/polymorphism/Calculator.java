package re.polymorphism;

public class Calculator {
    // Nạp chồng : trong 1 lớp các phương thức giống nhau về tên nhưng khác : số lượng và kiểu của tham số

    public static int sum(int a , int b){
        return a+b;
    }

    public static int sum(int a , int b , int c){
        return a+b+c;
    }

    public static int sum(int[] arr){
        int sum = 0;
        for (int value : arr){
            sum += value;
        }
        return sum;
    }
}
