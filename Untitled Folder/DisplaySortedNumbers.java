
import java.util.Scanner;

public class EvenOrFalse{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        double number = input.nextDouble();
         
         System.out.println(isEven(number));
        
    }

    public static boolean isEven(double number) {
    if(number % 2 == 0){
    return true;
    }
     else{
     return false;
     
     }   
      
    }
}



 
//   int i=0; 
//
// while (i <= 100){
//
//System.out.println(i+=2);
//
//System.out.println("Even ");

