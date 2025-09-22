import java.util.Scanner;

public class InterestRates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter balance: ");
        double balance = input.nextDouble();

        System.out.print("Enter annual percentage interest rate (e.g., 3.5 for 3.5%): ");
        double annualInterestRate = input.nextDouble();

        double interest = balance * (annualInterestRate / 1200);

        System.out.printf("The interest for the next month is %.2f%n", interest);
    }
}