
public class CelsiusToFahrenheit { 
    public static void main(String[] args) {
        
        System.out.println("0C to F: " + celsiusToFahrenheit(0)); 
        System.out.println("100C to F: " + celsiusToFahrenheit(100)); 
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32; 
    }
}
