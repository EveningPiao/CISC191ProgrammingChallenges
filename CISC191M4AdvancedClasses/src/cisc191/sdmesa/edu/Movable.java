package cisc191.sdmesa.edu;

/**
 * Lead Author(s):TianLin Zhao
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * Version/date: 4/21/2026
 * Responsibilities of class:
 * Defines behavior for objects that can move
 */
/**
 */
public interface Movable
{
	/**
	 * @return current speed of the object
	 */
	int getSpeed();
 
	/**
	 * Increases speed by 1
	 */
	void speedUp();
 
	/**
	 * Decreases speed by 2
	 */
	void slowDown();
}