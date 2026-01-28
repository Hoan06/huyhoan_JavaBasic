import java.util.Scanner;

public class Bai1{
    public static String capitalize(String s){
        s = s.trim().replaceAll("\\s+"," ");
        String[] words = s.split(" ");

        for(int i = 0 ; i < words.length ; i++){
            words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1).toLowerCase();
        }

        return String.join(" ", words);
    }

    public static void main(String[] args) {
        String title = "    lập TRÌNH java      CƠ bản  ";
        String author = "nguyễn văn a";

        title = title.trim().replaceAll("\\s+" , " ").toUpperCase();
        author = capitalize(author);

        System.out.println(title + " - Tác giả: " + author);
    }
}