package btvn;

import java.util.ArrayList;
import java.util.List;

public class Bai3 {
    public static <T> List<T> findCommonPatients(List<T> listA , List<T> listB){
        List<T> result = new ArrayList<>();
        for (T item : listA){
            if (listB.contains(item) && !result.contains(item)){
                result.add(item);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        List<Integer> khoaNoi = List.of(101, 102, 105);
        List<Integer> khoaNgoai = List.of(102, 105, 108);

        List<Integer> commonInt = findCommonPatients(khoaNoi, khoaNgoai);
        System.out.println("Bệnh nhân chung (Integer): " + commonInt);


        List<String> bhytNoi = List.of("DN01", "DN02", "DN03");
        List<String> bhytNgoai = List.of("DN02", "DN04");

        List<String> commonString = findCommonPatients(bhytNoi, bhytNgoai);
        System.out.println("Bệnh nhân chung (String): " + commonString);
    }
}
