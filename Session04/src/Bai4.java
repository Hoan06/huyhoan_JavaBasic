import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai4 {
    public static void main(String[] args) {
        String cardID = "TV202312345";

        Pattern pattern = Pattern.compile("^TV(2020|2021|2022|2023|2024|2025|2026)\\d{5}$");
        Matcher matcher = pattern.matcher(cardID);

        if (matcher.matches()){
            System.out.println("Mã thẻ hợp lệ!");
        } else {
            System.out.println("Mã thẻ không hợp lệ!!!");
        }
    }
}
