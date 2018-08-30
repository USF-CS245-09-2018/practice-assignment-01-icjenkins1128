// package edu.usfca.cs.cs245;

public class FibonacciIterative implements Fibonacci{

	// public static void main(String[] args){

	// 	System.out.println(fibonacci(4));

	// }

	public int fibonacci(int n) {

		//array to iterate to find the fibonacci of n. the size of the array is n + 1 to get the actual position of the value
		int[] arr = new int[n + 1];

		//the first two number of the fibonacci sequence have to be 0 and 1
		arr[0] = 0;
		arr[1] = 1;

		//iterates over array starting at position 3 to find the fibonacci value at n
		for(int i = 2; i <= n ; i ++) {

			arr[i] = arr[i - 1] + arr[i - 2];

		}

		//returns the position value at n in the fibonacci sequence
		return arr[n];

	}


	
}