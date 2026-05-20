package edu.sdmesa.cisc191;
 
import java.util.Hashtable;
 
/**
 * Lead Author(s):TianLin Zhao
 * 
 * Version/date: 5/5/2026
 * 
 * Responsibilities of class:
 * Stores associations between a person's name and their phone number,
 * supporting lookup, update, and removal operations.
 */
public class PhoneDirectory
{
	// A PhoneDirectory has-many name/number associations stored in a Hashtable
	private Hashtable<String, Integer> directory;
 
	public PhoneDirectory()
	{
		directory = new Hashtable<String, Integer>();
	}
 
	/**
	 * Associates the given phone number with the given person's name.
	 * If the person already exists in the directory, their number is updated.
	 * 
	 * @param name   the person's name (key)
	 * @param number the phone number (value)
	 */
	public void setNumberForPerson(String name, int number)
	{
		directory.put(name, number);
	}
 
	/**
	 * Finds the phone number associated with the given name.
	 * 
	 * @param name the person's name
	 * @return the phone number, or null if the name is not in the directory
	 */
	public Integer findNumberForPerson(String name)
	{
		return directory.get(name);
	}
 
	/**
	 * Removes the entry for the given name from the directory.
	 * 
	 * @param name the person's name to remove
	 */
	public void forget(String name)
	{
		directory.remove(name);
	}
 
}
