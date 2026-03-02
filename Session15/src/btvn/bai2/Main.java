package btvn.bai2;

public class Main {
    public static void main(String[] args) {

        PatientQueue pq = new PatientQueue();

        pq.addPatient(new Patient("P01", "An", 25));
        pq.addPatient(new Patient("P02", "Bình", 30));
        pq.addPatient(new Patient("P03", "Chi", 22));

        pq.displayQueue();

        System.out.println("\nBệnh nhân tiếp theo:");
        System.out.println(pq.peekNextPatient());

        System.out.println("\nGọi khám:");
        System.out.println(pq.callNextPatient());

        System.out.println("\nSau khi gọi:");
        pq.displayQueue();
    }
}