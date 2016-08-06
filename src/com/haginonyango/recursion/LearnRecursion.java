package com.haginonyango.recursion;

public class LearnRecursion {

	public static void main(String[] args) {
		
		System.out.println(fact(21));
		
	}

	// fact 
	public static long fact(long n){
		if(n <= 1)
			return 1;
		else
			return n*fact(n-1);
		
	}
}
