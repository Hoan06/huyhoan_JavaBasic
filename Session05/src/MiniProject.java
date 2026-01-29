import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MiniProject {
    public static void printIndex(int[] arr,int target){
        StringBuilder result = new StringBuilder();
        boolean flag = false;
        for (int i = 0 ; i<arr.length ; i++){
            for (int j = 0 ; j< arr.length ; j++){
                if(arr[i] + arr[j] == target){
                    flag = true;
                    result.append("[");
                    result.append(i);
                    result.append(",");
                    result.append(j);
                    result.append("]");
                }
            }
        }
        if (flag == false ){
            System.out.println("Không tìm thấy cặp nào!!!");
        } else {
            System.out.println("Các cặp chỉ số bằng target : ");
            System.out.println(result);
        }

    }

    public static void moveEnd(int[] arr){
        System.out.println("Mảng trước khi dồn : " + Arrays.toString(arr));
        int index =0;
        for (int i = 0 ; i<arr.length ; i++){
            if (arr[i] != 0){
                arr[index++] = arr[i];
            }
        }

        while (index < arr.length){
            arr[index++] = 0;
        }
        System.out.println("Mảng sau khi dồn : " + Arrays.toString(arr));
    }

    public static boolean checkText(String text){
        String regex = "[^a-zA-Z]";
        text = text.replaceAll(regex , "");
        text = text.toLowerCase();
        text = text.trim();

        boolean check = true;
        int left = 0;
        int right = text.length() - 1;

        while (left < right){
            if (text.charAt(left) != text.charAt(right)){
                check = false;
                break;
            }
            left++;
            right--;
        }

        return check;
    }

    public static void reverseText(String input){
        String[] arr = input.split("\\s+");

        int left = 0;
        int right = arr.length - 1;

        while (left < right){
            String temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println("Chuỗi sau khi đảo ngược : " + String.join(" ", arr));
    }

    public static boolean checkNumber(int n){
        Set<Integer> seen = new HashSet<>();

        while(n != 1 && !seen.contains(n)){
            seen.add(n);
            int sum =0;

            while(n>0){
                int digit = n%10;
                sum += digit*digit;
                n /= 10;
            }
            n = sum;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("""
                1. Tìm cặp số có tổng bằng K .
                2. Dồn số 0 về cuối mảng .
                3. Kiểm tra chuỗi đối xứng .
                4. Đảo ngược từ trong câu .
                5. Kiểm tra số hạnh phúc .
                0. Nhập 0 để thoát menu .
                """);
            System.out.print("Nhập lựa chọn : ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice){
                case 1:
                    int n;
                    System.out.print("Mời bạn nhập số lượng phần tử trong mảng : ");
                    n = Integer.parseInt(sc.nextLine());
                    int[] arr = new int[n];
                    for (int i = 0 ; i < arr.length ; i++){
                        System.out.printf("Nhập giá trị cho phần tử thứ %d : ",i+1);
                        arr[i] = Integer.parseInt(sc.nextLine());
                    }
                    System.out.print("Nhập target : ");
                    int target = Integer.parseInt(sc.nextLine());
                    printIndex(arr,target);
                    break;
                case 2:
                    int s;
                    System.out.print("Mời bạn nhập số lượng phần tử trong mảng : ");
                    s = Integer.parseInt(sc.nextLine());
                    int[] arr2 = new int[s];
                    for (int i = 0 ; i < arr2.length ; i++){
                        System.out.printf("Nhập giá trị cho phần tử thứ %d : ",i+1);
                        arr2[i] = Integer.parseInt(sc.nextLine());
                    }
                    moveEnd(arr2);
                    break;
                case 3:
                    String text;
                    System.out.print("Nhập vào 1 chuỗi bất kì : ");
                    text = sc.nextLine();

                    if (checkText(text)){
                        System.out.println("Đây là chuỗi đối xứng .");
                    } else {
                        System.out.println("Đây không phải chuỗi đối xứng .");
                    }
                    break;
                case 4:
                    String input;
                    System.out.print("Nhập vào 1 chuỗi bất kì : ");
                    input = sc.nextLine();
                    reverseText(input);
                    break;
                case 5:
                    int num;
                    System.out.print("Nhập vào số bất kì kiểm tra : ");
                    num = Integer.parseInt(sc.nextLine());
                    if(checkNumber(num)){
                        System.out.println("Đây là số hạnh phúc.");
                    } else {
                        System.out.println("Đây không phải là số hạnh phúc.");
                    }
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ !!!");
            }
        } while(choice != 0);
    }
}