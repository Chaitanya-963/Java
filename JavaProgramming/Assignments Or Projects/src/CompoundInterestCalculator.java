import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {

        // Compound interest calculator

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principal:");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %):");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the # of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the # years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.printf("The Amount after %d is: ₹%.2f ", years, amount);
        scanner.close();

    }
}
