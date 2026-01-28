import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        String[] transactions = {  "BK001-20/01", "BK005-21/01", "BK099-22/01"};

        String today = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        long startSB = System.nanoTime();

        StringBuilder sb = new StringBuilder();
        sb.append("--- BÁO CÁO MƯỢN SÁCH ---\n");
        sb.append("Ngày tạo: ").append(today).append("\n");
        for (String i : transactions){
            sb.append("Giao dịch : ").append(i).append("\n");
        }

        long endSB = System.nanoTime();

        long startST = System.nanoTime();

        String result = "--- BÁO CÁO MƯỢN SÁCH ---\n";
        result += "Ngày tạo : " + today + "\n";
        for (String i : transactions){
            result += "Giao dịch : " + i + "\n";
        }

        long endST = System.nanoTime();

        System.out.println(sb.toString());

        System.out.println("Số thời gian thực thi đối với StringBuilder: "
                + (endSB - startSB));
        System.out.println("Số thời gian thực thi đối với String: "
                + (endST - startST));


    }
}
