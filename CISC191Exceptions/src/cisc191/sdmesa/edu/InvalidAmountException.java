package cisc191.sdmesa.edu;

import java.util.Locale;

/**
 * Lead Author(s):TianLin Zhao
 * Responsibilities of class:
 * Custom exception thrown when a negative amount is used
 * for a BankAccount deposit or withdrawal.
 */
public class InvalidAmountException extends Exception
{
	private static final long serialVersionUID = 1L;
	private double amount;

	public InvalidAmountException(double amount)
	{
		this.amount = amount;
	}

	@Override
	public String getMessage()
	{
		return String.format(Locale.US, "Negative amount: $%.2f is not allowed", amount);
	}
}
