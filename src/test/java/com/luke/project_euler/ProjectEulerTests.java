package com.luke.project_euler;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ProjectEulerTests {

	@Test
	void testProblemOne() {

		int input = 1000;
		int expected = 233168;

		Assertions.assertThat(ProjectEuler.problemOne(input)).isEqualTo(expected);
	}
	
	
	@Test
	void testProblemTwo() {
		
		int input = 4000000;
		int expected = 4613732;
		
		Assertions.assertThat(ProjectEuler.problemTwo(input)).isEqualTo(expected);
	}
	
	@Test
	void testProblemThree() {
		long input = 600851475143L;
		int expected = 6857;
		
		Assertions.assertThat(ProjectEuler.problemThree(input)).isEqualTo(expected);
	}
	

}
