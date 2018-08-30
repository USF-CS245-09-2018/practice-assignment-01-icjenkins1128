// package edu.usfca.cs.cs245;

public class FibonacciRecursive implements Fibonacci{


	// public static void main(String[] args){

	// 	System.out.println(fibonacci(4));

	// }

	public int fibonacci(int n) {

		//the first two number of the fibonacci sequence have to be 0 and 1
		if(n == 0){
			return n;
		}

		if(n == 1){
			return n;
		}

		//number n is recursively finds the fibonacci of 4
		return fibonacci(n - 1) + fibonacci(n - 2);

	}


	
}