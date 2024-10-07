package Java101;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {

        //Kullanıcı Girişi
        String username, password;
        username = "fatimesevilgen";
        password = "fatime1234";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kullanıcı adı giriniz: ");
        String userCheck = scanner.nextLine();

        System.out.print("Parola giriniz: ");
        String passCheck = scanner.nextLine();

        if (userCheck.equals(username)){
            if (passCheck.equals(password)){
                System.out.print("Giriş Başarılı!");
            }
            else{
                System.out.print("Parola Hatalı");
            }
        }
        else{
            System.out.print("Kullanıcı Adı Hatalı!");
        }
    }
}
