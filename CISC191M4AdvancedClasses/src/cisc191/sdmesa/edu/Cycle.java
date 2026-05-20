package cisc191.sdmesa.edu;

import java.awt.Color;

/**
 * Lead Author(s):TianLin Zhao
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * <<add more references here>>
 *  
 * Version/date: 4/20/2026
 * 
 * Responsibilities of class: Abstract superclass representing any cycle
 * 
 */
/**
 * Only change sections that are marked with TODO
 */

public abstract class Cycle
{
	// Cycle make, set at construction
	private String make;
 
	// Cycle unique frame number
	private final String frameNumber;
 
	// Cycle color
	private Color color;
 
	// Static counter generate frame numbers
	private static int nextFrameNumber = 1;
 
	/**
	 * Constructor: assigns the make and stamps a unique frame number
	 * @param newMake the manufacturer/brand of the cycle
	 */
	public Cycle(String newMake)
	{
		this.make = newMake;
 
		// FrameNumber: make + auto-incremented counter 
		this.frameNumber = newMake + nextFrameNumber;
 
		// Increment so the next Cycle object gets a different number
		nextFrameNumber++;
	}
 
	/**
	 * @return the number of wheels this cycle has
	 */
	abstract int getNumberOfWheels();
 
	/**
	 * @return the color of the bike
	 */
	public Color getColor()
	{
		return color;
	}
 
	/**
	 * Changes the color of the bike
	 * @param newColor the new color to set
	 */
	public void setColor(Color newColor)
	{
		this.color = newColor;
	}
 
	/**
	 * @return make or brand that was set when the bike was made
	 */
	public String getMake()
	{
		return make;
	}
 
	/**
	 * @return the unique serial "number" stamped in the frame when the bike was made
	 */
	public String getFrameNumber()
	{
		return frameNumber;
	}
 
	/**
	 * Two cycles are equal only if they are the exact same object (same frame number)
	 * @return true if the frame numbers are the same
	 */
	@Override
	public boolean equals(Object other)
	{
		if (other == null)
		{
			return false;
		}
		if (!(other instanceof Cycle))
		{
			return false;
		}
		Cycle otherCycle = (Cycle) other;
		return this.frameNumber.equals(otherCycle.frameNumber);
	}
 
	/**
	 * @return String describing the object, including frame number and color
	 */
	@Override
	public String toString()
	{
		return frameNumber + " " + color;
	}
}
