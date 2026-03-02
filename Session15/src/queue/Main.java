package queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("89 hưng yên");
        queue.offer("36 thanh hóa");
        queue.remove();
        queue.poll(); // lấy và xóa
        queue.peek();
        queue.element(); // giống peek lấy nhưng k xóa

        // Hàng đợi 2 đầu
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("dsd");
        linkedList.getFirst();

        linkedList.addLast("fsfs");
        linkedList.getLast();
    }
}
