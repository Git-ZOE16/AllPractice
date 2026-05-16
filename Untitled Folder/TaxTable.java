public class TaxTable {
    public static void main(String[] args) {
        System.out.println("Income    Status 0  Status 1");
        for (double i = 50000; i <= 70000; i += 100) {
        
System.out.printf("%.0f      %.2f      %.2f\n", i, computeTax(0, i), computeTax(1, i));
        }
    }

    public static double computeTax(int status, double taxableIncome) {
        
        if (status == 0) return taxableIncome * 0.15;
        return taxableIncome * 0.10;
    }
}

