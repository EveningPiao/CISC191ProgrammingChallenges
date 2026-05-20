package edu.sdmesa.cisc191;
/**
 * Lead Author(s):TianLin Zhao
 * Version/date:
 * 
 * Responsibilities of class: Consumes (pops) String elements from the top of a Stack.
 */
import java.util.Stack;

public class StringStackConsumer implements Consumer<String>
{
	// A StackConsumer has-many Strings stored in a Stack
	private Stack<String> strings;
 
	public StringStackConsumer(Stack<String> initialStrings)
	{
		this.strings = initialStrings;
	}
 
	@Override
	public String consume()
	{
		// Return null if the stack is empty 
		if (strings.isEmpty())
		{
			return null;
		}
		// Pop and return the top element of the Stack
		return strings.pop();
	}
}
