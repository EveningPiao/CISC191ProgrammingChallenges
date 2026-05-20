package cisc191.sdmesa.edu;

/**
 * Lead Author(s):TianLin Zhao
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * Version/date: 4/21/2026
 * 
 * Responsibilities of interface: 
 * Defines behavior for objects that have gears
 */
public interface Gearable
{
	/**
	 * @return the gear that object is currently in
	 */
	int getGear();
 
	/**
	 * Shifts up one gear
	 */
	void gearUp();
 
	/**
	 * Shifts down one gear
	 */
	void gearDown();
}