import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter string: ");
        String s = input.nextLine();
        
        System.out.println("Letter count: " + countLetters(s));
    }

    public static int countLetters(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
        
            if (Character.isLetter(s.charAt(i))) count++; 
        }
        return count;
    }
}
