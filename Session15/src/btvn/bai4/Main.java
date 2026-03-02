package btvn.bai4;


public class Main {

    public static void main(String[] args) {

        EmergencyQueue eq = new EmergencyQueue();

        eq.addPatient(new EmergencyPatient("P01","An",2));
        eq.addPatient(new EmergencyPatient("P02","Bình",1));
        eq.addPatient(new EmergencyPatient("P03","Chi",2));
        eq.addPatient(new EmergencyPatient("P04","Dung",1));

        eq.displayQueue();

        System.out.println("\nGọi khám:");
        System.out.println(eq.callNextPatient());
        System.out.println(eq.callNextPatient());
    }
}