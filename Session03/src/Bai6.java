import java.util.Arrays;
import java.util.Scanner;

public class Bai6 {
    public static void mergeBooks(int[] a, int[] b){
        int i = 0 , j = 0;
        int[] arrayMerge = new int[a.length + b.length];
        int k = 0;

        while(i < a.length && j < b.length){
            if (a[i] < b[j]){
                if(k == 0 || arrayMerge[k-1] != a[i]){
                    arrayMerge[k++] = a[i];
                }
                i++;
            } else if (a[i] > b[j]){
                if(k == 0 || arrayMerge[k-1] != b[j]){
                    arrayMerge[k++] = b[j];
                }
                j++;
            } else {
                if(k == 0 || arrayMerge[k-1] != a[i]){
                    arrayMerge[k++] = a[i];
                }
                i++;
                j++;
            }
        }

        while(i < a.length){
            if (k == 0 || arrayMerge[k - 1] != a[i]) {
                arrayMerge[k++] = a[i];
            }
            i++;
        }

        while(j < b.length){
            if (k == 0 || arrayMerge[k - 1] != b[j]) {
                arrayMerge[k++] = b[j];
            }
            j++;
        }

        int[] arrayMergeReal = Arrays.copyOf(arrayMerge, k);

        System.out.print("[");
        for(int element: arrayMergeReal){
            if (element != arrayMergeReal[arrayMergeReal.length - 1]){
                System.out.printf("%d,  ",element);
            } else {
                System.out.printf("%d",element);
            }
        }
        System.out.print("]");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arrayFirst = {1,3,5,7,9};
        int[] arraySecond = {2,3,5,6,8,9,10};

        mergeBooks(arrayFirst,arraySecond);
    }
}
