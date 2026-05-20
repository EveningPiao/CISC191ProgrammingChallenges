package edu.sdmesa.cisc191;
/**
 * Lead Author(s):TianLin Zhao
 * Version/date:
 * 
 * Responsibilities of class: Consumes (dequeues) String elements from the front of a Queue.
 */
import java.util.Queue;

public class StringQueueConsumer implements Consumer<String>
{
	// A QueueConsumer has-many Strings stored in a Queue
	private Queue<String> strings;
 
	public StringQueueConsumer(Queue<String> initialStrings)
	{
		this.strings = initialStrings;
	}
 
	@Override
	public String consume()
	{
		// poll() returns null if the queue is empty, and removes the head otherwise
		return strings.poll();
	}
}
