
public class RandomCharacters {
    public static void main(String[] args) {
        generateRandomCharacters();
    }

    public static void generateRandomCharacters() {
        // Random Uppercase letters
        for (int i = 1; i <= 200; i++) {
            System.out.print((char)('A' + Math.random() * 26) + (i % 10 == 0 ? "\n" : " "));
        }
        // Random single digits
        for (int i = 1; i <= 200; i++) {
            System.out.print((int)(Math.random() * 10) + (i % 10 == 0 ? "\n" : " "));
        }
    }
}
