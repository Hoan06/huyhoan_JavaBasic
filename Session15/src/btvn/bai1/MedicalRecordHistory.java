package btvn.bai1;

import java.util.Stack;

public class MedicalRecordHistory {

    private Stack<EditAction> history = new Stack<>();

    public void addEdit(EditAction action) {
        history.push(action);
        System.out.println("Đã thêm chỉnh sửa!");
    }

    public EditAction undoEdit() {
        if (history.isEmpty()) {
            System.out.println("Không có chỉnh sửa để Undo!");
            return null;
        }
        return history.pop();
    }

    public EditAction getLatestEdit() {
        if (history.isEmpty()) {
            System.out.println("Không có lịch sử!");
            return null;
        }
        return history.peek();
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }

    public void displayHistory() {
        if (history.isEmpty()) {
            System.out.println("Danh sách chỉnh sửa trống!");
            return;
        }

        System.out.println("=== LỊCH SỬ CHỈNH SỬA ===");
        for (EditAction action : history) {
            System.out.println(action);
        }
    }
}
