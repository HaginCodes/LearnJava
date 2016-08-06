package com.haginonyango.variable.length.arguments;

public class VariableLengthArgs {

	public static void main(String[] args) {
	
		System.out.println(average(23,34,56,76,86,23,54,23,12));

	}
	
	public static int average(int...numbers){
		int total=0;
		for(int x: numbers)
			total+=x;
			
			return total/numbers.length;
		
	}

}
