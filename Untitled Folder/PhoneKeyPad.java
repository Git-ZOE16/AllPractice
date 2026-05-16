import java.util.Scanner;

public class PhoneKeyPad{
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        
        String s = input.nextLine().toUpperCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch)) System.out.print(getNumber(ch));
            else System.out.print(ch);
        }
    }

    public static int getNumber(char uppercaseLetter) {
        
        if (uppercaseLetter >= 'W') return 9;
        if (uppercaseLetter >= 'T') return 8;
        if (uppercaseLetter >= 'P') return 7;
        if (uppercaseLetter >= 'M') return 6;
        if (uppercaseLetter >= 'J') return 5;
        if (uppercaseLetter >= 'G') return 4;
        if (uppercaseLetter >= 'D') return 3;
        return 2;
    }
}
