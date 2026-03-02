package btvn.bai1;

public class Main {
    public static void main(String[] args) {

        MedicalRecordHistory history = new MedicalRecordHistory();

        history.addEdit(
                new EditAction("Sửa tên bệnh nhân", "10:00")
        );

        history.addEdit(
                new EditAction("Cập nhật toa thuốc", "10:30")
        );

        history.addEdit(
                new EditAction("Thêm kết quả xét nghiệm", "11:00")
        );

        history.displayHistory();

        System.out.println("\nChỉnh sửa gần nhất:");
        System.out.println(history.getLatestEdit());

        System.out.println("\nUndo:");
        System.out.println(history.undoEdit());

        System.out.println("\nSau khi Undo:");
        history.displayHistory();
    }
}
