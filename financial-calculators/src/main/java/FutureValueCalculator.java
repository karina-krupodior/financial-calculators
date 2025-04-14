import java.util.Scanner;
import java.text.DecimalFormat;

public class FutureValueCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat moneyFormat = new DecimalFormat("#,##0.00");

        System.out.println("===== Future Value Calculator (Daily Compounding) =====");

        // Get user input
        System.out.print("Enter the deposit amount: $");
        String depositInput = scanner.nextLine().replaceAll("[,\\s]", "");
        double principal = Double.parseDouble(depositInput);

        System.out.print("Enter the annual interest rate (e.g., 1.75): ");
        double annualInterestRate = scanner.nextDouble() / 100.0; // convert to decimal

        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();

        // Constants
        int daysPerYear = 365;
        int totalDays = daysPerYear * years;

        // Daily compounding interest rate
        double dailyRate = annualInterestRate / daysPerYear;

        // Future Value Formula
        double futureValue = principal * Math.pow(1 + dailyRate, totalDays);
        double interestEarned = futureValue - principal;

        // Output the results
        System.out.println("\n===== Results =====");
        System.out.println("Future Value: $" + moneyFormat.format(futureValue));
        System.out.println("Total Interest Earned: $" + moneyFormat.format(interestEarned));
        System.out.println("===============================");

        scanner.close();
    }
}
