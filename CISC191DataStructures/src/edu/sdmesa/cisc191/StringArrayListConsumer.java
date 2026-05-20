package edu.sdmesa.cisc191;
/**
 * Lead Author(s):TianLin Zhao
 * Version/date: 5/5/2026
 * 
 * Responsibilities of class: Consumes (removes) String elements from an ArrayList from the front of the list.
 */
import java.util.ArrayList;

public class StringArrayListConsumer implements Consumer<String>
{
	// An ArrayListConsumer has-many Strings
	private ArrayList<String> strings;
	 
	public StringArrayListConsumer(ArrayList<String> initialStrings) 
	{
		this.strings = initialStrings;
	}
 
	@Override
	public String consume() 
	{
		// Return null if the list is empty
		if (strings.isEmpty())
		{
			return null;
		}
		// Remove and return the first element
		return strings.remove(0);
	}
}
