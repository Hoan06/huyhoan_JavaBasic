package btvn;

import java.util.LinkedList;

public class Bai4 {
    private LinkedList<String> names = new LinkedList<>();
    public void patientCheckIn(String name){
        names.addLast(name);
        System.out.println("Thêm bệnh nhân thành công .");
    }

    public void emergencyCheckIn(String name){
        names.addFirst(name);
        System.out.println("Thêm bệnh nhân thành công .");
    }

    public void treatPatient(){
        names.removeFirst();
        System.out.println("Bệnh nhân đầu tiên vào phòng khám .");
        System.out.println("Xóa bệnh nhân đầu tiên thành công .");
    }

    public void displayQueue() {
        System.out.println("Danh sách chờ: " + names);
    }

    public static void main(String[] args) {
        Bai4 er = new Bai4();

        er.patientCheckIn("A");
        er.patientCheckIn("B");

        er.emergencyCheckIn("C");

        er.displayQueue();

        er.treatPatient();
        er.treatPatient();
        er.treatPatient();
        er.treatPatient();
    }
}
