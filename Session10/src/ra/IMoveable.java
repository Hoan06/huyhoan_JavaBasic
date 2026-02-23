package ra;

public interface IMoveable {
    // Phương thức trừu tượng
    public abstract void move();
    void fly();
    // Hằng số
    public static final String ABC = "ABC";
    int X = 0;

    // Từ phiên bản java 8 trở đi , bổ sung thêm các phương thức :
    default void printColor(String color){
        System.out.println(color);
    }

    static void sum(int a , int b){
        System.out.println(a+b);
    }

    private void clone(String str){
        System.out.println(str);
    }
}
