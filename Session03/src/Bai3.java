import java.util.Scanner;

public class Bai3 {
    public static void maxQuantityOfBooks(String[] names, int[] quantities){
        int max = quantities[0];
        int index = 0;
        for (int i = 0 ; i < quantities.length ; i++){
            if(quantities[i] > max){
                max = quantities[i];
                index = i;
            }
        }
        for (int i = 0 ; i < names.length ; i++){
            if(i == index){
                System.out.printf("Sách có số lượng nhiều nhất (%d) : %s.\n" , max , names[index]);
            }
        }
    }

    public static void minQuantityOfBooks(String[] names, int[] quantities){
        int min = quantities[0];
        int index = 0;
        for (int i = 0 ; i < quantities.length ; i++){
            if(quantities[i] < min){
                min = quantities[i];
                index = i;
            }
        }
        for (int i = 0 ; i < names.length ; i++){
            if(i == index){
                System.out.printf("Sách có số lượng ít nhất (%d) : %s.\n" , min , names[index]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        int[] quantities = new int[5];

        for (int i = 0 ; i < names.length ; i++){
            System.out.printf("Nhập tên cho phần tử thứ %d trong mảng names : " , i+1);
            names[i] = sc.nextLine();
        }
        for (int i = 0 ; i < quantities.length ; i++){
            System.out.printf("Nhập số lượng cho phần tử thứ %d trong mảng quantities : " , i+1);
            quantities[i] = Integer.parseInt(sc.nextLine());
        }
        maxQuantityOfBooks(names,quantities);
        minQuantityOfBooks(names,quantities);

    }
}
