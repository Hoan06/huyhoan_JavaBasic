package btth;

public class Triangle extends Shape {
    private double a,b,c;

    public Triangle() {

    }

    public Triangle(double c, double s, double a, double b, double c1) {
        super(c, s);
        this.a = a;
        this.b = b;
        this.c = c1;
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    @Override
    public void calculatePerimeter() {
        setC(a + b + c);
    }

    @Override
    public void calculateArea() {
        double p = c / 2;
        setS(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }

}
