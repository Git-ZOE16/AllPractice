
import java.util.Scanner;
public class FormatNumber{

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     
        System.out.print("Enter number and width: ");
        int number = input.nextInt(), width = input.nextInt();
        
        System.out.println(format(number, width));
    }

    public static String format(int number, int width) {
        String s = number + "";
        
        while (s.length() < width) s = "0" + s; 
        return s;
    }
}

