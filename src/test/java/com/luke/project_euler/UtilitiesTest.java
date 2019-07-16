package com.luke.project_euler;

import java.util.stream.Stream;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

class UtilitiesTest {

	@ParameterizedTest
	@CsvSource({ "23, 10", "233168, 1000" })
	void testSumIntMultiples(int answer, int input) {
		Assertions.assertThat(Utilities.sumOfMultipleMultiplesUnder(input, 3, 5)).isEqualTo(answer);
	}

	@ParameterizedTest
	@CsvSource({ "6, 5" })
	void testSumOfMultipleUnder(int answer, int input) {
		Assertions.assertThat(Utilities.sumOfMultipleUnder(input, 2)).isEqualTo(answer);
	}

	void testFindEvens() {
		int[] input = { 1, 4, 3, 2, 8 };

		int[] expected = { 4, 2, 8 };

		Assertions.assertThat(Utilities.findEvens(input)).isEqualTo(expected);
	}

	@Test
	void testFindFactors() {
		long input = 10;
		long[] expected = { 1L, 2L, 5L, 10L };

		Assertions.assertThat(Utilities.findFactors(input)).isEqualTo(expected);
	}

	@ParameterizedTest
	@MethodSource("createFactorsInput")
	void findFactorsLessThanShouldReturnExpected(long[] expected, int input) {

		long ceiling = 20;

		Assertions.assertThat(Utilities.findFactorsLessThan(input, ceiling + 1)).isEqualTo(expected);
	}

	private static Stream<Arguments> createFactorsInput() {
		long[] expected1 = { 1, 10, 2, 5 };
		long[] expected2 = { 1, 15, 3, 5 };
		long[] expected3 = { 1, 20, 2, 10, 4, 5 };
		long[] expected4 = { 2, 15, 3, 10, 5, 6 };

		return Stream.of(Arguments.of(expected1, 10), //
				Arguments.of(expected2, 15),//
				Arguments.of(expected3, 20),//
				Arguments.of(expected4, 30));
	}

	@ParameterizedTest
	@ValueSource(ints = { 9009, 1, 22, 232, 123454321, 9009, 906609 })
	void isPalindromeShouldReturnTrue(int number) {

		Assertions.assertThat(Utilities.isPalindrome(number)).isTrue();
	}

	@ParameterizedTest
	@ValueSource(ints = { 900, -10, 122, 300, 10002 , 997997})
	void isPalindromeShouldReturnFalse(int number) {

		Assertions.assertThat(Utilities.isPalindrome(number)).isFalse();
	}

	@Test
	void maxIndexShouldReturnZero() {

		long[] arr = { 5L, 1L, 0L, 4L, -6L };

		Assertions.assertThat(Utilities.maxIndex(arr)).isEqualTo(0);
	}
	
	@ParameterizedTest
	@CsvSource({"4,5,20","1,10,2520"})
	void evenlyDivisibleByRangeShouldReturnExpected(int low,int high,int expected){
		
		Assertions.assertThat(Utilities.evenlyDivisibleByRange(low, high)).isEqualTo(expected);
	}

}
