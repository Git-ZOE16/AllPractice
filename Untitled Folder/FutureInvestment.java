
import java.util.Scanner;

public class FutureInvestment{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Amount: ");
        double amt = input.nextDouble();
        System.out.print("Annual Interest Rate: ");
        double rate = input.nextDouble() / 1200; // Monthly rate
        
        System.out.println("Years  Future Value");
        for (int i = 1; i <= 30; i++) {
            System.out.printf("%-5d  %10.2f\n", i, futureInvestmentValue(amt, rate, i));
        }
    }

    public static double futureInvestmentValue(double amount, double monthlyRate, int years) {
        return amount * Math.pow(1 + monthlyRate, years * 12); 
    }
}


