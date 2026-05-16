
import java.util.Scanner;

public class PasswordValidator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter password: ");
        String s = input.nextLine();
        if (isValidPassword(s)) System.out.println("Valid Password");
        else System.out.println("Invalid Password");
    }

    public static boolean isValidPassword(String password) {
        if (password.length() < 10) return false; 
        int digitCount = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (!Character.isLetterOrDigit(ch)) return false; 
            if (Character.isDigit(ch)) digitCount++;
        }
        return digitCount >= 3; 
    }
}


