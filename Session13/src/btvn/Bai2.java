package btvn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bai2 {
    public static void main(String[] args) {
        List<String> medicine = new ArrayList<>(Arrays.asList("Paracetamol", "Ibuprofen", "Panadol", "Paracetamol", "Aspirin", "Ibuprofen"));
        for (int i = 0 ; i < medicine.size() ; i++){
            for (int j = i + 1 ; j < medicine.size() ; j++){
                if (medicine.get(i).equals(medicine.get(j))){
                    medicine.remove(j);
                    j--;
                }
            }
        }
        medicine.sort(String::compareTo);
        System.out.println(medicine);
    }
}
