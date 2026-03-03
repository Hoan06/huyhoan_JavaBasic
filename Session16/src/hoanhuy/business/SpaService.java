package hoanhuy.business;

import hoanhuy.model.Pet;

import java.util.LinkedList;
import java.util.Queue;

public class SpaService {
    private static final Queue spaQueues = new LinkedList();

    public  void addPetSpa(Pet p){
        spaQueues.add(p);
        System.out.println("Tiếp nhận thú cưng thành công !");
    }

    public  void actionService(){
        System.out.println(spaQueues.peek() + " đang được tắm rửa/cắt tỉa .");
        spaQueues.poll();
    }

}
