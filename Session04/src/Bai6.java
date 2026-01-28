import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai6 {
    public static void main(String[] args) {
        String review = "Cuốn sách này rất tệ, nội dung thật là ngu ngốc và không đáng đọc.";

        String[] backlist = {"tệ","ngu ngốc"};
        String regex = String.join("|",backlist);
        Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);

        Matcher matcher = pattern.matcher(review);
        StringBuffer censored = new StringBuffer();

        while(matcher.find()){
            String word = matcher.group();
            String stars = "*".repeat(word.length());
            matcher.appendReplacement(censored,stars);
        }
        matcher.appendTail(censored);

        String finalText = censored.toString();
        if (finalText.length() > 20){
            int cutIndex = finalText.lastIndexOf(" ",200);
            finalText = finalText.substring(0,cutIndex) + "...";
        }

        System.out.println(finalText);
    }
}
