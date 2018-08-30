// package edu.usfca.cs.cs245;

public class FactorialRecursive implements Factorial{

	// public static void main(String[] args){
	// 	System.out.println(factorial(4));
	// }

	public int factorial(int n) {

		//base case is 1 because all facotorials start with a 1
		if(n == 1){

			return 1;

		}

		//recursively returns the factorial of n
		return n * factorial(n - 1);

	}

	
}