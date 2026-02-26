package btvn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bai1 {
    public static void main(String[] args) {
        List<Double> temperature = new ArrayList<>(Arrays.asList(36.5, 40.2, 37.0, 12.5, 39.8, 99.9, 36.8));
        for (int i = 0; i < temperature.size(); i++) {
            if (temperature.get(i) < 34.0 || temperature.get(i) > 42.0) {
                temperature.remove(i);
            }
        }
        Double result = 0.0;
        int k = 0;
        for (Double i : temperature) {
            result += i;
            k++;
        }
        System.out.println(temperature);
        System.out.println("Nhiệt độ trung bình các bệnh nhân còn lại là : " + result/k);
    }
}
