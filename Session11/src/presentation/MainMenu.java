package presentation;

import business.GameCharacter;
import business.Mage;
import business.Warrior;

import static business.GameCharacter.count;

public class MainMenu {

    public static void statistical(GameCharacter[] characters){
        for (int i = 0 ; i < characters.length ; i++){
            characters[i].displayInfo();
        }
    }

    public static void main(String[] args) {
        Warrior donLung = new Warrior("Dũng chuppi" , 10000 , 1000 , 2000);
        Mage tronLang = new Mage("Trang 36" , 20000 , 2000 , 3000);
        GameCharacter goblin = new GameCharacter("Thôn lành" , 5000 , 50) {
            @Override
            public void attack(GameCharacter target) {
                System.out.println("Goblin cắn trộm...");
                System.out.printf("=> %s đã bị tấn công mất 10 hp." , target.getName());
                target.takeDamage(10);
            }
        };



        GameCharacter[] characters = new GameCharacter[count];
        characters[0] = donLung;
        characters[1] = tronLang;
        characters[2] = goblin;

        System.out.println("\nThông số ban đầu : ");
        statistical(characters);

        donLung.attack(tronLang);
        tronLang.useUltimate(donLung);
        goblin.attack(donLung);

        System.out.println("\nThông số sau đấu : ");
        statistical(characters);

    }
}
