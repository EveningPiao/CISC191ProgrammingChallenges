package cisc191.sdmesa.edu;

import java.awt.Color;

/**
 * Lead Author(s):
 * TianLin Zhao
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * <<add more references here>>
 *  
 * Version/date: 4/19/2026
 * 
 * Responsibilities of class:
 * Maintain information about a boat, including its make, color, speed, price, serial number, owner, and captain.
 * Provide methods to access and modify these attributes, as well as to increase or decrease the boat's speed and generate a new serial number.
 */

/**
 */
public class Boat {
	// Instance variables 
	private String make;
	private Color color;
	private int speed;
	private int price;
	private int serialNumber;

	// Instance variables for owner and captain
	private Person owner;
	private Person captain;

	// Static variable of the next serial number
	private static int nextSerialNumber = 1;

	// Default Constructor
	public Boat() {
		this.make = null;
		this.color = null;
		this.speed = 0;
		this.price = -1;
		this.serialNumber = createNewSerialNumber();
	}

	// Parameterized Constructor
	public Boat(String newMake, Color newColor) {
		this.speed = 0;
		this.price = -1;
		this.make = newMake;
		this.color = newColor;
		this.serialNumber = createNewSerialNumber();
	}

	// Copy Constructor)
	public Boat(Boat otherBoat) {
		this.make = otherBoat.make;
		this.color = otherBoat.color;
		this.speed = otherBoat.speed;
		this.price = otherBoat.price;
		this.owner = otherBoat.owner;
		this.captain = otherBoat.captain;
		this.serialNumber = createNewSerialNumber();
	}

	// Getter methods
	/**
	 * Purpose: get the make of the boat
	 * 
	 * @return the make of the boat
	 */
	public String getMake() {
		return make;
	}

	/**
	 * Purpose: get the color of the boat
	 * 
	 * @return the color of the boat
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * Purpose: get the speed of the boat
	 * 
	 * @return the speed of the boat
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * Purpose: get the price of the boat
	 * 
	 * @return the price of the boat
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * Purpose: get the serial number of the boat
	 * 
	 * @return the serial number of the boat
	 */
	public int getSerialNumber() {
		return serialNumber;
	}

	/**
	 * Purpose: get the owner of the boat
	 * 
	 * @return the owner of the boat
	 */
	public Person getOwner() {
		return owner;
	}

	/**
	 * Purpose: get the captain of the boat
	 * 
	 * @return the captain of the boat
	 */
	public Person getCaptain() {
		return captain;
	}

	// Setter methods
	/**
	 * Purpose: set the make of the boat
	 * 
	 * @param newColor
	 */
	public void setColor(Color newColor) {
		this.color = newColor;
	}

	/**
	 * Purpose: set the price of the boat
	 * 
	 * @param newPrice
	 */
	public void setPrice(int newPrice) {
		this.price = newPrice;
	}

	/**
	 * Purpose: set the owner of the boat
	 * 
	 * @param newOwner
	 */
	public void setOwner(Person newOwner) {
		this.owner = newOwner;
	}

	/**
	 * Purpose: set the captain of the boat
	 * 
	 * @param newCaptain
	 */
	public void setCaptain(Person newCaptain) {
		this.captain = newCaptain;
	}

	// Other methods
	/**
	 * Purpose: increase the speed of the boat
	 */
	public void speedUp() {
		this.speed++;
	}

	/**
	 * Purpose: decrease the speed of the boat
	 */
	public void slowDown() {
		if (this.speed > 0)
			this.speed--;
	}

	/**
	 * Purpose: create a new serial number for the boat
	 * 
	 * @return the new serial number
	 */
	public static int createNewSerialNumber() {
		return nextSerialNumber++;
	}

	/**
	 * Purpose: override the toString method
	 * 
	 * @return a string representation of the boat
	 */
	@Override
	public String toString() {
		return "Boat: make: " + make + " color: " + color;
	}
}