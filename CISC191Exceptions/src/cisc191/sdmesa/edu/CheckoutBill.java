package cisc191.sdmesa.edu;

/**
 * Lead Author(s):TianLin Zhao
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * Version/date: 5/18/2026
 * 
 * Responsibilities of class:
 * Represents a checkout bill with a bill amount and tip percent,
 * and calculates the total bill including tip
 */
/**
 */
public class CheckoutBill
{
	// A bill has an amount
	private double amount = 0;
	// A bill has a tip percent
	private double tipPercent = -1;
 
	/**
	 * Set the amount from which to calculate the total bill
	 * 
	 * @param billAmount amount on the bill
	 * @throws IllegalArgumentException is thrown if amount is not positive
	 */
	public void setBillAmount(double billAmount) throws IllegalArgumentException
	{
		if (billAmount <= 0)
		{
			throw new IllegalArgumentException("Bill amount must be positive, got: $" + billAmount);
		}
		amount = billAmount;
	}
 
	/**
	 * Set the tip percent from which to calculate the total bill
	 * 
	 * @param percent tip given
	 * @throws IllegalArgumentException is thrown if percent is negative
	 */
	public void setTipPercent(double percent) throws IllegalArgumentException
	{
		if (percent < 0)
		{
			throw new IllegalArgumentException("Tip percent cannot be negative, got: " + percent);
		}
		tipPercent = percent;
	}
 
	/**
	 * Calculate the total bill from the bill amount and tip percentage
	 * @return total bill amount
	 * @throws IllegalStateException if bill amount is not positive or tip percent is negative
	 */
	public double calculateTotalBill() throws IllegalStateException
	{
		if (amount <= 0)
		{
			throw new IllegalStateException("Bill amount has not been set");
		}
		if (tipPercent < 0)
		{
			throw new IllegalStateException("Tip percent has not been set");
		}
		return amount * (1 + tipPercent / 100);
	}
 
	public static void main(String[] args)
	{
		try
		{
			CheckoutBill bill = new CheckoutBill();
			bill.setTipPercent(-1);
			bill.calculateTotalBill();
		}
		catch (Exception e)
		{
			System.out.println("Error: " + e.getMessage());
		}
	}
 
}
 