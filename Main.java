
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Scanner;

public class Main {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String arg[]) throws ParseException {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter annual interest rate: ");
        double annualInterestRate = input.nextDouble();
        System.out.println("Enter number of years: ");
        int noOfYears = input.nextInt();
        System.out.println("Enter loan amount: ");
        double loanAmount = input.nextDouble();

        Loan loan = new Loan(annualInterestRate / 100, noOfYears, loanAmount);

        df.setRoundingMode(RoundingMode.UP);

        System.out.println("The loan was created on " + loan.getLoanDate());
        System.out.println("The monthly payment is " + df.format(loan.getMonthlyPayment()));
        System.out.println("The total payment is " + df.format(loan.getTotalPaymnet()));

    }
}
