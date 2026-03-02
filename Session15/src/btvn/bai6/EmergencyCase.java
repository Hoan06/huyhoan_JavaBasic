package btvn.bai6;

import btvn.bai2.Patient;

import java.util.Stack;

public class EmergencyCase {

    private Patient patient;
    private Stack<TreatmentStep> steps = new Stack<>();

    public EmergencyCase(Patient patient) {
        this.patient = patient;
    }

    public EmergencyCase(btvn.bai6.Patient p1) {
    }

    public void addStep(TreatmentStep step) {
        steps.push(step);
    }

    public TreatmentStep undoStep() {
        if (steps.isEmpty()) {
            System.out.println("Không có bước để undo!");
            return null;
        }
        return steps.pop();
    }

    public void displaySteps() {
        if (steps.isEmpty()) {
            System.out.println("Chưa có bước xử lý!");
            return;
        }

        System.out.println("Các bước xử lý của "
                + patient.getName());

        for (TreatmentStep step : steps) {
            System.out.println(step);
        }
    }

    public Patient getPatient() {
        return patient;
    }
}