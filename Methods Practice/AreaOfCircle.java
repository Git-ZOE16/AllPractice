public class AreaOfCircle{
    public static void main(String[] args) {
        System.out.println("Area (r=1): " + circleArea(1.0));
    }

    public static double circleArea(double radius) {
        return Math.PI * radius * radius; 
    }
}
