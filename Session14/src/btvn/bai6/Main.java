package btvn.bai6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Patient> patients = Arrays.asList(
                new Patient("Lan", 25, "Tim mạch"),
                new Patient("Hùng", 40, "Nội tiết"),
                new Patient("Mai", 30, "Tim mạch"),
                new Patient("An", 50, "Hô hấp")
        );

        Map<String, List<Patient>> hospital = new HashMap<>();

        for (Patient p : patients) {

            if (!hospital.containsKey(p.department)) {
                hospital.put(p.department, new ArrayList<>());
            }

            hospital.get(p.department).add(p);
        }

        System.out.println("Danh sách bệnh nhân theo khoa:");
        for (Map.Entry<String, List<Patient>> entry : hospital.entrySet()) {
            System.out.println(
                    "Khoa " + entry.getKey()
                            + " -> " + entry.getValue()
            );
        }

        String searchDept = "Tim mạch";

        System.out.println("\nDanh sách khoa " + searchDept + ":");
        if (hospital.containsKey(searchDept)) {
            System.out.println(hospital.get(searchDept));
        } else {
            System.out.println("Không có khoa này.");
        }

        String maxDept = "";
        int maxPatients = 0;

        for (Map.Entry<String, List<Patient>> entry : hospital.entrySet()) {

            int size = entry.getValue().size();

            if (size > maxPatients) {
                maxPatients = size;
                maxDept = entry.getKey();
            }
        }

        System.out.println("\nKhoa "
                + maxDept
                + " đang đông nhất ("
                + maxPatients
                + " bệnh nhân)");
    }
}

