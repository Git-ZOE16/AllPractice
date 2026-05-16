
import java.util.Scanner;
public class ValidTriangleArea{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter 3 sides: ");
        double side1 = input.nextDouble(), side2 = input.nextDouble(), side3 = input.nextDouble();
        
        if (isValid(side1, side2, side3)) System.out.println("Area: " + area(side1, side2, side3));
        else System.out.println("Invalid Triangle");
    }

    public static boolean isValid(double side1, double side2, double side3) {
        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }

    public static double area(double side1, double side2, double side3) {
        double side = (side1 + side2 + side3) / 2;
        return Math.sqrt(side * (side - side1) * (side - side2) * (side - side3)); 
    }
}
