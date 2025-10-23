
import java.util.Scanner;
public class Week3HWQ1_Chang {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);

		        // 1) Prompt for inputs
		        System.out.print("Enter the amount borrowed (loan amount in dollars): ");
		        double loanAmount = input.nextDouble();

		        System.out.print("Enter the yearly interest rate (as a decimal, e.g., 0.067 for 6.7%): ");
		        double yearlyRate = input.nextDouble();

		        System.out.print("Enter the number of years for the loan: ");
		        int numberOfYears = input.nextInt();

		        // 2) Calculate monthly payment
		        double monthlyRate = yearlyRate / 12;   // convert yearly decimal rate to monthly
		        int numberOfPayments = numberOfYears * 12;

		        double monthlyPayment = loanAmount * (monthlyRate) /
		                (1 - (1 / Math.pow(1 + monthlyRate, numberOfPayments)));

		        // 3) Calculate total payment
		        double totalPayment = monthlyPayment * numberOfPayments;

		        // 4) Calculate total interest
		        double totalInterest = totalPayment - loanAmount;

		        // 5) Display results (two decimal places)
		        System.out.printf("\n--- Loan Repayment Details ---\n");
		        System.out.printf("Annual Interest Rate: %.2f%%\n", yearlyRate * 100);
		        System.out.printf("Monthly Payment: $%.2f\n", monthlyPayment);
		        System.out.printf("Total Payment: $%.2f\n", totalPayment);
		        System.out.printf("Total Interest: $%.2f\n", totalInterest);

		        input.close();
		    
	
	}

}
