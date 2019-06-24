package com.prgs.school;

public class FibonacciNumbers {


	public static int[] getFibonacciNumbers(int range) {
		int[] sequence = new int[range];

		sequence[0] = 1;
		sequence[1] = 1;
		
		
		for(int index = 2; index <range; index++) {
			sequence[index] = sequence[index-1] + sequence[index-2];
		}
		
		return sequence;
	}

}
