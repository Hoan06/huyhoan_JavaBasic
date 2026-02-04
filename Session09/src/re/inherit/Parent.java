package re.inherit;

public class Parent {
    private int a;
    private String b;

    public Parent(String b, int a) {
        this.b = b;
        this.a = a;
    }

    public Parent() {

    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void say(){
        System.out.println("Hello");
    }
}
