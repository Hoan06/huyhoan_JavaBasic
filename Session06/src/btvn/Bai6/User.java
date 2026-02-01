package btvn.Bai6;

public class User {
    private String id;
    private String username;
    private String password;
    private String email;

    public User(String id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        setPassword(password);
        setEmail(email);
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        if(password == null || password.trim().isEmpty()){
            System.out.println("Password không được để trống!");
            return;
        }
        this.password = password;
    }

    public void setEmail(String email) {
        if(email.matches("^[A-Za-z0-9+_-]+@(.+)$")){
            this.email = email;
            return;
        }
       System.out.println("Email không hợp lệ!");
    }

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Username: " + username);
        System.out.println("Email: " + email);
        System.out.println("Password: ******");
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        System.out.println("User hợp lệ:");
        User u1 = new User("U01", "hoan", "123456", "hoan@gmail.com");
        u1.displayInfo();

        System.out.println("User password rỗng:");
        User u2 = new User("U02", "test", "", "test@gmail.com");
        u2.displayInfo();

        System.out.println("User email sai:");
        User u3 = new User("U03", "abc", "abcdef", "abcgmail.com");
        u3.displayInfo();

        System.out.println("User sửa email sai:");
        u1.setEmail("sai-email");
    }
}
