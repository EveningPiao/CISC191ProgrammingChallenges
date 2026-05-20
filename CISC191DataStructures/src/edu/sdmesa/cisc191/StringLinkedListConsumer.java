package edu.sdmesa.cisc191;
/**
 * Lead Author(s):TianLin Zhao
 * Version/date:
 * 
 * Responsibilities of class: Consumes (removes) String elements from a LinkedList from the front of the list.
 */
import java.util.LinkedList;

public class StringLinkedListConsumer implements Consumer<String>
{
	// A LinkedListConsumer has-many Strings stored in a LinkedList
	private LinkedList<String> strings;
 
	public StringLinkedListConsumer(LinkedList<String> initialStrings)
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
		// Remove and return the first element to maintain FIFO order
		return strings.removeFirst();
	}
}
