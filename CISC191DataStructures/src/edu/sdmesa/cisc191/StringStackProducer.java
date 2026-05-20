package edu.sdmesa.cisc191;
/**
 * Lead Author(s):TianLin Zhao
 * Version/date:
 * 
 * Responsibilities of class: Produces (pushes) String elements to the top of a Stack.
 */
import java.util.Stack;

public class StringStackProducer implements Producer<String>
{
	// A StackProducer has-many Strings stored in a Stack
	private Stack<String> strings;
 
	public StringStackProducer(Stack<String> initialStrings)
	{
		this.strings = initialStrings;
	}
 
	@Override
	public void produce(String item)
	{
		// Push item onto the top of the Stack
		strings.push(item);
	}
}
