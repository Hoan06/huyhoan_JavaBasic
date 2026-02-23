package business;

import model.ISkill;

public class Mage extends GameCharacter implements ISkill {
    private int mana;

    public Mage(String name, int hp, int attackPower, int mana) {
        super(name, hp, attackPower);
        this.mana = mana;
    }

    public Mage(int mana) {
        this.mana = mana;
    }

    @Override
    public void attack(GameCharacter target) {
        if (mana >= 5){
            target.takeDamage(super.getAttackPower());
            mana -= 5;
        } else {
            target.takeDamage(super.getAttackPower()/2);
        }
        System.out.printf("Pháp sư %s tấn công %s !. \n" , super.getName() , target.getName());
        System.out.printf("=> %s mất %d máu . Hp còn : %d !. \n" , target.getName() , super.getAttackPower() , target.getHp());
    }

    @Override
    public void useUltimate(GameCharacter target) {
        if (this.mana < 50 ){
            System.out.println("Không đủ mana để sử dụng chiêu cuối !.");
        } else {
            this.mana -= 50;
            target.takeDamage(super.getAttackPower()*3);
            System.out.printf("Pháp sư %s sử dụng chiêu cuối vào %s !.\n", super.getName(), target.getName());
            System.out.printf("=> %s mất %d máu !.\n", target.getName(), super.getAttackPower() * 3);
        }
    }

    @Override
    public void displayInfo() {
        System.out.printf("|Name : %-10s | HP : %-5d | Mana : %-5d |\n",super.getName(),super.getHp(),this.mana);
    }
}
