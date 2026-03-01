package map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Map lưu cặp key , value (key - khóa là 1 SET<key>)
        // Map tương tự Set

        // 4 lớp triển khai
        // HashMap
        // LinkedHashMap
        // TreeMap
        // EnumMap

        Map<String , String> dictionary = new HashMap<>();

        // Các phương thức làm việc
        dictionary.put("Apple" , "Dũng 89");
        dictionary.put("Apple" , "Trang 36"); // Nó sẽ k hiểu là thêm mà thành sửa

        dictionary.remove("Apple");

        String value = dictionary.get("Apple");
        dictionary.containsKey("Apple");
        dictionary.containsValue("Trang 36");

        // Duyệt
        // 3 cách duyệt
        // theo key
        for (String key : dictionary.keySet()){
            // làm việc với key
        }
        // theo value
        for (String values : dictionary.values()){
            // làm việc với value
        }
        // theo cả hai
        for (Map.Entry<String , String> entry : dictionary.entrySet()){
            // làm việc
            String key = entry.getKey();
            String values = entry.getValue();
        }

    }
}
