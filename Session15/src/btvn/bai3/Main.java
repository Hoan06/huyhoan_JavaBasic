package btvn.bai3;

public class Main {
    public static void main(String[] args) {

        MedicationProcessChecker checker =
                new MedicationProcessChecker();

        String[] actions1 =
                {"PUSH", "PUSH", "POP", "POP"};

        System.out.println(
                checker.checkProcess(actions1)
        );

        checker.reset();

        String[] actions2 =
                {"PUSH", "POP", "POP"};

        System.out.println(
                checker.checkProcess(actions2)
        );
    }
}
