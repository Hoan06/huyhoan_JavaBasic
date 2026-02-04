package btth;

public class Main {
    public static void main(String[] args) {
        Shape[] arr = new Shape[10];
        arr[0] = new Rectangle(4,5);
        arr[1] = new Circle(3);
        arr[2] = new Triangle(3,4,5);
        arr[3] = new Circle(4);
        arr[4] = new Triangle(3,5,5);
        arr[5] = new Rectangle(6,7);

        for (int i = 0 ; i < 5 ; i++){
            Shape s = arr[i];
            String type = s.getClass().getSimpleName();
            System.out.printf("Hình %d : %s(%s - chu vi : %.2f - diện tích : %.2f)\n",(i+1) , type , s.toString() , s.getC() , s.getS());

        }

        int countRec = 0;
        int countTri = 0;
        int countCir = 0;
        for (Shape s : arr){
            if ( s instanceof Rectangle){
                countRec++;
            }
            if(s instanceof Circle){
                countCir++;
            }
            if (s instanceof Triangle){
                countTri++;
            }
        }

        System.out.printf("%s - Số lượng %d \n" , "Rectangle" , countRec);
        System.out.printf("%s - Số lượng %d \n" , "Circle" , countCir);
        System.out.printf("%s - Số lượng %d \n" , "Triangle" , countTri);
    }
}
