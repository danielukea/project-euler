package com.luke.project_euler;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class FibonacciUtilsTest {

	@Test
	void testGenerateFibonacciArray() {

		int[] expected = { 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 };
		int[] actual = FibonacciUtils.generateFibonacciArray(10);

		Assertions.assertThat(actual).isEqualTo(expected);
	}

	@Test
	void testGenerateFibonacciMaxValueUnder() {
		
		int[] expected = { 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 };
		int[] actual = FibonacciUtils.generateFibonacciMaxValueUnder(89);
		
		Assertions.assertThat(actual).isEqualTo(expected);
	}
}
