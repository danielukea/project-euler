package com.luke.project_euler;

import java.util.ArrayList;

public class PrimeUtils {

	/**
	 * finds the prime factors of a number
	 * 
	 * @param input
	 * @return
	 */
	public static long[] findPrimeFactors(long input) {

		long[] factors = Utilities.findFactors(input);
		ArrayList<Long> primeFactors = new ArrayList<>();
		for (long each : factors) {
			if (PrimeUtils.isPrime(each))
				primeFactors.add(each);
		}

		return primeFactors.stream().mapToLong( i-> i).toArray();
	}

	/**
	 * O(1) Determines whether or not a number is prime
	 * 
	 * @param number
	 * @return
	 */
	public static boolean isPrime(long number) {
		
		for(int i = 2; i < number; i++) {
			if(number % i == 0) {
				return false;
			}
		}

		return true;
	}

}
