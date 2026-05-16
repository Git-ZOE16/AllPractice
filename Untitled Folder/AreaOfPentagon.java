
import java.util.Scanner;

public class AreaOfPentagon{
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter side: ");
        double side = input.nextDouble();
        
        System.out.println("Area: " + area(side));
    }

    public static double area(double side) {
        return (5 * side * side) / (4 * Math.tan(Math.PI / 5));
    }
}


















