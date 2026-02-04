package btvn.Bai6;

import btth.Circle;
import btth.Rectangle;
import btth.Shape;
import btth.Triangle;

public class Main {
    public static void main(String[] args) {
        btth.Shape[] arr = new btth.Shape[10];
        arr[0] = new btth.Rectangle(4,5);
        arr[1] = new btth.Circle(3);
        arr[2] = new Triangle(3,4,5);
        arr[3] = new Circle(4);
        arr[4] = new Triangle(3,5,5);
        arr[5] = new Rectangle(6,7);

        for (int i = 0 ; i < 5 ; i++){
            Shape s = arr[i];
            String type = s.getClass().getSimpleName();
            System.out.printf("Hình %d : %s(%s - chu vi : %.2f - diện tích : %.2f)\n",(i+1) , type , s.toString() , s.getC() , s.getS());

        }
    }
}
