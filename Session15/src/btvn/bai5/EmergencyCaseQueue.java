package btvn.bai5;

import java.util.LinkedList;
import java.util.Queue;

public class EmergencyCaseQueue {

    private Queue<EmergencyCase> cases =
            new LinkedList<>();

    public void addCase(EmergencyCase c) {
        cases.offer(c);
        System.out.println("Đã tiếp nhận ca cấp cứu!");
    }

    public EmergencyCase getNextCase() {
        if (cases.isEmpty()) {
            System.out.println("Không còn ca nào!");
            return null;
        }
        return cases.poll();
    }
}