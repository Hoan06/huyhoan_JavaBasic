package bai6;

import java.util.ArrayList;

public class UserManager {

    public static ArrayList<User> users = new ArrayList<>();

    public static void addUser(User u) {
        users.add(u);
    }

    public static boolean checkLogin(String username, String password) {
        for (User u : users) {
            if (u.username.equals(username) && u.password.equals(password)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        User u1 = new User(1, "admin", "123456");
        User u2 = new User(2, "user1", "password");
        User u3 = new User(3, "guest", "guest123");

        UserManager.addUser(u1);
        UserManager.addUser(u2);
        UserManager.addUser(u3);

        System.out.println("Danh sách user:");
        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u3);

        System.out.println("\nKiểm tra đăng nhập:");

        System.out.println("admin / 123456: "
                + UserManager.checkLogin("admin", "123456"));

        System.out.println("user1 / sai_mat_khau: "
                + UserManager.checkLogin("user1", "abc"));
    }
}
