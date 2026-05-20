package cisc191.sdmesa.edu;
 
/**
 * Lead Author(s):TianLin Zhao
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * Version/date: 4/21/2026
 * Responsibilities of class:
 * A BikeShop has a name and maintains an inventory of Cycles
 */
public class BikeShop
{
	private String name;
	// Cycles in inventory
	private Cycle[] inventory;
 
	// How many bikes are currently in inventory
	private int numberOfBikes;
 
	/**
	 * Constructor: creates a BikeShop with the given name
	 * @param name the shop's name
	 */
	public BikeShop(String name)
	{
		this.name = name;
		// Initialize inventory with capacity
		this.inventory = new Cycle[10];
		this.numberOfBikes = 0;
	}
 
	/**
	 * @return the name of this bike shop
	 */
	public String getName()
	{
		return name;
	}
 
	/**
	 * @return the number of bikes currently in inventory
	 */
	public int getNumberOfBikesInInventory()
	{
		return numberOfBikes;
	}
 
	/**
	 * Adds a Cycle to the shop's inventory
	 * @param cycle the cycle to add
	 */
	public void addToInventory(Cycle cycle)
	{
		// Resize
		if (numberOfBikes >= inventory.length)
		{
			Cycle[] bigger = new Cycle[inventory.length * 2];
			for (int i = 0; i < inventory.length; i++)
			{
				bigger[i] = inventory[i];
			}
			inventory = bigger;
		}
		inventory[numberOfBikes] = cycle;
		numberOfBikes++;
	}
 
	/**
	 * @return string containing the shop name and all cycles in inventory
	 */
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(name).append("\n");
		for (int i = 0; i < numberOfBikes; i++)
		{
			sb.append(inventory[i].toString()).append("\n");
		}
		return sb.toString();
	}
}
