package com.luke.project_euler;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class UtilitiesTest {

	@ParameterizedTest
	@CsvSource({ "23, 10", "233168, 1000" })
	void testSumIntMultiples(int answer, int input) {
		Assertions.assertThat(Utilities.sumOfMultipleMultiplesUnder(input, 3, 5)).isEqualTo(answer);
	}

	@ParameterizedTest
	@CsvSource({ "6, 5"})
	void testSumOfMultipleUnder(int answer, int input) {
		Assertions.assertThat(Utilities.sumOfMultipleUnder(input, 2)).isEqualTo(answer);
	}
	
	
	void testFindEvens() {
		int[] input = {1,4,3,2,8};
		
		int[] expected = {4,2,8};
		
		Assertions.assertThat(Utilities.findEvens(input)).isEqualTo(expected);
	}

}
