package cisc191.sdmesa.edu;

/**
 * Lead Author(s):TianLin Zhao
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * <<add more references here>>
 *  
 * Version/date: 4/21/2026
 * 
 * Responsibilities of class:
 * A Unicycle is a Cycle with only one wheel
 */
 
public class Unicycle extends Cycle
{
	/**
	 * Constructor: creates a Unicycle with the given make
	 * @param newMake
	 */
	public Unicycle(String newMake)
	{
		super(newMake);
	}

	/**
	 * A Unicycle has one wheel
	 * @return 1
	 */
	@Override
	public int getNumberOfWheels()
	{
		return 1;
	}
}
