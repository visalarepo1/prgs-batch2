package com.prgs.school;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FibobacciNumbersTest {
	
	@Test
	public void first2FibonacciNumbers() {
		int [] seq = FibonacciNumbers.getFibonacciNumbers(2);
		assertEquals(1, seq[0]);
		assertEquals(1, seq[1]);
	}
	
	@Test
	public void first3FibonacciNumbers() {
		int [] seq = FibonacciNumbers.getFibonacciNumbers(3);
		assertEquals(2, seq[2]);
	}
	
	@Test
	public void first4FibonacciNumbers() {
		int [] seq = FibonacciNumbers.getFibonacciNumbers(4);
		assertEquals(3, seq[3]);
	}

	@Test
	public void first10FibonacciNumbers() {
		int [] seq = FibonacciNumbers.getFibonacciNumbers(10);
		assertEquals(34, seq[8]);
		assertEquals(55, seq[9]);
	}
	
	@Test
	public void first11FibonacciNumbers() {
		int [] seq = FibonacciNumbers.getFibonacciNumbers(11);
		assertEquals(89, seq[10]);
	}
}
