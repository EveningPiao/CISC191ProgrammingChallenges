package cisc191.sdmesa.edu;

/**
 * Lead Author(s):TianLin Zhao
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * Version/date: 4/20/2026
 * 
 * Responsibilities of class:
 * A a Bicycle is a Cycle with two wheels
 */

public class Bicycle extends Cycle
{
	/**
	 * Constructor: creates a Bicycle with the given make
	 * @param newMake
	 */
	public Bicycle(String newMake)
	{
		super(newMake);
	}
 
	/**
	 * A Bicycle has two wheels
	 * @return 2
	 */
	@Override
	public int getNumberOfWheels()
	{
		return 2;
	}
}
