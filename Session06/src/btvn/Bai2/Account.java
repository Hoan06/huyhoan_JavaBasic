package btvn.Bai2;
import java.util.Scanner;

public class Account {
    private String username;
    private String password;
    private String email;

    public Account(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public void changePassword(String newPassword){
        this.password = newPassword;
        System.out.println("Thay đổi mật khẩu thành công.");
    }

    public void displayAccount(){
        System.out.println("Thông tin tài khoản : ");
        System.out.println("Username : " + username);
        System.out.println("Password : " + "*****");
        System.out.println("Email : " + email);
    }

    public String getPassword() {
        return password;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account ac1 = new Account("hoanhuy" , "huyhoan" , "hoanhuy@gmail.com");

        System.out.println("Mật khẩu trước khi đổi : " + ac1.getPassword());

        String newPassword;
        System.out.print("Nhập mật khẩu mới cho tài khoản : \n");
        ac1.displayAccount();
        System.out.print("Mật khẩu mới : ");
        newPassword = sc.nextLine();
        ac1.changePassword(newPassword);


        System.out.println("Mật khẩu sau khi đổi : " + ac1.getPassword());


    }
}
