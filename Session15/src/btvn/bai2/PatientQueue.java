package btvn.bai2;

import java.util.LinkedList;
import java.util.Queue;

public class PatientQueue {

    private Queue<Patient> queue = new LinkedList<>();

    // enqueue
    public void addPatient(Patient p) {
        queue.offer(p);
        System.out.println("Đã thêm bệnh nhân!");
    }

    // dequeue
    public Patient callNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("Không còn bệnh nhân!");
            return null;
        }
        return queue.poll();
    }

    public Patient peekNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("Hàng đợi trống!");
            return null;
        }
        return queue.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("Danh sách bệnh nhân trống!");
            return;
        }

        System.out.println("=== DANH SÁCH CHỜ KHÁM ===");
        for (Patient p : queue) {
            System.out.println(p);
        }
    }
}