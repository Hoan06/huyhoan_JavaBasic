package btvn.bai3;

import java.util.Stack;

public class MedicationProcessChecker {

    private Stack<String> stack = new Stack<>();

    public boolean checkProcess(String[] actions) {

        for (String action : actions) {

            if (action.equals("PUSH")) {
                stack.push(action);
            }

            else if (action.equals("POP")) {

                if (stack.isEmpty()) {
                    System.out.println("Lỗi: POP khi chưa phát thuốc!");
                    return false;
                }

                stack.pop();
            }

            else {
                System.out.println("Thao tác không hợp lệ!");
                return false;
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("Lỗi: Chưa hoàn tất phát thuốc!");
            return false;
        }

        return true;
    }

    public void reset() {
        stack.clear();
    }
}