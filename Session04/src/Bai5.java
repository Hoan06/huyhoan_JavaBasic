import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai5 {
    public static void main(String[] args) {
        String text = "2024-05-20 | User: NguyenVanA | Action: Borrow | BookID: BK12345";

        Pattern pattern = Pattern.compile("^(\\d{4}-\\d{2}-\\d{2})");
        Matcher matcher = pattern.matcher(text);

        String year;
        if (matcher.find()){
             year = matcher.group(1);
        } else {
             year = "Không tìm thấy !";
        }

        Pattern pattern1 = Pattern.compile("User:\\s*([^|,\n]+)");
        Matcher matcher1 = pattern1.matcher(text);

        String name;
        if (matcher1.find()){
             name = matcher1.group(1);
        } else {
             name = "Không tìm thấy !";
        }

        Pattern pattern2 = Pattern.compile("Action:\\s*([^|,\n]+)");
        Matcher matcher2 = pattern2.matcher(text);

        String action;
        if (matcher2.find()){
             action = matcher2.group(1);
        } else {
             action = "Không tìm thấy !";
        }

        Pattern pattern3 = Pattern.compile("BookID:\\s*([^|,\n]+)");
        Matcher matcher3 = pattern3.matcher(text);

        String bookID;
        if (matcher3.find()){
             bookID = matcher3.group(1);
        } else {
             bookID = "Không tìm thấy !";
        }

        System.out.printf("Ngày : %s\n" , year);
        System.out.printf("Người dùng : %s\n" , name);
        System.out.printf("Hành động : %s\n" , action);
        System.out.printf("Mã sách : %s" , bookID);
    }
}
