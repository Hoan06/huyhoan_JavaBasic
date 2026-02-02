package bai6;

public class User {
    public final int id;
    public String username;
    public String password;

    // Constructor
    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{id=" + id +
                ", username='" + username + '\'' +
                ", password='******'}";
    }
}
