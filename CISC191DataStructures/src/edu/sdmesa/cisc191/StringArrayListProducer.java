package edu.sdmesa.cisc191;
/**
 * Lead Author(s):TianLin Zhao
 * References:
 *         Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 *         Retrieved from
 *         https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 *         <<add more references here>>
 * 
 * Version/date: 5/5/2026
 * 
 * Responsibilities of class: Produces (adds) String elements to an ArrayList, either at the end or at a specified index.
 * 
 */
import java.util.ArrayList;

public class StringArrayListProducer implements Producer<String>
{
	// An ArrayListConsumer has-many Strings
	private ArrayList<String> strings;
	 
	public StringArrayListProducer(ArrayList<String> initialStrings) 
	{
		this.strings = initialStrings;
	}
 
	@Override
	public void produce(String item)
	{
		// Add item to the end of the ArrayList
		strings.add(item);
	}
 
	public void produce(int index, String newString)
	{
		// Insert newString at the specified index in the ArrayList
		strings.add(index, newString);
	}
	
}
