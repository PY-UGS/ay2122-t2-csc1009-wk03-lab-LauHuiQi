import java.util.Date;
import java.lang.Math;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    Date currentDate = new Date();
    public Loan() {
        this.annualInterestRate = 2.5;
        this.numberOfYears = 1;
        this.loanAmount = 1000;
        this.loanDate = currentDate;
    }

    public Loan(double aIR, int nOY, double lA) {
        this.annualInterestRate = aIR;
        this.numberOfYears = nOY;
        this.loanAmount = lA;
        this.loanDate = currentDate;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public void setAnnualInterestRate(double aIR) {
        this.annualInterestRate = aIR;
    }

    public int getNumberOfYears() {
        return this.numberOfYears;
    }

    public void setNumberOfYears(int nOY) {
        this.numberOfYears = nOY;
    }

    public double getLoanAmount() {
        return this.loanAmount;
    }

    public void setLoanAmount(double lA) {
        this.loanAmount = lA;
    }

    public Date getLoanDate() {
        return this.loanDate;
    }

    public double getMonthlyPayment() {
        double monthlyInterest = this.annualInterestRate / 12;
        return (this.loanAmount * (monthlyInterest))
                / (1 - (1 / Math.pow(1 + monthlyInterest, this.numberOfYears * 12)));
    }

    public double getTotalPaymnet() {
        return getMonthlyPayment() * this.numberOfYears * 12;
    }
}
