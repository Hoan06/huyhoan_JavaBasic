package set;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Set kế thừa collection
        // set không lưu trữ phần tử trùng lặp

        // 4 lớp triển khai :
        // HashSet (Không xác định thứ tự lưu)
        // LinkedHashSet (Vị trí chèn)
        // TreeSet (Cây nhị phân , được sắp xếp)
        // EnumSet (Nhẹ và nhanh)

//        Set<Integer> set1 = new HashSet<>();
//        Set<Integer> set1 = new LinkedHashSet<>();
//        Set<Integer> set1 = new TreeSet<>(Comparator.reverseOrder());
        Set<Sex> set1 = EnumSet.of(Sex.MALE,Sex.FEMALE,Sex.OTHER);
        System.out.println(set1);

        // Các phương thức làm việc
        TreeSet<Integer> set2 = new TreeSet<>();

        // Duyệt
        // Duyệt bằng Iterator
        Iterator<Integer> iterator = set2.iterator();
        while (iterator.hasNext()){
            Integer value = iterator.next();
        }
    }
}
