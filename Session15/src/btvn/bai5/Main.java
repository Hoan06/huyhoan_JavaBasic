package btvn.bai5;

import btvn.bai2.Patient;

public class Main {

    public static void main(String[] args) {

        Patient p1 = new Patient("P01","An",25);

        EmergencyCase ec = new EmergencyCase(p1);

        ec.addStep(new TreatmentStep(
                "Tiếp nhận bệnh nhân","10:00"));

        ec.addStep(new TreatmentStep(
                "Chẩn đoán","10:10"));

        ec.addStep(new TreatmentStep(
                "Điều trị","10:20"));

        ec.displaySteps();

        System.out.println("\nUndo:");
        ec.undoStep();

        ec.displaySteps();

        EmergencyCaseQueue queue =
                new EmergencyCaseQueue();

        queue.addCase(ec);

        System.out.println("\nCa đang xử lý:");
        System.out.println(
                queue.getNextCase().getPatient()
        );
    }
}
