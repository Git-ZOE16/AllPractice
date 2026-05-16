import java.util.Scanner;

public class RegularPolygon{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of sides and side length: ");
        int n = input.nextInt();
        
        double s = input.nextDouble();
        System.out.println("Area: " + area(n, s));
    }

    public static double area(int n, double side) {
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }
}
