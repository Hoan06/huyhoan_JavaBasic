package ra;

public class Category {
    private int id;
    private String name;
    private String description;

    public Category(int id, String description, String name) {
        this.id = id;
        this.description = description;
        this.name = name;
    }

    public Category() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayData(){
        System.out.printf("| ID : %d | Name : %s | Description : %s |", this.id , this.name , this.description);
    }
}
