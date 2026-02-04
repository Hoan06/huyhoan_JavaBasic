package btth;

public abstract class Shape {
    private double c;
    private double s;

    public Shape(double c, double s) {
        this.c = c;
        this.s = s;
    }

    public Shape(){}

    public void calculatePerimeter(){};

    public void calculateArea(){};

    public void setC(double c) {
        this.c = c;
    }

    public void setS(double s) {
        this.s = s;
    }

    public double getC() {
        return c;
    }

    public double getS() {
        return s;
    }
}
