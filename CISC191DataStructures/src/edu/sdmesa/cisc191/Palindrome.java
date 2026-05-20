package edu.sdmesa.cisc191;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome
{
	public static boolean isPalindrome(char[] letters)
	{
		// Use a Queue and a Stack to see if the letters
		// are the same front-to-back and back-to-front
		Stack<Character> stack = new Stack<Character>();
		Queue<Character> queue = new LinkedList<Character>();
		
		// Add the characters to the Stack and Queue data structures
		for (char letter : letters)
		{
			stack.push(letter);
			queue.offer(letter);
		}
		
		// Remove all the characters one at a time from the Stack and Queue
		//    in each iteration of the loop
		while (!stack.isEmpty() && !queue.isEmpty())
		{
			// Stack removes from the "top" (last added / back of sequence)
			// Queue removes from the "bottom" (first added / front of sequence)
			char fromStack = stack.pop();
			char fromQueue = queue.poll();
			
			// Check if the characters removed from both data structures are the same
			if (fromStack != fromQueue)
			{
				return false;
			}
		}
		
		return true;
	}
	
}
