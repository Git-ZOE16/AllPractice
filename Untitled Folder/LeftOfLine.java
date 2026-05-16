
import java.util.Scanner;

public class LeftOfLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x0 y0 x1 y1 x2 y2: ");
        double x0 = input.nextDouble(), y0 = input.nextDouble();
        double x1 = input.nextDouble(), y1 = input.nextDouble();
        double x2 = input.nextDouble(), y2 = input.nextDouble();
        
        if (leftOfTheLine(x0, y0, x1, y1, x2, y2)) System.out.println("P2 is on left");
        else System.out.println("P2 is not on left");
    }

    public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2) {
        
        return (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) > 0;
    }
}


