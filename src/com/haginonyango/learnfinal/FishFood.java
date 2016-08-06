package com.haginonyango.learnfinal;

public class FishFood {
	
	private int sum;
	private final int NUMBER;
	
	public FishFood(int x){
		NUMBER = x;
	}
	public void add(){
		sum+=NUMBER;
	}
	public String toString(){
		return String.format("sum = %d\n", sum);
	}

}
