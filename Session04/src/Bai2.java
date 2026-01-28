import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai2 {
    public static void main(String[] args) {
        String description = "Sách giáo khoa toán lớp 12, Kệ: A1-102, tình trạng mới";

        Pattern pattern = Pattern.compile("Kệ:\\s*([^,\n]+)");
        Matcher matcher = pattern.matcher(description);

        String location;
        if(matcher.find()){
            location = matcher.group(1);
        } else {
            location = "Không tồn tại";
        }

        String newDescription = description.replaceAll("Kệ" , "Vị trí lưu trữ");

        System.out.println("Vị trí tìm thấy : " + location);
        System.out.printf("%s",newDescription);
    }
}
