// package edu.usfca.cs.cs245;

public class FactorialIterative implements Factorial{

	// public static void main(String[] args) {

	// 	System.out.println(factorial(4));

	// }

	public int factorial(int n) {

		int x = n;
		//iterate backwards to find the factorial starting at n - 1 b/c we need to multiply the all of the descending values
		for(int i = n -1; i > 0; i --) {
			x *= i;
		}

		return x;

	}


}