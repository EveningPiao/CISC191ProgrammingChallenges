package edu.sdmesa.cisc191;
/**
 * Lead Author(s):TianLin Zhao
 * Version/date:
 * 
 * Responsibilities of class: Produces (enqueues) String elements to the back of a Queue.
 */
import java.util.Queue;

public class StringQueueProducer implements Producer<String>
{
	// A QueueProducer has-many Strings stored in a Queue
	private Queue<String> strings;
 
	public StringQueueProducer(Queue<String> initialStrings)
	{
		this.strings = initialStrings;
	}
 
	@Override
	public void produce(String item)
	{
		// Add item to the back of the Queue (enqueue)
		strings.offer(item);
	}
}
