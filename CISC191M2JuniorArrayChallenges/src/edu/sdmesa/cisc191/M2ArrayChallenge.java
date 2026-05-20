package edu.sdmesa.cisc191;

/**
 * Lead Author(s):
 * TianLin Zhao
 * <<add additional lead authors here, with a full first and last name>>
 * 
 * Other contributors:
 * <<add additional contributors (mentors, tutors, friends) here, with contact information>>
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * <<add more references here>>
 *  
 * Version/date: 3/11/2026
 * 
 * Responsibilities of class:
 * 
 */
/**
 */
public class M2ArrayChallenge {
	/**
	 * Purpose: Find a given value in the array given
	 * 
	 * @param array to search
	 * @param value to look for
	 * @return true if the value is in the array, otherwise false
	 */
	public static boolean contains(char[] array, char value) {
		for (char element : array) {
			if (element == value)
				return true;
		}
		return false;
	}

	/**
	 * Purpose: Find the index of a value in an array
	 * 
	 * @param array to search
	 * @param value to look for
	 * @return the index or -1 if not found
	 */
	public static int find(char[] array, char value) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == value)
				return i;
		}
		return -1;
	}

	/**
	 * Purpose: Count occurrences of a specific char
	 * 
	 * @param array to search
	 * @param value to count
	 * @return the number of times the value appears in the array
	 */
	public static int countValues(char[] array, char value) {
		int count = 0;
		for (char element : array) {
			if (element == value)
				count++;
		}
		return count;
	}

	/**
	 * Purpose: Check if array is sorted from least to greatest
	 * 
	 * @param array to check
	 * @return true if the array is sorted, otherwise false
	 */
	public static boolean inOrder(char[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			// if current element is greater than the next element, it's not in order
			if (array[i] > array[i + 1])
				return false;
		}
		return true;
	}

	/**
	 * Purpose: Swaps element at index with index + 1
	 * 
	 * @param array to change
	 * @param index of the element to swap
	 */
	public static void swapElements(char[] array, int index) {
		// use a temporary variable to hold the value
		char temp = array[index];
		// swap the values
		array[index] = array[index + 1];
		array[index + 1] = temp;
	}

	/**
	 * Purpose: One pass of bubble sort (swaps adjacent unsorted pairs)
	 * 
	 * @param array to sort
	 */
	public static void bubbleUp(char[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			// if current element is greater than the next element, swap them
			if (array[i] > array[i + 1]) {
				swapElements(array, i);
			}
		}
	}

	/**
	 * Purpose: Full bubble sort using inOrder and bubbleUp
	 * 
	 * @param array to sort
	 */
	public static void bubbleSort(char[] array) {
		while (!inOrder(array)) {
			bubbleUp(array);
		}
	}

	/**
	 * Purpose: Returns a deep copy of the array
	 * 
	 * @param array to copy
	 * @return a new array with the same contents
	 */
	public static char[] copy(char[] array) {
		char[] newArray = new char[array.length];
		// copy each element from the original array to the new array
		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		}
		return newArray;
	}

	/**
	 * Purpose: Compare contents of two arrays for equality
	 * 
	 * @param array1 to compare
	 * @param array2 to compare
	 * @return true if arrays have same length and same elements in same order,
	 *         otherwise false
	 */
	public static boolean arrayElementsEqual(char[] array1, char[] array2) {
		// check if the length is different
		if (array1.length != array2.length) {
			return false;
		}
		for (int i = 0; i < array1.length; i++) {
			// check if any element is different
			if (array1[i] != array2[i]) {
				return false;
				}
		}
		return true;
	}

	/**
	 * Purpose: Return a new array with elements in reverse order
	 * 
	 * @param array to reverse
	 * @return a new array with the same elements but in reverse order
	 */
	public static char[] backwards(char[] array) {
		char[] result = new char[array.length];
		// copy elements from the original array to the new array in reverse order
		for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
			result[i] = array[j];
		}
		return result;
	}

	/**
	 * Purpose: Check if array reads same forward and backward
	 * 
	 * @param array to check
	 * @return true if the array is a palindrome, otherwise false
	 */
	public static boolean isPalindrome(char[] array) {
		char[] reversed = backwards(array);
		// check if the original array and the reversed array are equal
		return arrayElementsEqual(array, reversed);
	}

	/**
	 * Purpose: Retrieve 2D array element at specific row/col
	 * 
	 * @param matrix to search
	 * @param row    index of the element
	 * @param col    index of the element
	 * @return the value at the specified row and column
	 */
	public static int getElement(int[][] matrix, int row, int col) {
		return matrix[row][col];
	}

	/**
	 * Purpose: Sum all values in a specific row
	 * 
	 * @param matrix to search
	 * @param row    index of the row to sum
	 * @return the sum of the values in the specified row
	 */
	public static int addRow(int[][] matrix, int row) {
		int sum = 0;
		for (int col = 0; col < matrix[row].length; col++) {
			sum += matrix[row][col];
		}
		return sum;
	}

	/**
	 * Purpose: Sum all values in a specific column
	 * 
	 * @param matrix to search
	 * @param col    index of the column to sum
	 * @return the sum of the values in the specified column
	 */
	public static int addColumn(int[][] matrix, int col) {
		int sum = 0;
		for (int row = 0; row < matrix.length; row++) {
			sum += matrix[row][col];
		}
		return sum;
	}

	/**
	 * Purpose: Sum the diagonal from top-left to bottom-right
	 * 
	 * @param matrix to search
	 * @return the sum of the values in the left-to-right diagonal
	 */
	public static int addLeftToRightDiagonal(int[][] matrix) {
		int sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			sum += matrix[i][i];
		}
		return sum;
	}

	/**
	 * Purpose: Sum the diagonal from top-right to bottom-left
	 * 
	 * @param matrix to search
	 * @return the sum of the values in the right-to-left diagonal
	 */
	public static int addRightToLeftDiagonal(int[][] matrix) {
		int sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			// column index decreases as row index increases
			sum += matrix[i][matrix.length - 1 - i];
		}
		return sum;
	}

	/**
	 * Purpose: Sum the last element of every row (handles ragged arrays)
	 * 
	 * @param matrix to search
	 * @return the sum of the last element in each row
	 */
	public static int addLastRowElement(int[][] matrix) {
		int sum = 0;
		for (int row = 0; row < matrix.length; row++) {
			// get the index of the last column in the current row
			int lastCol = matrix[row].length - 1;
			sum += matrix[row][lastCol];
		}
		return sum;
	}

	/**
	 * Purpose: Sum every single integer in the 2D array
	 * 
	 * @param matrix to search
	 * @return the sum of all values in the matrix
	 */
	public static int addAll(int[][] matrix) {
		int sum = 0;
		// iterate through each row to add all elements
		for (int row = 0; row < matrix.length; row++) {
			// iterate through each column in the current row
			for (int col = 0; col < matrix[row].length; col++) {
				sum += matrix[row][col];
			}
		}
		return sum;
	}
}
