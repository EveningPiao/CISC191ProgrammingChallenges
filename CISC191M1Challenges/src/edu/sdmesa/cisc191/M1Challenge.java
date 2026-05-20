package edu.sdmesa.cisc191;

/**
 * Lead Author(s):
 * TianLin Zhao
 * <<add additional lead authors here, with a full first and last name>>
 * 
 * Other contributors:
 * <<add additional contributors (mentors, tutors, friends) here, with contact
 * information>>
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem
 * Solving.
 * Retrieved from
 * https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * <<add more references here>>
 * 
 * Version/date: 3/8/2026
 * 
 * Responsibilities of class:
 * 
 */

// See INSTRUCTIONS in TestM1Challenge

public class M1Challenge {
	/**
	 * Purpose: add two numbers
	 * 
	 * @param a one number
	 * @param b another number
	 * @return the sum of a and b
	 */
	public static int add(int a, int b) {
		return a + b;
	}

	/**
	 * Purpose: multiply two numbers
	 * 
	 * @param a one number
	 * @param b another number
	 * @return the product of a and b
	 */
	public static int multiply(int a, int b) {
		// TODO: change this to make the tests pass
		return a * b;
	}

	/**
	 * Purpose: return the first element in the array given
	 * 
	 * @param array to search
	 * @return first element
	 */
	public static int getFirst(int[] array) {
		// TODO: change this method to make the tests pass
		return array[0];
	}

	/**
	 * Purpose: return the last element in the array given
	 * 
	 * @param array to search
	 * @return last element
	 */
	public static int getLast(int[] array) {
		// TODO: change this method to make the tests pass
		return array[array.length - 1];
	}

	/**
	 * Purpose: return the middle element in an array with an odd number of elements
	 * 
	 * @param array to search
	 * @return middle element
	 */
	public static int getMiddle(int[] array) {
		// TODO: change this method to make the tests pass
		return array[array.length / 2];
	}

	/**
	 * Purpose: Find the maximum value in an integer array
	 * 
	 * @param array to search
	 * @return largest value found
	 */
	public static int max(int[] array) {
		int largest = array[0];
		// Start at 1 because we already assumed index 0 is the largest
		for (int i = 1; i < array.length; i++) {
			if (array[i] > largest) {
				largest = array[i];
			}
		}
		return largest;
	}

	/**
	 * Purpose: Find the minimum value in an integer array
	 * 
	 * @param array to search
	 * @return smallest value found
	 */
	public static int min(int[] array) {
		int smallest = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < smallest) {
				smallest = array[i];
			}
		}
		return smallest;
	}

	/**
	 * Purpose: Calculate the sum of all elements in a double array
	 * 
	 * @param array to sum
	 * @return total sum
	 */
	public static double sum(double[] array) {
		double total = 0;
		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
		return total;
	}

	/**
	 * Purpose: Calculate the average of elements in a double array
	 * 
	 * @param array to average
	 * @return the average value
	 */
	public static double average(double[] array) {
		if (array.length == 0)
			return 0;
		// Reusing the sum method to calculate average
		return sum(array) / array.length;
	}
}