package re.inherit;

public class Child extends Parent{
    private double c;

    public Child(String b, int a) {
        super(b, a);
    }

    public Child() {
        super();
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public void say(){
        /*
            Điều kiện để ghi đè
            - Phải kế thừa
            - Tên phương thức và tham số phải giống ở lớp cha
            - Kiểu trả về của phương thức ở lớp con giống hoặc là super kiểu trả về của lớp cha
            - Phạm vi truy cập ở lớp con phải lớn hoặc bằng ở lớp cha
            Super
            - Phải được đặt trên đầu phần logic code

        */
        System.out.println("Hi");
    }

    public void say1(){
        super.say();
    }
}
