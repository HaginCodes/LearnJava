package com.haginonyango.foreachloop;

public class EnhancedLooper {

	public static void main(String[] args) {
		int cube[]={1,2,3,4,5};
		int total=0;
		
		for(int x: cube){
			total+=x;
		}
		
		System.out.println(total);
	}

}
