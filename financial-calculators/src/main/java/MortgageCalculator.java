import java.util.Scanner;
import java.text.DecimalFormat;

public class MortgageCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat moneyFormat = new DecimalFormat("#,##0.00");

        System.out.println("===== Mortgage Calculator =====");

        System.out.print("Enter the loan amount (principal): $");
        String principalInput = scanner.nextLine().replaceAll("[,\\s]", "");
        double principal = Double.parseDouble(principalInput);

        System.out.print("Enter the annual interest rate (e.g., 7.625): ");
        String rateInput = scanner.nextLine();
        double annualInterestRate = Double.parseDouble(rateInput) / 100;

        System.out.print("Enter the loan term (in years): ");
        String termInput = scanner.nextLine();
        int loanTermYears = Integer.parseInt(termInput);

        // Calculations
        int totalPayments = loanTermYears * 12;
        double monthlyInterestRate = annualInterestRate / 12;

        double monthlyPayment = principal * (
                (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, totalPayments)) /
                        (Math.pow(1 + monthlyInterestRate, totalPayments) - 1)
        );

        double totalPayment = monthlyPayment * totalPayments;
        double totalInterest = totalPayment - principal;

        // Output
        System.out.println("\n===== Results =====");
        System.out.println("Monthly Payment: $" + moneyFormat.format(monthlyPayment));
        System.out.println("Total Interest Paid: $" + moneyFormat.format(totalInterest));
        System.out.println("===============================");

        scanner.close();
    }
}
