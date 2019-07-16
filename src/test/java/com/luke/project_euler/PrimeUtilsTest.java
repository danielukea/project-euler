package com.luke.project_euler;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PrimeUtilsTest {

	@Test
	void testCalcPrimeFactors() {
		long input = 13195;
		long[] expected = {1L, 5L, 7L, 13L, 29L };

		Assertions.assertThat(PrimeUtils.findPrimeFactors(input)).isEqualTo(expected);
	}

	@ParameterizedTest
	@ValueSource(ints = { 3, 5, 7, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 524287 })
	void testIsPrimeShouldReturnTrue(int number) {
		
		Assertions.assertThat(PrimeUtils.isPrime(number)).isTrue();

	}
	
	@ParameterizedTest
	@ValueSource(longs = { 377, 8462696833L })
	void testIsPrimeShouldReturnFalse(long number) {
		
		Assertions.assertThat(PrimeUtils.isPrime(number)).isFalse();

	}
	

}
