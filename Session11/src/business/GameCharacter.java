package business;

public abstract class GameCharacter {
    private String name;
    private int hp;
    private int attackPower;
    public static int count;

    public GameCharacter(String name, int hp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
        count++;
    }

    public GameCharacter() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        GameCharacter.count = count;
    }

    public abstract void attack(GameCharacter target);

    public void takeDamage(int damage){
        this.hp -= damage;
        if (this.hp <= 0){
            System.out.println(this.name + " đã bị hạ gục!");
        }
    }

    public void displayInfo(){
        System.out.printf("| Name : %s | Hp : %d | \n" , name , hp);
    }
}
