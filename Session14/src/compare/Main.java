package compare;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Lưu ý : để sắp xếp thì các phần tử phải so sánh được.

        // 2 interface : Comparable và Comparator
        List<Student> names = Arrays.asList(
                new Student(1, "Trang", 8.5),
                new Student(2, "An", 9.0),
                new Student(3, "Bình", 7.2),
                new Student(4, "Hà",    9.0)
        );
        System.out.println(names);
//        Collections.sort(names , new StudentComparator());
        Collections.sort(names );
        System.out.println(names);

        // Nâng cao : Java 8 : lambda ( arrow function )
        Collections.sort(names , (o1,o2) -> o1.getName().compareTo(o2.getName()));
        Collections.sort(names , (o1,o2) -> Double.compare(o1.getScore(),o2.getScore()));
        System.out.println(names);
    }
}
