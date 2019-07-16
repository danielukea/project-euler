package com.luke.project_euler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Utilities {

	private Utilities() {
		throw new IllegalStateException();
	}

	/**
	 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we
	 * get 3, 5, 6 and 9. The sum of these multiples is 23.
	 * 
	 * O(N)
	 * 
	 * @param startingFrom
	 * @return
	 */
	public static int sumOfMultipleMultiplesUnder(int limit, int one, int two) {

		int sum = 0;

		sum += sumOfMultipleUnder(limit - 1, one);
		sum += sumOfMultipleUnder(limit - 1, two);
		sum -= sumOfMultipleUnder(limit - 1, one * two);

		return sum;

	}

	/**
	 * Takes the sum of the multiples
	 * 
	 * O(N)
	 * 
	 * @param limit
	 * @param multiple
	 * @return
	 */
	public static int sumOfMultipleUnder(int limit, int multiple) {
		int sum = 0;
		for (int i = 0; i <= limit / multiple; i++)
			sum += i;
		return sum * multiple;
	}

	/**
	 * Returns an array which contains only evens with the size reduced
	 * appropriately O(N)
	 * 
	 * @param arr
	 * @return
	 */
	public static int[] findEvens(int[] arr) {
		ArrayList<Integer> evens = new ArrayList<>();

		for (int each : arr) {
			if (each % 2 == 0)
				evens.add(each);
		}

		return evens.stream().mapToInt(e -> e.intValue()).toArray();

	}

	/**
	 * Determines the factors in the number
	 * 
	 * @param number
	 * @return array of the factors of the input
	 */
	public static long[] findFactors(long number) {
		Stack<Long> factorStack = new Stack<>();
		ArrayList<Long> factors = new ArrayList<>();
		long counter = 1;
		boolean isDone = false;

		factorStack.push(counter);
		factors.add(counter);

		while (!isDone) {
			counter++;
			long mod = number % counter;

			if (mod == 0) {
				long next = number / counter;
				if (factorStack.peek() == next) {
					isDone = true;
				} else {

					factorStack.push(counter);
					factors.add(counter);
					factors.add(next);
				}

			}

		}
		factors.add(number);
		return factors.stream().mapToLong(i -> i).toArray();

	}

	/**
	 * @param number
	 * @return find the factors which are less than the ceiling.
	 */
	public static long[] findFactorsLessThan(long number, long ceiling) {

		long[] factors = findFactors(number);
		Arrays.sort(factors);

		long factor = number;
		ArrayList<Long> factorsLessThanCeiling = new ArrayList<>();

		for (int i = 0; i < (factors.length / 2); i++) {
			factor = number / factors[i];

			if (factors[i] < ceiling && factor < ceiling) {
				factorsLessThanCeiling.add(factors[i]);
				factorsLessThanCeiling.add(factor);
			}
		}

		return factorsLessThanCeiling.stream().mapToLong(i -> i).toArray();
	}

	/**
	 * @param number
	 * @return true if number is a palindrome
	 */
	public static boolean isPalindrome(long number) {
		Stack<Character> stack = new Stack<>();
		char[] num = Long.toString(number).toCharArray();

		if (num.length == 1)
			return true;

		for (int i = 0; i < num.length; i++) {

			if (num.length % 2 != 0) {
				if (i == num.length / 2 + 1) {
					stack.pop();
				}
			}

			if (i > (num.length - 1) / 2) {
				if (!stack.isEmpty() && stack.peek() == num[i]) {
					stack.pop();
				} else {
					stack.push(num[i]);
				}
			} else {
				stack.push(num[i]);
			}

		}

		if (stack.isEmpty())
			return true;
		else
			return false;
	}

	/**
	 * @param arr
	 * @return index of the max value of the array
	 */
	public static int maxIndex(long[] arr) {
		int index = 0;
		long max = arr[index];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				index = i;
			}
		}

		return index;
	}

	/**
	 * @param low  in range
	 * @param high in range
	 * @return the number whihc is evenly divisible by every number in low to high
	 */
	public static long evenlyDivisibleByRange(int low, int high) {

		boolean notDivisible = true;
		int counter = high;
		main: while (notDivisible) {

			for (int i = high; i >= low; i--) {
				if (counter % i != 0) {
					counter++;
					continue main;
				}
			}
			notDivisible = false;
		}

		return counter;
	}

}
