package btvn;

import java.util.HashSet;
import java.util.Set;

public class Bai3 {
    public static void main(String[] args) {
        Set<String> drug = new HashSet<>();
        drug.add("Aspirin");
        drug.add("Caffeine");
        drug.add("Paracetamol");

        Set<String> allergy = new HashSet<>();
        allergy.add("Penicillin");
        allergy.add("Aspirin");

        Set<String> warning = new HashSet<>(drug);
        warning.retainAll(allergy);

        Set<String> safe = new HashSet<>(drug);
        safe.removeAll(allergy);

        System.out.println("Cảnh báo dị ứng: " + warning);
        System.out.println("Thành phần an toàn: " + safe);
    }
}
