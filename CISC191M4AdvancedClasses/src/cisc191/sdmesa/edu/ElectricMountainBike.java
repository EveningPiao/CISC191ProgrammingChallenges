package cisc191.sdmesa.edu;

/**
 * Lead Author(s):TianLin Zhao
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * Version/date: 4/21/2026
 * 
 * Responsibilities of class:
 * ElectricMountainBike is a Bicyle that is Movable, Gearable, and Electric
 */

//ElectricMountainBike IS Movable (implements interface)
//ElectricMountainBike IS Gearable (implements interface)
//ElectricMountainBike IS Chargeable (implements interface)
public class ElectricMountainBike extends Bicycle implements Movable, Gearable, Chargeable
{
	//ElectricMountainBike current gear, speed, charge level
	private int gear;
	private int speed;
	private int charge;

	/**
	 * Constructor: creates an ElectricMountainBike with the given make
	 * @param newMake the brand/manufacturer
	 */
	public ElectricMountainBike(String newMake)
	{
		// Call Bicycle constructor
		super(newMake);
		
		this.gear = 1;
		this.speed = 0;

		this.charge = 0;
	}

	/**
	 * An ElectricMountainBike has two wheels 
	 * @return 2
	 */
	@Override
	public int getNumberOfWheels()
	{
		return 2;
	}

	// --- Gearable implementation ---

	/**
	 * @return the current gear
	 */
	@Override
	public int getGear()
	{
		return gear;
	}

	/**
	 * Shifts up one gear
	 */
	@Override
	public void gearUp()
	{
		gear++;
	}

	/**
	 * Shifts down one gear
	 */
	@Override
	public void gearDown()
	{
		if (gear > 1)
		{
			gear--;
		}
	}

	/**
	 * @return the current speed
	 */
	@Override
	public int getSpeed()
	{
		return speed;
	}

	/**
	 * Increases speed by 1
	 */
	@Override
	public void speedUp()
	{
		speed++;
	}

	/**
	 * Decreases speed by 2
	 */
	@Override
	public void slowDown()
	{
		speed -= 2;
		if (speed < 0)
		{
			// Speed cannot be negative
			speed = 0;
		}
	}

	/**
	 * @return the current charge percentage
	 */
	@Override
	public int getCharge()
	{
		return charge;
	}

	/**
	 * Charges to the given percentage
	 * @param percent the target charge level
	 */
	@Override
	public void chargeTo(int percent)
	{
		if (percent > 100)
		{
			// Charge percent cannot greater than 100
			charge = 100;
		}
		else
		{
			charge = percent;
		}
	}
}
