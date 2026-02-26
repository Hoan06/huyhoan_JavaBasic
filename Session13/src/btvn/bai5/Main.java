package btvn.bai5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Patient> patients = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("""
                    ======= QUẢN LÝ BỆNH NHÂN =======
                    1. Tiếp nhận bệnh nhân
                    2. Cập nhật chẩn đoán
                    3. Xuất viện
                    4. Sắp xếp danh sách
                    5. Hiển thị danh sách
                    0. Thoát
                    """);

            System.out.print("Nhập lựa chọn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Nhập ID: ");
                    String id = sc.nextLine();

                    System.out.print("Nhập họ tên: ");
                    String name = sc.nextLine();

                    System.out.print("Nhập tuổi: ");
                    int age = Integer.parseInt(sc.nextLine());

                    System.out.print("Nhập chẩn đoán: ");
                    String diagnosis = sc.nextLine();

                    Patient patient = new Patient(id, name, age, diagnosis);
                    addPatient(patient);
                    break;

                case 2:
                    System.out.print("Nhập ID cần cập nhật: ");
                    String updateId = sc.nextLine();

                    System.out.print("Nhập chẩn đoán mới: ");
                    String newDiagnosis = sc.nextLine();

                    updateDiagnosis(updateId, newDiagnosis);
                    break;

                case 3:
                    System.out.print("Nhập ID cần xuất viện: ");
                    String removeId = sc.nextLine();

                    removePatient(removeId);
                    break;

                case 4:
                    sortPatient();
                    break;

                case 5:
                    displayPatients();
                    break;

                case 0:
                    System.out.println("Thoát chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
                    break;
            }

        } while (choice != 0);
    }


    public static void addPatient(Patient patient){
        for (Patient i : patients){
            if (i.getId().equals(patient.getId())){
                System.out.println("ID đã tồn tại !.");
                return;
            }
        }
        patients.add(patient);
        System.out.println("Tiếp nhận bệnh nhân thành công !.");
    }

    public static void updateDiagnosis(String id , String newDiagnosis){
        for (int i = 0 ; i < patients.size() ; i++){
            if (patients.get(i).getId().equals(id)){
                patients.get(i).setDiagnosis(newDiagnosis);
                System.out.println("Cập nhật chẩn đoán thành công !.");
                return;
            }
        }
        System.out.println("Không tìm thấy bệnh nhân !.");
    }


    public static void removePatient(String id){
        for (int i = 0 ; i < patients.size() ; i++){
            if (patients.get(i).getId().equals(id)){
                patients.remove(i);
                System.out.println("Bệnh nhân xuất viện thành công .");
                return;
            }
        }
        System.out.println("Không tìm thấy bệnh nhân !.");
    }

    public static void sortPatient(){
        patients.sort( Comparator.comparing(Patient::getAge).reversed()
                .thenComparing(Patient::getFullName));
        System.out.println("Danh sách bệnh nhân đã được sắp xếp !.");
    }

    public static void displayPatients() {
        if (patients.isEmpty()) {
            System.out.println("Danh sách trống.");
            return;
        }
        patients.forEach(System.out::println);
    }
}
