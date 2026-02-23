package ra;

public abstract class UserAbstract {
    // Lớp trừu tượng : có phương thức trừu tượng
    // Nó là lớp nên có đầy đủ các thành phần của lớp
    // Nó có phương thức trừu tượng
    private String name;
    private String userName;
    private String password;

    public UserAbstract(String name, String userName, String password) {
        this.name = name;
        this.userName = userName;
        this.password = password;
    }

    public UserAbstract() {
    }

    public abstract void printInfo();
}
