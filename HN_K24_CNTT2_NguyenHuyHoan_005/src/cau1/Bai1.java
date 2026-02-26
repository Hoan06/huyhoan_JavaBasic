package cau1;

import java.util.Scanner;

public class Bai1 {
    public static String check(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder checkLength = new StringBuilder();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            count++;

            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                checkLength.append(str.charAt(i));
                checkLength.append(count);
                count = 0;
            }
        }

        return checkLength.length() < str.length() ? checkLength.toString() : str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi bất kì : ");
        String input = sc.nextLine();
        String result = check(input);
        if (result.length() > input.length()) {
            System.out.println("Chuỗi gốc: " + input);
            System.out.println("Chuỗi nén: " + result);
        }
    }
}
