package edu.sdmesa.cisc191;

import java.util.*;

/**
 * Lead Author(s):TianLin Zhao
 * 
 * References:
 *         Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 *         Retrieved from
 *         https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 *         <<add more references here>>
 * 
 * Version/date:5/19/2026
 * 
 * Responsibilities of class:
 * Use recursion to solve various problems including:
 * arithmetic series, Lucas numbers, list construction, list reversal,
 * the Collatz conjecture sequence, compound interest, and logistic population growth.
 */
public class Recursion
{
	/**
	 * Add n to the sum of all integers less than n (but not negative)
	 * @param n
	 * @return the sum of n+(n-1)+...+1
	 */
	public static int addLess(final int n)
	{
		if (n <= 0)
		{
			// Base case: nothing to add
			return 0;
		}
		else
		{
			// Recursive case: n + sum of integers less than n
			return n + addLess(n - 1);
		}
	}
	
	/**
	 * Multiply n by the product of all integers less than n down to 1.
	 * This is the factorial function: n!
	 * @param n
	 * @return n * (n-1) * (n-2) * ... * 1
	 */
	public static int multiplyLess(final int n)
	{
		if (n <= 1)
		{
			// Base case: 1! = 1
			return 1;
		}
		else
		{
			// Recursive case: n * (n-1)!
			return n * multiplyLess(n - 1);
		}
	}
	
	/**
	 * Calculate the n'th Lucas number.
	 * L(0) = 2, L(1) = 1, L(n) = L(n-2) + L(n-1)
	 * @param n the number of the Lucas number
	 * @return the n'th Lucas number
	 */
	public static int lucas(final int n)
	{
		switch (n)
		{
			// Base cases
			case 0: return 2;
			case 1: return 1;
			// Recursive case
			default: return lucas(n - 2) + lucas(n - 1);
		}
	}
	
	/**
	 * Build a list of integers from 0 up to and including n.
	 * @param n the ending value (inclusive)
	 * @return a list containing 0, 1, 2, ..., n
	 */
	public static LinkedList<Integer> range(int n)
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		if (n < 0)
		{
			// Base case: empty list
			return list;
		}
		else if (n == 0)
		{
			// Base case: list with only 0
			list.add(0);
			return list;
		}
		else
		{
			// Recursive case: range(0..n-1) followed by n
			list.addAll(range(n - 1));
			list.add(n);
			return list;
		}
	}
	
	/**
	 * Build a list of integers from "from" up to and including "to".
	 * @param from the starting value (inclusive)
	 * @param to the ending value (inclusive)
	 * @return a list containing from, from+1, ..., to
	 */
	public static LinkedList<Integer> range(int from, int to)
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		if (from > to)
		{
			// Base case: empty list (invalid range)
			return list;
		}
		else if (from == to)
		{
			// Base case: single element
			list.add(from);
			return list;
		}
		else
		{
			// Recursive case: first element, then the rest of the range
			list.add(from);
			list.addAll(range(from + 1, to));
			return list;
		}
	}
	
	/**
	 * Reverse the order of the elements in a list using recursion.
	 * @param list the list to reverse
	 * @return a new list with the elements in reverse order
	 */
	public static LinkedList<Integer> reverse(LinkedList<Integer> list)
	{
		LinkedList<Integer> reversed = new LinkedList<Integer>();
		if (list.size() <= 1)
		{
			// Base case: empty or single-element list is its own reverse
			reversed.addAll(list);
			return reversed;
		}
		else
		{
			// Recursive case: last element first, then reverse of everything else
			reversed.add(list.get(list.size() - 1));
			reversed.addAll(reverse(new LinkedList<Integer>(list.subList(0, list.size() - 1))));
			return reversed;
		}
	}
	
	/**
	 * Calculate the next Collatz number.
	 * If n is even, return n/2.
	 * If n is odd, return 3n+1.
	 * @param n the number to calculate from
	 * @return the next number in the Collatz sequence
	 */
	public static int nextCollatzNumber(int n)
	{
		if (n % 2 == 0)
		{
			// Even: divide by 2
			return n / 2;
		}
		else
		{
			// Odd: 3n+1
			return 3 * n + 1;
		}
	}
	
	/**
	 * Calculate an entire Collatz sequence given a starting number.
	 * The sequence stops at 1.
	 * @param n starting number
	 * @return list of Collatz numbers starting with n and ending with 1
	 */
	public static LinkedList<Integer> collatzList(int n)
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		if (n == 1)
		{
			// Base case: sequence ends at 1
			list.add(1);
			return list; 
		}
		else
		{
			// Recursive case: n followed by the rest of the sequence
			list.add(n);
			list.addAll(collatzList(nextCollatzNumber(n)));
			return list;
		}
	}
	
	/**
	 * Calculate the end balance given a starting balance, an interest rate
	 * (given as a decimal) and the number of times interest is added.
	 *
	 * Formula:
	 *   balance(0) = startBalance
	 *   balance(n+1) = balance(n) + interestRate * balance(n)
	 *
	 * @param startBalance for the first period
	 * @param interestRate how much interest the money accrues each period; constant for all periods
	 * @param periods how many periods the money is invested (how many times interest is added; measured in months or years)
	 * @return ending balance how much is returned at the end of the last period
	 */
	public static double calculateEndBalance(final double startBalance,
			final double interestRate, final int periods)
	{
		if (periods == 0)
		{
			// Base case: no interest applied yet
			return startBalance;
		}
		else
		{
			// Recursive case:
			// Calculate the end balance for the first periods-1 periods.
			double startBalanceForNthPeriod = calculateEndBalance(startBalance, interestRate, periods - 1);
			// Then add interest for the current period.
			return startBalanceForNthPeriod + interestRate * startBalanceForNthPeriod;
		}
	}
 
	/**
	 * Calculate the ending population using a logistic growth model.
	 *
	 * Formula:
	 *   population(0) = startPopulation
	 *   growthRate(n+1) = startGrowthRate * (1 - population(n) / maxPopulation)
	 *   population(n+1) = population(n) + growthRate(n+1) * population(n)
	 *
	 * @param startPopulation the starting population
	 * @param maxPopulation the maximum population that the environment will sustain
	 * @param startGrowthRate starting growth rate, 0 < growthRate < 1
	 * @param periods that the population lives (number of days, months, or years)
	 * @return the ending population
	 */
	public static int calculateEndPopulation(final int startPopulation,
											 final int maxPopulation, final double startGrowthRate, final int periods)
	{
		if (periods == 0)
		{
			// Base case: no growth yet
			return startPopulation;
		}
		else
		{
			// Recursive case:
			// Calculate the end population for the first periods-1 periods.
			// The start population for the current period is the end population for the previous period.
			int startPopulationForNthPeriod = calculateEndPopulation(startPopulation, maxPopulation, startGrowthRate, periods - 1);
			// Growth rate changes each period based on how full the environment is.
			double currentGrowthRate = startGrowthRate * (1.0 - (double) startPopulationForNthPeriod / (double) maxPopulation);
			// Add the growth for the current period.
			return (int) (startPopulationForNthPeriod + currentGrowthRate * startPopulationForNthPeriod);
		}
	}
 
}