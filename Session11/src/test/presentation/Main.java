package test.presentation;

import test.business.Coffee;
import test.business.Drink;
import test.business.FruitJuice;
import test.model.IMixable;

public class Main {
    public static void main(String[] args) {
        Coffee test1 = new Coffee(1 , "Bạc sỉu" , 30000 , true);
        FruitJuice test2 = new FruitJuice(2 , "Nước cam" , 40000 , 10);
        Drink[] drinks = new Drink[3];
        drinks[0] = test1;
        drinks[1] = test2;
        drinks[2] = null;

        for (int i = 0 ; i < drinks.length ; i++){
            if(drinks[i] == null){
                System.out.printf("Phần tử thứ %d là null !." , i);
            } else {
                drinks[i].displayInfo();
                System.out.printf("===> Thành tiền : %.2f .\n" , drinks[i].calculatePrice());
                if(drinks[i] instanceof IMixable mixable){
                    mixable.mix();
                }
            }
        }
    }
}
