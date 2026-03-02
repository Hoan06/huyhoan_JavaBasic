package btvn.bai4;

public class EmergencyPatient {

    private static int counter = 0;

    private String id;
    private String name;
    private int priority;
    private int order;

    public EmergencyPatient(String id, String name, int priority) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.order = counter++;
    }

    public int getPriority() {
        return priority;
    }

    public int getOrder() {
        return order;
    }

    @Override
    public String toString() {
        return id + " - " + name +
                " (priority=" + priority + ")";
    }
}