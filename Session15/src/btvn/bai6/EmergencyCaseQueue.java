package btvn.bai6;

import java.util.LinkedList;
import java.util.Queue;

public class EmergencyCaseQueue {

    private Queue<EmergencyCase> cases =
            new LinkedList<>();

    public void addCase(EmergencyCase c) {
        cases.offer(c);
        System.out.println("Đã thêm bệnh nhân vào hàng chờ!");
    }

    public EmergencyCase getNextCase() {
        if (cases.isEmpty()) {
            System.out.println("Không còn ca cấp cứu!");
            return null;
        }
        return cases.poll();
    }
}