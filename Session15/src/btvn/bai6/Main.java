package btvn.bai6;

public class Main {

    public static void main(String[] args) {

        Patient p1 = new Patient("P01","An",25);

        EmergencyCase emergencyCase =
                new EmergencyCase(p1);

        emergencyCase.addStep(
                new TreatmentStep("Tiếp nhận","10:00"));

        emergencyCase.addStep(
                new TreatmentStep("Chẩn đoán","10:10"));

        emergencyCase.addStep(
                new TreatmentStep("Điều trị","10:20"));

        emergencyCase.displaySteps();

        System.out.println("\nUndo bước:");
        emergencyCase.undoStep();

        emergencyCase.displaySteps();

        EmergencyCaseQueue queue =
                new EmergencyCaseQueue();

        queue.addCase(emergencyCase);

        System.out.println("\nCa tiếp theo:");
        System.out.println(
                queue.getNextCase().getPatient()
        );
    }
}
