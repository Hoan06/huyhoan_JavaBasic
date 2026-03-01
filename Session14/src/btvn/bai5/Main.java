package btvn.bai5;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Comparator<Patient> emergencyComparator =
                (p1, p2) -> {

                    if (p1.severity != p2.severity) {
                        return p1.severity - p2.severity;
                    }

                    return p1.arrivalTime - p2.arrivalTime;
                };

        TreeSet<Patient> queue =
                new TreeSet<>(emergencyComparator);

        queue.add(new Patient("Bệnh nhân A", 3, 800));
        queue.add(new Patient("Bệnh nhân B", 1, 815));
        queue.add(new Patient("Bệnh nhân C", 1, 805));

        System.out.println("Thứ tự xử lý:");

        for (Patient p : queue) {
            System.out.println(p);
        }
    }
}
