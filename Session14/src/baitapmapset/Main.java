package baitapmapset;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> lists = new ArrayList<>();
        Random rad = new Random();
        for (int i = 0 ; i < 100 ; i++){
            int number = rad.nextInt(1000);
            lists.add(number);
        }

        System.out.println(lists);

        Set<Integer> filterLists = new HashSet<>(lists);
//        for (int i = 0 ; i < lists.size() ; i++){
//            filterLists.add(lists.get(i));
//        }

        System.out.println(filterLists);

//        for (int i = 0 ; i < lists.size() ; i++){
//            int count = 0;
//            for (int j = 0 ; j < lists.size() ; j++){
//                if(lists.get(i) == lists.get(j)){
//                    count++;
//                }
//            }
//            System.out.println(lists.get(i) + " xuất hiện " + count + " lần.");
//        }

        Map<Integer , Integer> map = new HashMap<>();
        for (Integer num : lists){
            if (map.containsKey(num)){
                map.put(num , map.get(num) + 1);
            } else {
                map.put(num , 1);
            }
        }

        for (Map.Entry<Integer , Integer> entry : map.entrySet()){
            System.out.printf("%d số lần xuất hiện %d .\n" , entry.getKey(), entry.getValue());
        }
    }
}
