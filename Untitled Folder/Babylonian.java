
public class Babylonian{
    public static void main(String[] args) {
        
        long testVal = 144;
        System.out.println("Value: " + testVal);
        System.out.println("Calculated: " + sqrt(testVal));
        System.out.println("Math.sqrt: " + Math.sqrt(testVal));
    }

    public static double sqrt(long n) {
        double lastGuess = 1, nextGuess = (lastGuess + n / lastGuess) / 2;
        while (Math.abs(nextGuess - lastGuess) > 0.0001) {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2;
        }
        return nextGuess;
    }
}


