package ra;

import java.io.Serializable;

public class Bird implements IMoveable , Serializable , Cloneable {
    // Bắt buộc : phải triển khai tất cả phương thức trừu tượng trong interface

    @Override
    public void move() {
        System.out.println("Bird is moving");
    }

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }

}
