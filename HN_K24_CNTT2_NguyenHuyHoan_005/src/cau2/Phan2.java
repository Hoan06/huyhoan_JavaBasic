package cau2;

import java.util.Scanner;

public class Phan2 {
    public static int maxCheck(int[] nums) {
        int max = nums[0];
        int currentMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);

            if (currentMax > max) {
                max = currentMax;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử trong mảng : ");
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        for (int i = 0 ; i < n ; i++){
            System.out.printf("Nhập phần tử thứ %d : " , i + 1);
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Tổng lớn nhất: " + maxCheck(arr));
    }
}

