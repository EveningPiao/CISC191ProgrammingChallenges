package cisc191.sdmesa.edu;
 
/**
 * Lead Author(s):TianLin Zhao
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * Version/date: 4/21/2026
 * Responsibilities of interface:
 * Defines behavior for electrically chargeable objects
 */
public interface Chargeable
{
	/**
	 * @return current charge percentage
	 */
	int getCharge();
 
	/**
	 * Charges the object to the given percentage
	 * @param percent the target charge level
	 */
	void chargeTo(int percent);
}
