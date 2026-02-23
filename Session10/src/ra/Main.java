package ra;

public class Main {
    public static void main(String[] args) {
        IMoveable canhCut = new Bird();
        canhCut.fly();
        canhCut.move();
        canhCut.printColor("Đỏ");
        IMoveable.sum(1,2);

        UserAbstract cus = new Customer();

        // Lớp nặc danh: lớp không có tên
        IMoveable im = new IMoveable() {
            @Override
            public void move() {

            }

            @Override
            public void fly() {

            }
        };

        IcColorable ic = (String str) -> {};
    }
}
