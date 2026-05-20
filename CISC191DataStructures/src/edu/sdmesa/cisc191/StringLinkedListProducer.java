package edu.sdmesa.cisc191;
/**
 * Lead Author(s):TianLin Zhao
 * Version/date:
 * 
 * Responsibilities of class: Produces (adds) String elements to a LinkedList at the end of the list.
 */
import java.util.LinkedList;

public class StringLinkedListProducer implements Producer<String>
{
	// A LinkedListProducer has-many Strings stored in a LinkedList
	private LinkedList<String> strings;
 
	public StringLinkedListProducer(LinkedList<String> initialStrings)
	{
		this.strings = initialStrings;
	}
 
	@Override
	public void produce(String item)
	{
		// Add item to the end of the LinkedList
		strings.add(item);
	}
}