package cisc191.sdmesa.edu;

import java.util.Locale;

/**
 * Lead Author(s):TianLin Zhao
 * 
 * Responsibilities of class:
 * Custom exception thrown when a BankAccount withdrawal request
 * is larger than the current balance.
 */
public class InsufficientFundsException extends Exception
{
	private static final long serialVersionUID = 1L;
	private double amount;
	private double balance;

	public InsufficientFundsException(double amount, double balance)
	{
		this.amount = amount;
		this.balance = balance;
	}

	@Override
	public String getMessage()
	{
		return String.format(Locale.US,
				"Withdrawing amount: $%.2f that is larger than balance: $%.2f is not allowed",
				amount, balance);
	}
}
