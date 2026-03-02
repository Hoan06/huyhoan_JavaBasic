package btth.presentation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        run();
    }

    private static void run(){
        Scanner sc = new Scanner(System.in);
        ProductView.showProductMenu(sc);
        sc.close();
    }
}
