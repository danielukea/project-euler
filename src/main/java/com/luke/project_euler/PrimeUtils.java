package com.luke.project_euler;

public class PrimeUtils {

	/**
	 * finds the prime factors of a number
	 * @param input
	 * @return
	 */
	public static int[] findPrimeFactors(int input) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	/**
	 * O(1)
	 * Determines whether or not a number is prime
	 * @param number
	 * @return
	 */
	public static boolean isPrime(int number) {
		
		if(number == 3 || number == 5 || number == 7)
			return true;
		if(number % 2 == 0)
			return false;
		if(number % 3 == 0)
			return false;
		if(number % 5 == 0)
			return false;
		if(number % 7 == 0)
			return false;
		
		return true;
	}

}
