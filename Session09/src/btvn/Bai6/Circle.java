package btvn.Bai6;

public class Circle extends Shape{
    private double r;

    public Circle() {
    }

    public Circle(double c, double s, double r) {
        super(c, s);
        this.r = r;
    }

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }

    @Override
    public void calculatePerimeter(){
        setC(2*Math.PI*r);
    }

    @Override
    public void calculateArea(){
        setS(Math.PI * r * r);
    }
}
