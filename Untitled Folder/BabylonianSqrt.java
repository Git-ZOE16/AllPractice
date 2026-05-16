
public class BabylonianSqrt{
    public static void main(String[] args) {
        System.out.println("Sqrt 100: " + sqrt(100)); 
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
