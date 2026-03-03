package hoanhuy.model;

public abstract class Pet {
    private String id;
    private String name;
    private int age;
    private Double price;
    static int totalPets = 0;

    public Pet(String id, String name, int age, Double price) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.price = price;
        totalPets++;
    }

    public Pet() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public static int getTotalPets() {
        return totalPets;
    }

    public static void setTotalPets(int totalPets) {
        Pet.totalPets = totalPets;
    }

    public abstract void makeSound();

    public void displayInfo(){
        System.out.printf("| ID : %s | Name : %s | Age : %d | Price : %.2f | \n" ,
                this.id , this.name , this.age , this.price);
    }


}
