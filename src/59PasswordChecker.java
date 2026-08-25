import java.sql.SQLOutput;
import java.util.Scanner;

class PasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to set your password\n");
        String password;
        do {
            System.out.println("please enter your password: ");
             password = input.next();
        } while (!isVaildPassWord(password));
        System.out.println("thanks for entering the valid password");
    }
public static boolean isVaildPassWord(String password){
        return password.length() > 6;

}
}
