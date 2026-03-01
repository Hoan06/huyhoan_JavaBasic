package btvn;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Map<String, String> medicineMap = new HashMap<>();

        medicineMap.put("T01", "Paracetamol");
        medicineMap.put("T02", "Ibuprofen");
        medicineMap.put("T03", "Amoxicillin");
        medicineMap.put("T04", "Vitamin C");
        medicineMap.put("T05", "Aspirin");

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã thuốc: ");
        String code = sc.nextLine();

        if (medicineMap.containsKey(code)) {
            System.out.println("Tên thuốc: " + medicineMap.get(code));
        } else {
            System.out.println("Thuốc không tồn tại.");
        }

        sc.close();
    }
}
