import java.util.Scanner;

public class bai1 {

    public static void main(String[] args) {
        int count1 = 0;
        int count2 = 0;
        char[] vowels = new char[100];
        char[] consonant = new char[100];
        char[] arrCheck = {'u' , 'e' , 'o' , 'a' , 'i'};
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi hỗn hợp bất kì : ");
        String strInput = sc.nextLine();
        strInput = strInput.toLowerCase();
        char[] str = strInput.toCharArray();
        for (int i = 0 ; i < str.length ; i++){
            if (!Character.isLetter(str[i])){
                continue;
            }
            boolean check = false;
            for (int j = 0 ; j < arrCheck.length ; j++){
                if (str[i] == arrCheck[j]){
                    check = true;
                    break;
                }
            }
            if (check){
                vowels[count1++] = str[i];
            }else {
                consonant[count2++] = str[i];
            }
        }
        System.out.print("Nguyên âm : ");
        for(int i = 0 ; i < count1 ; i++){
            System.out.print(vowels[i]);
        }
        System.out.println("");
        System.out.print("Phụ âm : ");
        for(int i = 0 ; i < count2 ; i++){
            System.out.print(consonant[i]);
        }
    }
}
