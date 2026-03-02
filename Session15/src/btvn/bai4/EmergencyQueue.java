package btvn.bai4;

import java.util.PriorityQueue;

public class EmergencyQueue {

    private PriorityQueue<EmergencyPatient> queue =
            new PriorityQueue<>(
                    (p1, p2) -> {

                        if (p1.getPriority() != p2.getPriority()) {
                            return p1.getPriority()
                                    - p2.getPriority();
                        }

                        return p1.getOrder()
                                - p2.getOrder();
                    }
            );

    public void addPatient(EmergencyPatient p) {
        queue.offer(p);
        System.out.println("Đã tiếp nhận bệnh nhân!");
    }

    public EmergencyPatient callNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("Không có bệnh nhân!");
            return null;
        }
        return queue.poll();
    }

    public void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }

        System.out.println("=== DANH SÁCH CHỜ ===");
        for (EmergencyPatient p : queue) {
            System.out.println(p);
        }
    }
}