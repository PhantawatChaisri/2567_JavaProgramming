import java.util.*;

public class IncomeTaxCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        final double TAX_RATE_ABOVE_20K = 0.1;
        final double TAX_RATE_ABOVE_40K = 0.2;
        final double TAX_RATE_ABOVE_60K = 0.3;

        int taxableIncome;
        double Tax_20k = 0, Tax_40k = 0, Tax_60k = 0, total_Income_Tax;

        System.out.print("Enter the taxable income: $");
        taxableIncome = input.nextInt();

        if (taxableIncome <= 20000) {
            total_Income_Tax = 0; 
        } else if (taxableIncome <= 40000) {
            Tax_20k = (taxableIncome - 20000) * TAX_RATE_ABOVE_20K;
            total_Income_Tax = Tax_20k;
        } else if (taxableIncome <= 60000) {
            Tax_20k = 20000 * TAX_RATE_ABOVE_20K; 
            Tax_40k = (taxableIncome - 40000) * TAX_RATE_ABOVE_40K;
            total_Income_Tax = Tax_20k + Tax_40k;
        } else {
            Tax_20k = 20000 * TAX_RATE_ABOVE_20K; 
            Tax_40k = 20000 * TAX_RATE_ABOVE_40K; 
            Tax_60k = (taxableIncome - 60000) * TAX_RATE_ABOVE_60K; 
            total_Income_Tax = Tax_20k + Tax_40k + Tax_60k;
        }
        System.out.printf("The income tax payable is: $%.2f baht.", total_Income_Tax);

        input.close();

	}

}
