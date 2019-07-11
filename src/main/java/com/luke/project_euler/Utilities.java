package com.luke.project_euler;

import java.util.ArrayList;

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
			sum -= sumOfMultipleUnder(limit - 1, one*two);
		
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
	 * Returns an array which contains only evens with the size reduced appropriately
	 * O(N)
	 * @param arr
	 * @return
	 */
	public static int[] findEvens(int[] arr) {
		ArrayList<Integer> evens = new ArrayList<>();
		
		for(int each : arr) {
			if(each % 2 == 0)
				evens.add(each);
		}
		
		return evens.stream().mapToInt(e->e.intValue()).toArray();
		
	}
	
	

}
