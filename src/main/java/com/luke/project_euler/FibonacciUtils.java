package com.luke.project_euler;

import java.util.ArrayList;

/**
 * Utility class for fibonacci utils.
 * 
 * @author ladan
 *
 */
public class FibonacciUtils {
	
	public static int[] generateFibonacciArray(int i) {

		int[] arr = new int[i];
		arr[0] = 1;
		arr[1] = 2;
		int counter = 2;
		
		while(counter < arr.length) {
			arr[counter] += arr[counter - 1] + arr[counter - 2];
			counter++;
		}
			
		return arr;
	}
	
	
	public static int[] generateFibonacciMaxValueUnder(int i) {
		ArrayList<Integer> arr = new ArrayList<>();

		arr.add(1);
		arr.add(2);
		int counter = 2;
		int nextValue = 0;
		while(nextValue < i) {
			nextValue = arr.get(counter - 1) + arr.get(counter -2);
			arr.add(nextValue);
			counter++;
		}
			
		return arr.stream().mapToInt(Integer::intValue).toArray();
	}



}
