import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi văn bản bất kì : ");
        String strInput = sc.nextLine();
        String str = strInput.toLowerCase();

        char[] arr = str.toCharArray();
        int count = 0;
        char c = ' ';

        for (int i = 0 ; i < arr.length ; i++){
            int countChar = 0;
            for (int j = 0 ; j < arr.length ; j++){
                if (arr[i] == arr[j]){
                    countChar++;
                }
            }
            if (countChar > count){
                c = arr[i];
                count = countChar;
            }
        }

        System.out.println(c + " xuất hiện " + count + " lần.");
    }
}
